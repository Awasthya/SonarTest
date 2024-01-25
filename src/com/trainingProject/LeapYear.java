package com.trainingProject;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = Integer.parseInt(args[0]);
		// if Divided by 4 or 400 than leap year
		if(year % 4 == 0 || year % 400 == 0 ){
			System.out.println("This is leap Year");
		}else{

			System.out.println("This is Not a leap Year");
		}

	}

}
