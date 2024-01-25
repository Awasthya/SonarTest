package com.trainingProjectDay3;


public class SpecialCombination {


	public static void main(String[] args) {
		
		String word1 = "Zeta";
		String word2 = "Infy";
		
		int word1Length = word1.length();
		String ans = word1.substring(0,1)+word1.substring(word1Length - 1)
					+ word2.substring(0,2);
		
		System.out.println(ans);
		
		
	}
}
