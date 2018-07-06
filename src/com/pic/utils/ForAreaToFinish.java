package com.pic.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

import bound.mat_fun;

public class ForAreaToFinish {
	// private Object[][] array = {
	// { 104.1187, 104.1187, 104.1186, 104.1186, 104.1186, 104.1185, 104.1185,
	// 104.1185,
	// 104.1185, 104.1185, 104.1186, 104.1187, 104.1187, 104.1187, 104.1187,
	// 104.1187,
	// 104.1187, 104.1187, 104.1187, 104.1187, 104.1187 },
	// { 30.5063, 30.5063, 30.5063, 30.5063, 30.5062, 30.5062, 30.5062, 30.5061,
	// 30.506,
	// 30.506, 30.506, 30.5059, 30.5059, 30.506, 30.506, 30.5061, 30.5061,
	// 30.5062,
	// 30.5062, 30.5063, 30.5063 } };

	private double[] dob1 = { 104.1187, 104.1187, 104.1186, 104.1186, 104.1186, 104.1185, 104.1185, 104.1185, 104.1185,
			104.1185, 104.1186, 104.1187, 104.1187, 104.1187, 104.1187, 104.1187, 104.1187, 104.1187, 104.1187,
			104.1187, 104.1187 };
	private double[] dob = { 30.5063, 30.5063, 30.5063, 30.5063, 30.5062, 30.5062, 30.5062, 30.5061, 30.506, 30.506,
			30.506, 30.5059, 30.5059, 30.506, 30.506, 30.5061, 30.5061, 30.5062, 30.5062, 30.5063, 30.5063 };
	private double[] array4 = { 104.1187, 104.1187 };

