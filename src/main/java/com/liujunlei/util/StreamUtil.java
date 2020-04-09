package com.liujunlei.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
/**
 * * 方法1：批量关闭流，参数能传入无限个。(10分)
 * @param in
 * @return
 */
	public static List<String> readLine(InputStream in){
		List<String> list = new ArrayList<String>();
		   BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		   String str=null;
		   try {
			while((str=reader.readLine())!=null) {
				list.add(str);
			   }
		} catch (IOException e) {
			e.printStackTrace();
		}
		   return list;
	}
}
