package com.pic.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.StringUtils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringUtil
{
	/**
	 * 獲取db表
	 * @param list
	 * @return
	 */
	public static  List<String> selectDBTable(List<String> list){
		List<String> tabList = new ArrayList<String>();
		for(int i=0;i<list.size();i++){
			if(list.get(i).length()>3){
				if(list.get(i).substring(0,3).equals("db_")){
					tabList.add(list.get(i));
				}
			}

		}
		return tabList;
	}

	/**
	 * 获取当前时间之前的多少天
	 * @param date
	 * @param a
	 * @return
	 */
	public static String beforeDate(String date,Integer a){
		String dayAfter="";
		try{
			Calendar c = Calendar.getInstance();
			Date dates = null;
			dates = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			c.setTime(dates);
			int day = c.get(Calendar.DATE);
			if(a==0 || a==null ){
				a=1;
			}
			c.set(Calendar.DATE, day - a);
			dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());

		}catch(Exception e){
			e.printStackTrace();
			System.out.println("获取日期出错");
		}
		return dayAfter;
	}



	//防止sql 注入,过滤字符串
	public static String SQL(String content){
		String flt ="'|and|exec|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|;|or|-|+|,";
		String[] filter = flt.split("\\|");
		for(int i=0;i<filter.length;i++){
			if(content.indexOf(filter[i])!=-1){
				String str=	content.replaceAll(filter[i],"x");
				content=str;
			}
		}
		return content;
	}

	public static Map<String,Object> Data(String data) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		try{
			//map = JSONObject.fromObject(data);
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}
	/**
	 * 将map 转化为Bean
	 * @param map
	 * @param class1
	 * @return
	 */
	public static <T> T map2Bean(Map<String, Object> map, Class<T> class1)
	{
		T bean = null;
		try
		{
			bean = class1.newInstance();
			BeanUtils.populate(bean, map);
		} catch (InstantiationException e)
		{
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		return bean;
	}

	// 类的注册转换器，主要是Map 直接转化为Bean ，data没办法转换，需要实现这个转换器
	public static void transMap2Bean(Map<String, Object> map, Object obj)
	{
		// ConvertUtils.register(new DateLocaleConverter(), Date.class);
		ConvertUtils.register(new Converter()
		{
			@SuppressWarnings("rawtypes")
			@Override
			public Object convert(Class arg0, Object arg1)
			{
				if (arg1 == null)
				{
					return null;
				}
				if (!(arg1 instanceof String))
				{
					throw new ConversionException("只支持字符串转换 !");
				}
				String str = (String) arg1;
				if (str.trim().equals(""))
				{
					return null;
				}

				SimpleDateFormat sd = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss");

				try
				{
					return sd.parse(str);
				} catch (ParseException e)
				{
					throw new RuntimeException(e);
				}

			}

		}, Date.class);
		if (map == null || obj == null)
		{
			return;
		}
		try
		{
			BeanUtils.populate(obj, map);
		} catch (Exception e)
		{
			System.out.println("Map<String,Object>转化Bean异常：" + e);
		}
	}

	/**
	 * 生成唯一id
	 *
	 * @return
	 */
	public static String OnlyId()
	{
		String id = "";
		id = UUID.randomUUID().toString();
		return id;

	}

	/**
	 * 将bean转化为map
	 *
	 * @param bean
	 * @return
	 * @throws IntrospectionException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static Map<String, Object> beanToMap(Object bean)
			throws IntrospectionException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{
		Class type = bean.getClass();
		@SuppressWarnings("rawtypes")
		Map returnMap = new HashMap();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);// 属性
		PropertyDescriptor[] propertyDescriptors = beanInfo// 描述
				.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++)
		{// 遍历描述
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class"))
			{
				Method readMethod = descriptor.getReadMethod();// 返回bean
				// 这个对象的get方法
				Object result = readMethod.invoke(bean, new Object[0]);// 获取这个bean
				// 调用对应的方法
				if (result != null)
				{
					returnMap.put(propertyName, result);
				} else
				{
					returnMap.put(propertyName, "");
				}
			}
		}
		return returnMap;
	}

	/**
	 * 判断typeId如01020300
	 *
	 * @param str
	 * @return
	 */
	public static String checkTypeId(String str) throws Exception
	{
		String s = "";
		if (!str.substring(6, 8).equals("00"))
		{
			s = str.substring(0, 8);
		} else if (!str.substring(4, 6).equals("00"))
		{
			s = str.substring(0, 6);
		} else if (!str.substring(2, 4).equals("00"))
		{
			s = str.substring(0, 4);
		} else
		{
			s = str.substring(0, 2);
		}

		return s;
	}

	/**
	 * 结果集转化为map
	 *
	 * @param map
	 * @return
	 */
	public static Map<String, Object> requestToMap(Map<String, String[]> map)
	{
		// 返回值Map
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Iterator<Map.Entry<String, String[]>> entries = map.entrySet()
				.iterator();
		Map.Entry<String, String[]> entry;
		String name = "";
		String value = "";
		while (entries.hasNext())
		{
			entry = (Map.Entry<String, String[]>) entries.next();
			name = (String) entry.getKey();
			Object valueObj = entry.getValue();
			if (null == valueObj)
			{
				value = "";
			} else if (valueObj instanceof String[])
			{
				String[] values = (String[]) valueObj;
				for (int i = 0; i < values.length; i++)
				{
					value = values[i] + ",";
				}
				value = value.substring(0, value.length() - 1);
			} else
			{
				value = valueObj.toString();
			}
			returnMap.put(name, value);
		}
		return returnMap;
	}

	/**
	 * 当前月到之前的一年
	 *
	 * @return
	 */
	public static List<String> listMonth()
	{
		Calendar now = Calendar.getInstance();
		int upYear = now.get(Calendar.YEAR) - 1;
		int year = now.get(Calendar.YEAR);
		int mon = (now.get(Calendar.MONTH) + 1);
		List<Integer> list = new ArrayList<Integer>();
		List<String> reList = new ArrayList<String>();
		for (int i = (mon + 1); i <= 12; i++)
		{
			list.add(i);
		}
		if (list.size() != 0)
		{
			for (int i = 0; i < list.size(); i++)
			{
				if (list.get(i) < 10)
				{
					reList.add(upYear + "-0" + list.get(i));
				} else
				{
					reList.add(upYear + "-" + list.get(i));
				}
			}
		}
		for (int i = 1; i <= mon; i++)
		{
			if (i < 10)
			{
				reList.add(year + "-0" + i);
			} else
			{
				reList.add(year + "-" + i);
			}
		}
		return reList;
	}


	/**
	 * 拼接年月
	 *
	 * @param year
	 * @param month
	 * @return
	 * @throws Exception
	 */
	public static String strYM(String year, Integer month) throws Exception
	{
		String str;
		if (month < 10)
		{
			str = "-0" + month;
		} else
		{
			str = "-" + month;
		}
		String ret = year + str;
		return ret;
	}

	/**
	 * String 转为short
	 *
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public static Short strToShort(String s) throws Exception
	{
		Integer a = Integer.valueOf(s);
		return a.shortValue();

	}


	public static Map<String, Object> retParam(Boolean boo, Object ob)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", boo);
		map.put("message", "");
		map.put("data", ob);
		return map;

	}

	public static Map<String, Object> retParam(Boolean boo, String str,
											   Object ob)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", boo);
		map.put("message", str);
		map.put("data", ob);
		return map;

	}

	public static List<Object> retList(Object A, Object B)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(A);
		list.add(B);
		return list;
	}

	public static Map<String, Object> getOut(int code, Object data)
	{
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("code", code);
		retMap.put("data", data);
		return retMap;
	}

	public static Map<String, Object> getOut(int code)
	{
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("code", code);
		retMap.put("data", null);
		return retMap;
	}

	public static String formatDate(Date date)
	{
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public static String getDate(Date date)
	{
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	public static String formatDateDay(Date date)
	{
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

	public static String formatDate(String s) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = formatter.parse(s);
		String pubdate = StringUtil.formatDate(date);
		return pubdate;
	}

	/**
	 * 将日期转化为指定日期
	 *
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date retDate(Date date) throws ParseException
	{
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = formatter.parse(s);
		return date1;
	}

	/**
	 * 将字符串转换为日期
	 *
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date strToDate(String date) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = formatter.parse(date);
		return date1;
	}


	/**
	 * 将字符串转换为日期
	 *
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date strToDateTime(String date) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = formatter.parse(date);
		return date1;
	}



	public static String replace(String from, String to, String source)
	{
		if ((source == null) || (from == null) || (to == null))
			return null;
		StringBuffer str = new StringBuffer("");
		int index = -1;
		while ((index = source.indexOf(from)) != -1)
		{
			str.append(source.substring(0, index) + to);
			source = source.substring(index + from.length());
			index = source.indexOf(from);
		}
		str.append(source);
		return str.toString();
	}

	public static String htmlencode(String str)
	{
		if (str == null)
		{
			return null;
		}
		return replace("\"", "&quot;", replace("<", "&lt;", str));
	}

	public static String htmldecode(String str)
	{
		if (str == null)
		{
			return null;
		}

		return replace("&quot;", "\"", replace("&lt;", "<", str));
	}

	public static String htmlshow(String str)
	{
		if (str == null)
		{
			return null;
		}

		str = replace("<", "&lt;", str);
		str = replace(" ", "&nbsp;", str);
		str = replace("\r\n", "<br/>", str);
		str = replace("\n", "<br/>", str);
		str = replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;", str);
		return str;
	}

	public static boolean isInteger(String str)
	{
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]+$");
		return pattern.matcher(str).matches();
	}

	public static boolean isDouble(String str)
	{
		Pattern pattern = Pattern.compile("^[-\\+]?\\d+\\.\\d+$");
		return pattern.matcher(str).matches();
	}

	public static boolean isLetter(String str)
	{
		if ((str == null) || (str.length() < 0))
		{
			return false;
		}
		Pattern pattern = Pattern.compile("[\\w\\.-_]*");
		return pattern.matcher(str).matches();
	}

	public static String parse(String content)
	{
		String email = null;
		if ((content == null) || (content.length() < 1))
		{
			return email;
		}

		String token = "@";
		String preHalf = "";
		String sufHalf = "";

		int beginPos = content.indexOf(token);
		if (beginPos > -1)
		{
			String s = null;
			int i = beginPos;
			while (i > 0)
			{
				s = content.substring(i - 1, i);
				if (!isLetter(s))
					break;
				preHalf = s + preHalf;

				i--;
			}

			i = beginPos + 1;
			while (i < content.length())
			{
				s = content.substring(i, i + 1);
				if (!isLetter(s))
					break;
				sufHalf = sufHalf + s;

				i++;
			}

			email = preHalf + "@" + sufHalf;
			if (isEmail(email))
			{
				return email;
			}
		}
		return null;
	}

	public static boolean isEmail(String email)
	{
		if ((email == null) || (email.length() < 1) || (email.length() > 256))
		{
			return false;
		}
		Pattern pattern = Pattern
				.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
		return pattern.matcher(email).matches();
	}

	public static boolean isChinese(String str)
	{
		Pattern pattern = Pattern.compile("[Α-￥]+$");
		return pattern.matcher(str).matches();
	}

	public static boolean isBlank(String str)
	{
		return (str == null) || (str.trim().length() == 0);
	}

	public static boolean isPrime(int x)
	{
		if ((x <= 7) && ((x == 2) || (x == 3) || (x == 5) || (x == 7)))
		{
			return true;
		}
		int c = 7;
		if (x % 2 == 0)
			return false;
		if (x % 3 == 0)
			return false;
		if (x % 5 == 0)
			return false;
		int end = (int) Math.sqrt(x);
		while (c <= end)
		{
			if (x % c == 0)
			{
				return false;
			}
			c += 4;
			if (x % c == 0)
			{
				return false;
			}
			c += 2;
			if (x % c == 0)
			{
				return false;
			}
			c += 4;
			if (x % c == 0)
			{
				return false;
			}
			c += 2;
			if (x % c == 0)
			{
				return false;
			}
			c += 4;
			if (x % c == 0)
			{
				return false;
			}
			c += 6;
			if (x % c == 0)
			{
				return false;
			}
			c += 2;
			if (x % c == 0)
			{
				return false;
			}
			c += 6;
		}
		return true;
	}

	private static String removeSameString(String str)
	{
		Set mLinkedSet = new LinkedHashSet();
		String[] strArray = str.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++)
		{
			if (!mLinkedSet.contains(strArray[i]))
			{
				mLinkedSet.add(strArray[i]);
				sb.append(strArray[i] + " ");
			}
		}
		System.out.println(mLinkedSet);
		return sb.toString();
	}

	public static String encoding(String src)
	{
		if (src == null)
			return "";
		StringBuilder result = new StringBuilder();
		if (src != null)
		{
			src = src.trim();
			for (int pos = 0; pos < src.length(); pos++)
			{
				switch (src.charAt(pos))
				{
					case '"':
						result.append("&quot;");
						break;
					case '<':
						result.append("&lt;");
						break;
					case '>':
						result.append("&gt;");
						break;
					case '\'':
						result.append("&apos;");
						break;
					case '&':
						result.append("&amp;");
						break;
					case '%':
						result.append("&pc;");
						break;
					case '_':
						result.append("&ul;");
						break;
					case '#':
						result.append("&shap;");
						break;
					case '?':
						result.append("&ques;");
						break;
					default:
						result.append(src.charAt(pos));
				}
			}
		}

		return result.toString();
	}

	public static boolean isHandset(String handset)
	{
		try
		{
			String regex = "^1[\\d]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(handset);
			return matcher.matches();
		} catch (RuntimeException e)
		{
		}
		return false;
	}

	public static String decoding(String src)
	{
		if (src == null)
			return "";
		String result = src;
		result = result.replace("&quot;", "\"").replace("&apos;", "'");
		result = result.replace("&lt;", "<").replace("&gt;", ">");
		result = result.replace("&amp;", "&");
		result = result.replace("&pc;", "%").replace("&ul", "_");
		result = result.replace("&shap;", "#").replace("&ques", "?");
		return result;
	}

	public static void main(String[] args)
	{
		// System.out.println("去掉字符串中重复的子字符串：" +
		// removeSameString("100 100 9658"));
		System.out.println(checkPhone("18408280858"));

	}

	public static boolean checkPhone(String phone)
	{
		Pattern p = Pattern.compile("1(3|5|7|8)[0-9]{9}");
		Matcher m = p.matcher(phone);
		return m.matches();
	}

	public static List<Date> getDatesByYearAndMonth(String dateString)
			throws Exception
	{

		Date dates;
		if (dateString == null)
		{
			dates = new Date();
		} else
		{
			SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM");
			dates = format2.parse(dateString);
		}
		Calendar c = Calendar.getInstance();
		c.setTime(dates);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		List<Date> list = new ArrayList<Date>();
		do
		{
			list.add(calendar.getTime());
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		} while (month - 1 == calendar.get(Calendar.MONTH));
		return list;

	}
	public static  byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		//创建一个Buffer字符串
		byte[] buffer = new byte[1024];
		//每次读取的字符串长度，如果为-1，代表全部读取完毕
		int len = 0;
		//使用一个输入流从buffer里把数据读取出来
		while ((len = inStream.read(buffer)) != -1) {
			System.out.println("xxxxxxxxxxxxx");
			//用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
			outStream.write(buffer, 0, len);
		}
		//关闭输入流
		inStream.close();
		//把outStream里的数据写入内存
		return outStream.toByteArray();
	}
	public static String gpsLast(String gps){
		String[] split = gps.split(";");
		String gpsTo = "";
		for (int i = 0; i < split.length; i++) {
			gpsTo = split[split.length-1];
		}
		return gpsTo;
	}
	/*获取gps中得最后一条，支持List*/
	public static List<String> getGpsLast(List<String> arrayList) {
		String[] gpsArray;
		ArrayList<String> list = new ArrayList<>();
		for (String string : arrayList) {
			if (string != null && !"".equals(string)) {
				String[] split = string.split(";");
				gpsArray = split[split.length - 1].split(",");
				list.add(gpsArray[0] + "," + gpsArray[1]);
			}
		}
		return list;
	}


	public static String getGpsNoStatus(String gps){
		String[] split = gps.split(",");
		if(split!= null && split.length == 3){
			String newGps = split[0] + ","+split[1];
			return newGps;
		}
		//throw new RuntimeException("给予的gps为空或长度有误！");
		if(split != null && split.length == 2){
			return gps;
		}
		throw new RuntimeException("给予的gps为空或长度有误！");
	}

	//将一组组的gps拆分为单个gps集合
	public static List<String> getSplitGps(List<String> gps) {
		List<String> list = new ArrayList<>();
		for (String str : gps) {
			if (StringUtils.isNotBlank(str)) {
				String[] split = str.split(";");
				list.addAll(Arrays.asList(split));
			}
		}
		return list;
	}

	//将一组组的gps拆分为单个gps集合
	public static List<Map<String,Object>> getSplitGpsSpeed(List<Map<String, Object>> maps) {
		List<Map<String,Object>> list = new ArrayList<>();
		for (Map<String,Object> map:maps) {
			String gps = (String)map.get("gps");
			Double avg_speed = (Double)map.get("avg_speed");
			if(StringUtils.isNotBlank(gps) && avg_speed != null){
				String[] split = gps.split(";");
				for (String str:split) {
					Map<String,Object> map1 = new LinkedHashMap<>();
					map1.put("gps",getGpsNoStatus(str));
					map1.put("avg_speed",avg_speed);
					list.add(map1);
				}
			}
		}
		return list;
	}

	public static String changeDateFormate(String dayTime) {
		StringBuilder sb = new StringBuilder("");
		String[] split = dayTime.split("-");
		if (split != null && split.length == 3) {
			sb.append(split[0]).append("年").append(split[1]).append("月").append(split[2]).append("日");
			return sb.toString();
		}
		throw new RuntimeException("传入字符串格式时间有误！");
	}

	//将集合装载的gps转换成集合装载的具体地址
//	public static List<String> gpsToAddress(List<String> gps) {
//		List<String> address = new ArrayList<>();
//		for (String str : gps) {
//			String[] split = str.split(";");
//			String s = HttpUtils.find(split[split.length - 1]);
//			if (address.contains(s)) {
//				continue;
//			}
//			address.add(s);
//		}
//		return address;
//	}

	//作业类型转换
	public static String changeWorkType(String type){
		if(StringUtils.isNotBlank(type)){
			if(type.equals("拖拉机") || type.equals("其他")){
				return "其他";
			}
			if(type.equals("收割机")){
				return "收割";
			}
			if(type.equals("插秧机")){
				return "插秧";
			}
		}
			return null;
	}
}