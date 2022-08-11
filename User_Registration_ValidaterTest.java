package com.bridgelabz.regex.junit;

import org.junit.Assert;
import org.junit.Test;

public class User_Registration_ValidaterTest {

	// First Name
	@Test
	public void givenFirstName_Proper_True() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.firstNameValidater("Govind");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.firstNameValidater("govind");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// Last name
	@Test
	public void givenLastName_is_Proper_True() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = User_Registration_Validater.lastNameValidater("Maithil");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
;
		try {
			result = userRegistration.lastNameValidater("maithil");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// email
	@Test
	public void given_Email_is_Proper_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.emailValidater("govindmaithil@bridgelabz.com");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Email_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.emailValidater("Govindmaithil@bridgelabz.com");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// Phone Number
	@Test
	public void given_Phone_Number_is_Proper_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.phoneValidater("91 8602443523");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Phone_Number_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.phoneValidater("911 8602443523");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// password rule 1
	@Test
	public void given_Password_is_Proper_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("govindma");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Password_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("govindm");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// password rule 2
	@Test
	public void given_Password_is_Proper_rule_2_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("Govindma");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Password_is_not_Proper_rule_2_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("govindma");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// password rule 3
	@Test
	public void given_Password_is_Proper_rule_3_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("Govindma1");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Password_is_not_Proper_rule_3_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("govindma33");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

	// password rule 4
	@Test
	public void given_Password_is_Proper_rule_4_true() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("Govindma1$");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true, result);
	}

	@Test
	public void given_Password_is_not_Proper_rule_4_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = false;
		try {
			result = userRegistration.passwordValidater("govindma3$");
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(false, result);
	}

}
