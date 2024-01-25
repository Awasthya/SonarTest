package com.trainingProjectDay4.util;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ls = new ArrayList(); // Default Size is 10 for ArrayList
		
		ls.add(new Integer(34));
		ls.add(new Integer(44));
		ls.add(new Integer(54));
		ls.add(new Integer(64));
		ls.add(new Integer(74));
		ls.add(new Integer(84));
		ls.add(new String("Zeta"));
		ListIterator it = ls.listIterator();
		
		
		while(it.hasNext())
			System.out.println(it);
		
	
	}

}
