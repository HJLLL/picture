package com.pic.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.pic.utils.FastJsonResult;
import com.pic.utils.ForAreaToFinish;
import com.pic.utils.GPSConstant;

@Controller
@RequestMapping(value = "/fileController")
public class FileController {

	/**
	 * 上传日志文件
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public FastJsonResult uploads(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setHeader("Access-Control-Allow-Origin", "*");
		int index = 1;
		// 从请求中获取到文件信息需要将请求转换为MultipartHttpServletRequest类型
		String pathRoot = request.getSession().getServletContext().getRealPath("/") + "file\\";
		System.out.println(pathRoot);
		MultipartHttpServletRequest mulRequest = request instanceof MultipartHttpServletRequest
				? (MultipartHttpServletRequest) request : null;
		if (mulRequest == null) {
			return FastJsonResult.build(index, GPSConstant.GPS_FAIL);
		}
		int i = 0;
		CommonsMultipartFile multipartFile = null;
		Iterator<String> fileNames = mulRequest.getFileNames();
		String fileName = "";
		while (fileNames.hasNext()) { // 遍历请求中的图片信息
			i++;
			String inputName = fileNames.next(); // 图片对应的参数名
			multipartFile = (CommonsMultipartFile) mulRequest.getFile(inputName);
			fileName = multipartFile.getFileItem().getName();
			try {
				File file = new File(pathRoot, fileName);
				if (!file.getParentFile().exists()) {
					file.getParentFile().mkdirs();
					file.createNewFile();
				}
				InputStream inputStream = multipartFile.getInputStream();
				byte[] pic = new byte[(int) multipartFile.getSize()];
				inputStream.read(pic);
				FileOutputStream onF = new FileOutputStream(file);
				onF.write(pic);
				inputStream.close();
				onF.flush();
				onF.close();
			} catch (Exception e) {
				return FastJsonResult.build(index, GPSConstant.GPS_FAIL);
			}
		}
		if (i <= 0) {
			return FastJsonResult.build(index, GPSConstant.GPS_FILE_NULL);
		}
		return FastJsonResult.build(fileName);
		// // 如果文件不为空，写入上传路径
		// if (!file.isEmpty()) {
		// // 上传文件路径
		// String path =
		// request.getSession().getServletContext().getRealPath("/") + "file\\";
		// // 上传文件名
		// String filename = file.getOriginalFilename();
		// File filepath = new File(path, filename);
		// // 判断路径是否存在，如果不存在就创建一个
		// if (!filepath.getParentFile().exists()) {
		// filepath.getParentFile().mkdirs();
		// }
		// // 将上传文件保存到一个目标文件当中
		// file.transferTo(new File(path + File.separator + filename));
		// return "success";
		// } else {
		// return "error";
		// }

	}

	/**
	 * 通过文件名加载日志文件计算面积
	 * 
	 * @param request
	 * @param fileName
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getGpsAndArea", method = RequestMethod.POST)
	@ResponseBody
	public FastJsonResult getGpsAndArea(HttpServletRequest request, String fileName, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		String gps = "";
		DecimalFormat df = new DecimalFormat("#.00");
		List list = new ArrayList();// 每组gps分类
		Map<String, Object> retMap = new HashMap<>();
		try {
			String path = request.getSession().getServletContext().getRealPath("/") + "file\\";
			File file = new File(path, fileName);
			if (file.isFile() && file.exists()) {
				InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					String[] tmp = lineTxt.split(",");
					gps += tmp[1] + "," + tmp[2] + ";";
				}
				gps = gps.substring(0, gps.length() - 1);
				br.close();
				String[] splitGpsAll = gps.split(";");
				double[][] db = gpsScreening(splitGpsAll);
				Map<String, Object> map = ForAreaToFinish.ForAreaGps(db, GPSConstant.GPS_AMEND,
						GPSConstant.GPS_MODULUS);
				Object[][] input = (Object[][]) map.get("input");// 筛选过后的gps二维数组点
				gps = (String) map.get("GPS");// 筛选过后的GPS
				String[] split = gps.split(";");
				for (int j = 0; j < split.length; j++) {
					list.add(split[j]);
				}
				retMap.put(GPSConstant.GPS_SPOT, list);
				Map<String, Object> maps = ForAreaToFinish.ForAreaByGps(input, GPSConstant.GPS_AMEND);// gps相对坐标计算（坐标选择）和面积计算
				System.out.println(Double.parseDouble(maps.get("area") + ""));
				double area = Double.parseDouble(maps.get("area") + "") / 666.67;
				retMap.put(GPSConstant.GPS_AREA, df.format(area) + "亩");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return FastJsonResult.build();
		}
		return FastJsonResult.build(retMap);
	}

	/**
	 * 通过传入的GPSString计算面积
	 * 
	 * @param request
	 * @param gpsString
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getAreaByGpsString", method = RequestMethod.POST)
	@ResponseBody
	public FastJsonResult getAreaByGpsString(HttpServletRequest request, String gpsString,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Map<String, Object> retMap = new HashMap<>();
		DecimalFormat df = new DecimalFormat("#.00");
		List list = new ArrayList();// 每组gps分类
		try {
			gpsString.replaceAll("[\\t\\n\\r]", "");
			gpsString = gpsString.replace("\"", "");
			String[] splitGpsAll = gpsString.split(";");
			double[][] db = gpsScreeningTwo(splitGpsAll);
			Map<String, Object> map = ForAreaToFinish.ForAreaGps(db, GPSConstant.GPS_AMEND, GPSConstant.GPS_MODULUS);
			Object[][] input = (Object[][]) map.get("input");// 筛选过后的gps二维数组点
			gpsString = (String) map.get("GPS");// 筛选过后的GPS
			String[] split = gpsString.split(";");
			for (int j = 0; j < split.length; j++) {
				list.add(split[j]);
			}
			retMap.put(GPSConstant.GPS_SPOT, list);
			Map<String, Object> maps = ForAreaToFinish.ForAreaByGps(input, GPSConstant.GPS_AMEND);// gps相对坐标计算（坐标选择）和面积计算
			System.out.println(Double.parseDouble(maps.get("area") + ""));
			double area = Double.parseDouble(maps.get("area") + "") / 666.67;
			retMap.put(GPSConstant.GPS_AREA, df.format(area) + "亩");
		} catch (Exception e) {
			e.printStackTrace();
			return FastJsonResult.build();
		}
		return FastJsonResult.build(retMap);
	}

	/**
	 * gps装载(纬度，经度)
	 * @param splitGpsAll
	 * @return
	 */
	private double[][] gpsScreening(String[] splitGpsAll) {
		double[][] db = new double[splitGpsAll.length][2];
		for (int j = 0; j < splitGpsAll.length; j++) {
			db[j][0] = Double.parseDouble(splitGpsAll[j].split(",")[1]);
			db[j][1] = Double.parseDouble(splitGpsAll[j].split(",")[0]);
		}
		return db;
	}
	/**
	 * gps装载(经度，纬度)
	 * @param splitGpsAll
	 * @return
	 */
	private double[][] gpsScreeningTwo(String[] splitGpsAll) {
		double[][] db = new double[splitGpsAll.length][2];
		for (int j = 0; j < splitGpsAll.length; j++) {
			db[j][0] = Double.parseDouble(splitGpsAll[j].split(",")[0]);
			db[j][1] = Double.parseDouble(splitGpsAll[j].split(",")[1]);
		}
		return db;
	}
/**
103.8892353,30.7914955;
103.8892353,30.7914920;
103.8892418,30.7914842;
103.8892430,30.7914953;
103.8892443,30.7914867;
103.8892422,30.7914753;
103.8892385,30.7914590;
103.8892382,30.7914452;
103.8892390,30.7914407;
103.8892340,30.7914343;
103.8892282,30.7914180;
103.8892200,30.7914020;
103.8892150,30.7913822;
103.8892035,30.7913643;
103.8891855,30.7913465;
103.8891552,30.7913292;
103.8891320,30.7913033;
103.8891115,30.7912740;
103.8890893,30.7912472;
103.8890735,30.7912160;
103.8890627,30.7911848;
103.8890427,30.7911607;
103.8890277,30.7911375;
103.8890130,30.7911105;
103.8889830,30.7910910;
103.8889500,30.7910700;
103.8888942,30.7910747;
103.8888692,30.7910512;
103.8888468,30.7910318;
103.8888263,30.7910100;
103.8888070,30.7909843;
103.8887837,30.7909633;
103.8887623,30.7909383;
103.8887387,30.7909185;
103.8887152,30.7909050;
103.8887103,30.7909085;
103.8887068,30.7909077;
103.8887043,30.7909075;
103.8887010,30.7909082;
103.8886983,30.7909073;
103.8886960,30.7909053;
103.8886945,30.7909037;
103.8886933,30.7909020;
103.8886932,30.7909012;
103.8886930,30.7909003;
103.8886922,30.7908998;
103.8886920,30.7908995;
103.8886918,30.7908993;
103.8886913,30.7908985;
103.8886908,30.7908980;
103.8886898,30.7908973;
103.8886883,30.7908963;
103.8886872,30.7908952;
103.8886853,30.7908943;
103.8886835,30.7908928;
103.8886798,30.7908897;
103.8886770,30.7908848;
103.8886747,30.7908807
 */
}
