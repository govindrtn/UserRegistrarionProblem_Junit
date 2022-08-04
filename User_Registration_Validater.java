package com.bridgelabz.regex.junit;

import java.util.regex.Pattern;

public class User_Registration_Validater {

	private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";

	public static boolean firstNameValidater(String firstName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(firstName).matches();
	}

	public static void main(String[] args) {
		System.out.println(firstNameValidater("Govind"));
		System.out.println(firstNameValidater("govind"));
	}

}
