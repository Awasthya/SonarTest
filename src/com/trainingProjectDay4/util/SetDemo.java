package com.trainingProjectDay4.util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

import com.zeta.logger.LoggerFile;

public class SetDemo {
	
	public static void main(String[] args) {
		Vector<Integer> vecSt = new Vector<Integer>();
		LoggerFile log = new LoggerFile();
		vecSt.add(20);
		vecSt.add(30);
		vecSt.add(20);
		vecSt.add(40);
		
		HashSet st = new HashSet();
	
		st.addAll(vecSt);
		log.lg.info(st);
		
		HashSet umModifiedSet = (HashSet) Collections.unmodifiableSet(st);
		
		umModifiedSet.add(100);
		log.lg.info(st);
		
		
	}
}