	private int a = 1;
	static mat_fun mf;
	//静态代码块
	static{
		try {
			mf = new mat_fun();
		} catch (MWException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ForAreaToFinish TestExce = new ForAreaToFinish();
		double amend = 1;
		double modulus = 1;
		double[][] db = {{105.4635516,30.4627283},
                {105.4635550,30.4627550},
                {105.4635433,30.4627783},
                {105.4635283,30.4628000},
                {105.4634916,30.4628450},
                {105.4634750,30.4628766},
                {105.4634650,30.4629033},
                {105.4634416,30.4629250},
                {105.4634350,30.4629250},
                {105.4634316,30.4629250},
                {105.4634316,30.4629250},
                {105.4634316,30.4629250},
                {105.4634316,30.4629250},
                {105.4634316,30.4629250},
                {105.4634316,30.4629250},
                {105.4634316,30.4629250},
                {105.4634433,30.4627216} };
//		Map map = TestExce.ForArea(db,amend,modulus);
		long a = System.currentTimeMillis();
		for(int i =0;i<30;i++){
			
			Map<String,Object> map = TestExce.ForAreaGps(db,amend,modulus);
			Object[][] input = (Object[][])map.get("input");
			Map<String,Object> sd = TestExce.ForAreaByGps(input,amend);
			
			System.out.println(sd.get("area")+"=========      "+map.get("GPS"));
		}
		System.out.println(System.currentTimeMillis()-a);
	}
	public static Map<String,Object> ForAreaGps(double db[][],double amend,double modulus) {
		Map<String,Object> map = new HashMap<>(); 
		String Gps = "";
		try {
			Object[] results = new Object[1];
			// 这种方式，第二参数必须为数组，而不能为可变数组
			Object[] inputs = new Object[2];
			double[] db1 = { modulus };
			inputs[0] = db;
			inputs[1] = db1;
			// 求出边界点
			mf.bord(results, inputs);
			MWNumericArray output = (MWNumericArray) results[0];
			map = getAreaInputGps(output.getIntData(), db);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	public static Map<String,Object> ForAreaByGps(Object[][] input,double amend) {
		Map<String,Object> map = new HashMap<>(); 
		Object[] obj = new Object[3];
		String Gps = "";
		try {
			Double[][] res = getOriginalAreasFor2(input);
			obj[0] = res;
			double[] area = { 0 };
			obj[1] = area;
			obj[2] = amend;
			Object[] areaResult = new Object[2];
			Object[] areaInput = obj;
			/**
			 * % 返回两个参数，第一个是面积，第二个面积计算使用的点序号。
			% 输入参数有3个：
			% 第1是point的二维数组，
			% 第2是计算参数，与边界函数的对应参数一致。
			% 第3是边界补偿系数，是经验值。0~3，建议为2~3。面积小，补偿小，面积大，补偿大。
			function [s,k] = get_areax(x,y,z)
			[k,s] = boundary(x,y);
			bound =x(k);
			k = k-1;
			delta_sq = diff(bound).^2;   
			perimeter = sum(sqrt(sum(delta_sq,2)))*z;
			s = s + perimeter;
			end

			 */
			mf.get_areax(areaResult, areaInput);
			double d = Double.parseDouble(areaResult[0].toString())*(1+0.2);
			System.out.println(d);
			System.out.println(areaResult[0]);
			// 棉结方法
			map.put("area", areaResult[0]);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public static Map ForArea(double db[][],double amend,double modulus) {
		Map map = new HashMap<>();
		try {
			long a = System.currentTimeMillis();
			System.out.println(a);
			mf = new mat_fun();//初始化时间
			long m = System.currentTimeMillis();
			System.out.println("时间：" + (m - a));
			Object[] results = new Object[1];
			// 这种方式，第二参数必须为数组，而不能为可变数组
			Object[] inputs = new Object[2];
			
			double[] db1 = { modulus };
			inputs[0] = db;
			inputs[1] = db1;
			// 求出边界点
			mf.bord(results, inputs);
			MWNumericArray output = (MWNumericArray) results[0];
			// 内部包含了求原始面积
			map = getAreaInput(output.getIntData(), db,amend);
			Object[] areaResult = new Object[2];
			Object[] areaInput = (Object[])map.get(1);
			mf.get_areax(areaResult, areaInput);
			System.out.println("mianji: "+areaResult[0]);
			// 棉结方法
			map.put(3, areaResult[0]);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	public static Map<String,Object> getAreaInputGps(int[] result, double[][] db) throws MWException {
		Map map = new HashMap();
		Object[] obj = new Object[3];
		String gps = "";
//		Object[][] input = new Object[result.length-1][2];
		Object[][] input;
		if(db.length<result.length){
			input = new Object[db.length-1][2];
		}else {
			input = new Object[result.length-1][2];
		}
		System.out.println("input的长度："+input.length+" result的长度："+result.length+"  db的长度："+db.length);
//		for (int i = 0; i < result.length-1; i++) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < db[i].length; j++) {
				input[i][j] = db[result[i]][j];
				gps += input[i][j] + ",";
			}
			gps = gps.substring(0, gps.length() - 1);
			gps += ";";
		}
		map.put("GPS", gps.substring(0, gps.length() - 1));
		map.put("input", input);
		return map;
	}
	/**
	 * 删选的结果结果
	 * 
	 * @param result
	 * @param db
	 * @return
	 * @throws MWException
	 */
	public static Map getAreaInput(int[] result, double[][] db,double amend) throws MWException {
		Map map = new HashMap();
		Object[] obj = new Object[3];
		String gps = "";
		Object[][] input = new Object[result.length-1][2];
		for (int i = 0; i < result.length-1; i++) {
			for (int j = 0; j < db[i].length; j++) {
				input[i][j] = db[result[i]][j];
				gps += input[i][j] + ",";
			}
			gps = gps.substring(0, gps.length() - 1);
			gps += ";";
		}
		System.out.println("得到的gps：" + gps.substring(0, gps.length() - 1));
		Double[][] res = getOriginalAreasFor2(input);
		obj[0] = res;
		double[] area = { 0 };
		obj[1] = area;
		obj[2] = amend;
		map.put(1, obj);
		map.put(2, gps);
		// getOriginalArea(input);
		return map;
	}

	public static Object[] getAreaInput1(int[] result, double[][] db) throws MWException {
		Object[] obj1 = new Object[3];
		String gps = "";
		Object[][] input = new Object[result.length][2];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < db[i].length; j++) {
				input[i][j] = db[result[i]][j];
				gps += input[i][j] + ",";
			}
			gps = gps.substring(0, gps.length() - 1);
			gps += ";";
		}
		System.out.println("得到的gps：" + gps.substring(0, gps.length() - 1));
		Double[][] res = getOriginalAreasFor2(input);
		obj1[0] = res;
		double[] area1 = { 0 };
		obj1[1] = area1;
		obj1[2] = 4;
		// getOriginalArea(input);
		return obj1;
	}

	

	public static Double[][] getOriginalAreasFor2(Object[][] input) throws MWException {
		double distance = 0;
		double disX = 0;
		double disY = 0;
		/**
		 * % 返回一个参数，二维数组，返回平面坐标 % 输入参数有3个，第一个是原点经纬度，第二个是计算经纬度，第三个是实际距离 function
		 * [r] = get_point(p0,p1,l) d = p1-p0; ll =sqrt( d(1)^2+d(2)^2); r(1) =
		 * l*d(1); r(2) = l*d(2); end
		 * 
		 */
		Double[][] result = new Double[input.length][2];
		result[0][0] = (double) 0;
		result[0][1] = (double) 0;
		DecimalFormat df = new DecimalFormat("######0.00");
		for (int i = 1; i < input.length-1; i++) {
			distance = GpsUtils.getDistance(input[0][0] + "," + input[0][1], input[i][0] + "," + input[i][1]);
			Object[] oldGps = { input[0][0], input[0][1] };

			double nextArray0 = Double.parseDouble(input[i][0].toString());
			double nextArray1 = Double.parseDouble(input[i][1].toString());
			double[] db = { nextArray0, nextArray1 };
			Object[] inputs = { oldGps, db, distance };
			// 输入 3，1，原点gpszuobiao , 2，下一个点 的gps, 3, 实际距离 ，
			// 输出， 相对坐标
			// get_Area

			Object[] put = new Object[1];
			mf.get_point(put, inputs);
			MWNumericArray output = (MWNumericArray) put[0];
			double[] doub = output.getDoubleData();
//			System.out.println(df.format(doub[0]) + "," + df.format(doub[1]));
			result[i][0] = doub[0];
			result[i][1] = doub[1];
		}
		result[input.length-1][0] = 0.0;
		result[input.length-1][1] = 0.0;
		return result;
	}

}
