package com.pic.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

	public static boolean createFile(String fileName,String path) {
		Boolean bool = false;
		try {
			File file = new File(path, fileName);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			bool = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bool;
	}
	public static void StringBufferFile(String filePath,StringBuffer sb){
		try {
			FileOutputStream out=new FileOutputStream(filePath);
			out.write(sb.toString().getBytes("UTF-8"));
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
