package com.trainingProjectDay3;

public class verifyEmail {
	public static void main(String[] args) {

		StringBuffer email = new StringBuffer(18);

		email.append("amit.t@.com");
		if (email.length() > 18) {
			System.out.println("0 It Exceeded limit");
		}
		if (email.indexOf("@") != -1) {
			int lastAtIndex = email.lastIndexOf("@");
			int lastDotIndex = email.lastIndexOf(".");
			if (email.indexOf(".") != -1 && lastAtIndex < lastDotIndex) {
				String Suffix = email.substring(lastDotIndex + 1);
				// System.out.print(Suffix);
				if (Suffix.equals("biz") || Suffix.equals("mil") || Suffix.equals("milt") || Suffix.equals("com")) {
					System.out.println("Email is Valid");
				} else {
					System.err.println("1 Email is Invalid " + ".");
				}

			} else {
				System.err.println("2 Email is Invalid");
			}

		} else {
			System.err.println("3 Email is Invalid");
		}
	
	}
}
