package com.trainingProjectDay4.util;

import java.util.Vector;

import com.zeta.logger.LoggerFile;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerFile log = new LoggerFile();
		Vector vec = new Vector(5);
		
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(null);
		vec.add("");
		vec.add(70);
		
		log.lg.info(vec);
		log.lg.info(vec.capacity());
		log.lg.info(vec.elementAt(3));
		log.lg.info(vec.get(3));
		log.lg.info(vec.get(4));
	}

}
