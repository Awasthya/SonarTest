package com.trainingProjectDay4.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.zeta.logger.LoggerFile;


public class ObjectMinMax {

	public static Integer findMin(Collection obj){
		
		 
		
		for(Object it : obj){
			
			System.out.print(it+ " ");
			
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> st = new HashSet<Integer>();
		LoggerFile log = new LoggerFile();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		
		Integer min = findMin(st);
		
//		log.lg.info("minimum value for this dataStructure is " + min);
	}

}
