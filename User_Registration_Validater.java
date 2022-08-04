package com.bridgelabz.regex.junit;

import java.util.regex.Pattern;

public class User_Registration_Validater {

	private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String Email_Pattern = "^[a-z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
	

	public static boolean firstNameValidater(String firstName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(firstName).matches();
	}

	public static boolean lastNameValidater(String lastName) {
		Pattern pattern = Pattern.compile(Name_Pattern);
		return pattern.matcher(lastName).matches();
	}
	public static boolean emailValidater(String email) {
		Pattern pattern = Pattern.compile(Email_Pattern);
		return pattern.matcher(email).matches();
	}

	public static void main(String[] args) {
		System.out.println("First Name ----");
		System.out.println(firstNameValidater("Govind")); // proper
		System.out.println(firstNameValidater("govind")); // not proper

		System.out.println("Last Name ---- ");
		System.out.println(lastNameValidater("Maithil")); // proper
		System.out.println(lastNameValidater("maithil")); // not popper
		
		System.out.println("Email -------");
		System.out.println(emailValidater("govindmaithil@gmail.com")); // proper
		System.out.println(emailValidater("govindmaithil1234@gmail.com")); //  proper
		System.out.println(emailValidater("govindmaithil1234@gmail.co.in")); // proper 
		System.out.println(emailValidater("Govindmaithil1234@gmail.com")); // not proper
		System.out.println(emailValidater("govindmaithil1234@gmail.com.in")); // not proper
		
	}

}
