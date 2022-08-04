package com.bridgelabz.regex.junit;

import org.junit.Assert;
import org.junit.Test;

public class User_Registration_ValidaterTest {

	@Test
	public void givenFirstName_Proper_True() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.firstNameValidater("Govind");
		Assert.assertEquals(true,result);
	}
	@Test
	public void givenFirstName_is_not_Proper_false() {
		User_Registration_Validater userRegistration = new User_Registration_Validater();
		boolean result = userRegistration.firstNameValidater("govind");
		Assert.assertEquals(false,result);
	}

}
