package com.bridgelabz.regex.junit;

import org.junit.Assert;
import org.junit.Test;

public class User_Registration_ValidaterTest {

	// First Name
	@Test
	public void givenFirstName_Proper_True() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.firstNameValidater("Govind");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.firstNameValidater("govind");
		Assert.assertEquals(false, result);
	}

	// Last name
	@Test
	public void givenLastName_is_Proper_True() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = User_Registration_Validater.lastNameValidater("Maithil");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.lastNameValidater("maithil");
		Assert.assertEquals(false, result);
	}

	// email
	@Test
	public void given_Email_is_Proper_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.emailValidater("govindmaithil@bridgelabz.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Email_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.emailValidater("Govindmaithil@bridgelabz.com");
		Assert.assertEquals(false, result);
	}

	// Phone Number
	@Test
	public void given_Phone_Number_is_Proper_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.phoneValidater("91 8602443523");
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Phone_Number_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.phoneValidater("911 8602443523");
		Assert.assertEquals(false, result);
	}

	// password rule 1
	@Test
	public void given_Password_is_Proper_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.passwordValidater("govindma");
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Password_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.passwordValidater("govindm");
		Assert.assertEquals(false, result);
	}
	// password rule 2
	@Test
	public void given_Password_is_Proper_rule_2_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.passwordValidater("Govindma");
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Password_is_not_Proper_rule_2_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.passwordValidater("govindma");
		Assert.assertEquals(false, result);
	}
	
	// password rule 3
		@Test
		public void given_Password_is_Proper_rule_3_true() {
			User_Registration_Validater userRegistration = new User_Registration_Validater();
			boolean result = userRegistration.passwordValidater("Govindma1");
			Assert.assertEquals(true, result);
		}

		@Test
		public void given_Password_is_not_Proper_rule_3_false() {
			User_Registration_Validater userRegistration = new User_Registration_Validater();
			boolean result = userRegistration.passwordValidater("govindma33");
			Assert.assertEquals(false, result);
		}

}
