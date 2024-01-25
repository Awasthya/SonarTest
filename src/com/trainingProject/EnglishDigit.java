package com.trainingProject;

public class EnglishDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {{"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"},
				{"Ten","Twinty","Thirty","Fourty","Fivty","Sixty","Seventy","Eighty","Ninety"},
				{"Hundrads","Thousand","Ten Thousand","One Lakh"}};
		int number = 103000;
		int pos = 1;
		StringBuilder ans = new StringBuilder();
		if(number > 100000){
			System.out.println("number is more than expected");
			return ;
		}
		while(number > 0){
			int lastnum = number % 10;
			number = number / 10;
			if(lastnum == 0){
				pos *= 10;
				continue ;
			}
			if(pos == 1){
				ans.append(words[0][lastnum-1]);
				ans.insert(0,' ');
			}else if(pos == 10){
				if(lastnum == 1){
					if(ans.equals("")){
						ans.insert(0,"ten");
						ans.insert(0,' ');
					}else{
						
					}
				}else{
					ans.insert(0,' ');
					ans.insert(0,words[1][lastnum - 1]);
				}
			}else if(pos == 100){
				ans.insert(0,' ');
				ans.insert(0, words[2][0]);
				ans.insert(0,' ');
				ans.insert(0,words[0][lastnum-1]);
			}else if(pos == 1000 || pos == 10000){
				
				if(number == 0){
					System.out.println(number);
					ans.insert(0,' ');
					ans.insert(0, words[2][1]);
					ans.insert(0,' ');
					ans.insert(0,words[0][lastnum-1]);
				}else{
					System.out.println("***");
					int last = number % 10;
					ans.insert(0,' ');
					ans.insert(0, words[2][1]);
					ans.insert(0,' ');
					ans.insert(0,words[0][lastnum-1]);
					ans.insert(0,' ');
					ans.insert(0,words[1][last-1]);
					number /= 10;
				}
			}else if(pos == 100000){
				ans.append("One Lakh");
			}
			
			pos *= 10;
		}
		System.out.print(ans);
	}

}
