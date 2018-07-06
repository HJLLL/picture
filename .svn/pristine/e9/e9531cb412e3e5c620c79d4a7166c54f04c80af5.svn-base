package com.pic.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pic.entity.FarmMachine;
import com.pic.service.AreaComputeService;
import com.pic.service.FarmService;
import com.pic.utils.FastJsonResult;
import com.pic.utils.FileUtils;

@Controller
@RequestMapping(value = "/areaComputeController")
public class AreaComputeController {

	@Autowired
	private AreaComputeService areaComputeService;
	@Autowired
	private FarmService farmService;

	@RequestMapping("/selectByCondition")
	@ResponseBody
	public FastJsonResult selectByCondition(@RequestParam Map<String, Object> map, HttpServletRequest request) {
		try {
			FarmMachine farmMachine = farmService.selectFMCondition(map);
			if(farmMachine==null){
				return FastJsonResult.build("农机不存在");
			}
			map.put("tableName", "db_"+farmMachine.getId());
			String url = "http://" + request.getServerName() //服务器地址  
			+ ":"   
			+ request.getServerPort()           //端口号  
			+ request.getContextPath()+"/pic/";
			String fileName = System.currentTimeMillis() + ".txt";
			String path = request.getSession().getServletContext().getRealPath("/pic/");
			System.out.println(path);
			List<Map<String, Object>> list = areaComputeService.selectDataByCondition(map);
			StringBuffer sb = new StringBuffer();
			if(list.size()<=0){
				return FastJsonResult.build("该农机没有数据");
			}
			if((list.get(0).get("gps")+"").split(";")[0].split(",").length<2){
				return FastJsonResult.build("该农机数据格式存在问题");
			}
			for (int i = 0; i < list.size(); i++) {
				String gpss = list.get(i).get("gps") + "";
				String[] gpssSplit = gpss.split(";");
				
				for (int j = 0; j < gpssSplit.length; j++) {
					String gps = gpssSplit[j];
					sb.append(gps.substring(0, gps.lastIndexOf(",") + 1));
					int angle = Integer.valueOf(gps.substring(gps.lastIndexOf(",")+1));
					short angleTO = (short) angle;
					sb.append(angleTO + ";");
				}
			}
			boolean flag = FileUtils.createFile(fileName, path);
			if(flag==true){
				FileUtils.StringBufferFile(path+fileName, sb);
			}
			return FastJsonResult.build(url+fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return FastJsonResult.build();
	}

}
