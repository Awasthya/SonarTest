package com.trainingProject;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charnum = 122;
		int number = 1;
		System.out.print(0+" ");
		while(charnum > 96){
			System.out.print(number);
			System.out.print((char)charnum);
			System.out.print(' ');
			number++;
			charnum--;
		}
		System.out.println();
		System.out.println();
		charnum = 97;
		number = 26;
		do{
			System.out.print(number);
			System.out.print((char)charnum);
			System.out.print(' ');
			number--;
			charnum++;
		}while(charnum < 123);

		System.out.println();
		System.out.println();
		
		for(int i=1;i <= 10 ; i++){
			System.out.println("2 * "+ i + " = " + 2*i);
		}
	}

}
