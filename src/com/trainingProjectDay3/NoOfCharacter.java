package com.trainingProjectDay3;

public class NoOfCharacter {
	public static void main(String[] args) {
		
		String para = "Zeta Sodexo Zeta Sodexo Zeta Sodexo Zeta Sodexo";
		
		System.out.println("No. Of 'a' = " +( para.length() - para.replace("a", "").length()) );
		System.out.println("No. Of 'S' = " +( para.length() - para.replace("S", "").length()) );
		System.out.println("No. Of Characters : " + para.length());
		
		StringBuffer t = new StringBuffer(25);
		
		System.out.println("StringBuffer Capacity : " + t.capacity());
		t.trimToSize();
		System.out.println("StringBuffer Capacity : " + t.capacity());
	
		
	}
}
