package com.fssa.srikannan.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserValidation {
	
@Test
	public void testValidUser() {
	UserDetails details = new UserDetails();
	
	details.setname("Srikannan");
	details.setEmail("Srikann.2003@gmail.com");
	details.setaddress("Raniyammalnagar");
	details.setPh_num("9799085013");
	details.setPincode("627002");
	details.setPassword("Sri@2003");
	
	Assertions.assertTrue(UserDetailsValidator.validate(details));
		
	}
@Test

	public void testInvalidName() {
		try {
			
			UserDetailsValidator.ValidateName(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name is: Invalid", ex.getMessage());
		}
	}
	
@Test

	public void testInvalidEmail() {
		try {
			UserDetailsValidator.validateEmail(null);
			Assertions.fail("ValidateEmail failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Email is: Invalid", ex.getMessage());
		}
	}

	
@Test

	public void testInvalidPhoneNumber() {
		try {
			UserDetailsValidator.validatePhoneNumber("12345");
			Assertions.fail("ValidatePhoneNumber failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("PhoneNumber is: Invalid", ex.getMessage());
		}
	}
	
	
@Test

	public void testInvalidPinCode() {
		try {
			UserDetailsValidator.validatePinCode("000000");
			Assertions.fail("ValidatePincode failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Pincode is: Invalid", ex.getMessage());
		}
	}
	
	
@Test

	public void testInvalidAddress() {
		try {
			UserDetailsValidator.validateAddress(null);
			Assertions.fail("Validateaddress failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Address is: Invalid", ex.getMessage());
		}
	}
	
	
@Test

	public void testInvalidPassword() {
		try {
			UserDetailsValidator.validatePassword(null);
			Assertions.fail("ValidatePassword failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Password is: Invalid", ex.getMessage());
		}
	}

	
@Test

	public void testInvalidNameLength() {
    try {
        UserDetailsValidator.ValidateName("A");
        Assertions.fail("ValidateName failed");
    } catch (IllegalArgumentException ex) {
        Assertions.assertEquals("Name is: Invalid", ex.getMessage());
    }
   }


@Test

	public void testInvalidEmailFormat() {
    try {
        UserDetailsValidator.validateEmail("invalid.email");
        Assertions.fail("ValidateEmail failed");
    } catch (IllegalArgumentException ex) {
        Assertions.assertEquals("The email address is: Invalid", ex.getMessage());
    }
   }


@Test

public void testInvalidPhoneNumberFormat() {
    try {
        UserDetailsValidator.validatePhoneNumber("123");
        Assertions.fail("ValidatePhoneNumber failed");
    } catch (IllegalArgumentException ex) {
        Assertions.assertEquals("PhoneNumber is: Invalid",ex.getMessage());
    }
}


@Test

  public void testInvalidPinCodeFormat() {
    try {
        UserDetailsValidator.validatePinCode("1234567");
        Assertions.fail("ValidatePincode failed");
    } catch (IllegalArgumentException ex) {
        Assertions.assertEquals("Pincode is: Invalid", ex.getMessage());
    }
   }


@Test

  public void testInvalidAddressLength() {
    try {
        UserDetailsValidator.validateAddress("A");
        Assertions.fail("Validateaddress failed");
    } catch (IllegalArgumentException ex) {
        Assertions.assertEquals("Address should be in minimum 5 letters and maximum 30 letters", ex.getMessage());
    }
   }


@Test

	public void testInvalidPasswordFormat() {
    try {
        UserDetailsValidator.validatePassword("weakpassword");
        Assertions.fail("ValidatePassword failed");
    } catch (IllegalArgumentException ex) {
        Assertions.assertEquals("The password is invalid", ex.getMessage());
    }
  }

}
