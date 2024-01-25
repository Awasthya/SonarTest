package com.zeta.condition;

public class ConditionFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int val = Integer.parseInt(args[0]);
			System.out.println("Number");
		}catch (Exception err){
				System.out.println("Character");
		}	
	}
}
