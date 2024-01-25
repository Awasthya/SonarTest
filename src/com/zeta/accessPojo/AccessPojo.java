package com.zeta.accessPojo;

import com.trainingProjectDay4.ZetaPojo;
import com.zeta.logger.LoggerFile;

public class AccessPojo {
	public static void main(String[] args) {

		LoggerFile log = new LoggerFile();
		ZetaPojo obj = new ZetaPojo();
		
		obj.setCname("Amit");
		log.lg.info(obj.getCname());
		
	}
}
