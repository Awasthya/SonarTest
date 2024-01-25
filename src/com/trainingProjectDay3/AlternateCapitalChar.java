package com.trainingProjectDay3;

public class AlternateCapitalChar {
	public static void main(String[] args) {
		String str = "lenovo";
		String ans = "";
		for(int i=0;i<str.length();i++){
			Character temp = str.charAt(i);
			if(i % 2 == 0){
				ans += Character.toUpperCase(temp);
			}else{
				ans += Character.toLowerCase(temp);
			}
		}
		
		System.out.println(ans);
	}

}
