package com.trainingProjectDay4.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


import com.zeta.logger.LoggerFile;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		LoggerFile log = new LoggerFile();
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		ll.add("Amit");
		log.lg.info(ll);
		
		Collections.shuffle(ll);
		log.lg.info(ll);	
		
		Iterator ir = ll.iterator();
		
		while(ir.hasNext()){
			log.lg.info(ir.next());
		}
	}

}
