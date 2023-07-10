package com.fssa.srikannan.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidator {
	public static boolean validate(UserDetails user) {
		if(user==null) {
			throw new IllegalArgumentException("Argument Cannot be null");
		}	
		ValidateName(user.getname());
		validateEmail(user.getEmail());
		validatePhoneNumber(user.getPh_num());
		validatePinCode(user.getPincode());
		validateAddress(user.getaddress());
		validatePassword(user.getPassword());	
		
		return true;
		
	}
	

		public static boolean ValidateName(String name)throws IllegalArgumentException {
			if (name == null || "".equals(name.trim()) || name.length() < 2) {
				throw new IllegalArgumentException("Name is: Invalid");
			}
			
			String nameregex= "^[A-Za-z]{2,30}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(name);
			Boolean isMatch = matcher.matches();
			
			if(Boolean.FALSE.equals(isMatch)) {
				throw new IllegalArgumentException("Name is: Invalid");
				
			}
			return true;
			
		}
		
		public static boolean validateEmail(String email) throws IllegalArgumentException {
			
			if(email == null) {
				throw new IllegalArgumentException("Email is: Invalid");
			}
			
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			Boolean isMatch = matcher.matches();
			if (Boolean.TRUE.equals(isMatch)) {
				return true;
			} else {
				throw new IllegalArgumentException("The email address is: Invalid");
			}
		}
		
		public static boolean validatePhoneNumber(String ph_num) throws IllegalArgumentException {
			String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(ph_num);
			Boolean isMatch = matcher.matches();
			if (Boolean.TRUE.equals(isMatch)) {
				return true;
			} else {
				throw new IllegalArgumentException("PhoneNumber is: Invalid");
			}
		}
	
		public static boolean validatePinCode(String pincode) throws IllegalArgumentException {
			String regex = "^[1-9][0-9]{5}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(pincode);
			Boolean isMatch = matcher.matches();
			if (Boolean.TRUE.equals(isMatch)) {
				return true;
			} else {
				throw new IllegalArgumentException("Pincode is: Invalid");
			}
		}
		
		public static boolean validateAddress(String address)throws IllegalArgumentException {
			if (address == null || "".equals(address.trim())) {
				throw new IllegalArgumentException("Address is: Invalid");
			}
			
			String nameregex= "^[A-Za-z]{5,30}$";
			Pattern pattern = Pattern.compile(nameregex);
			Matcher matcher = pattern.matcher(address);
			Boolean isMatch = matcher.matches();
			
			if(Boolean.FALSE.equals(isMatch)) {
				throw new IllegalArgumentException("Address should be in minimum 5 letters and maximum 30 letters");
				
			}
			return true;
			
		}
		
		public static boolean validatePassword(String password)throws IllegalArgumentException {
			if (password == null || "".equals(password.trim())) {
				throw new IllegalArgumentException("Password is: Invalid");
			}
			String passwordregex= "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
			Pattern pattern = Pattern.compile(passwordregex);
			Matcher matcher = pattern.matcher(password);
			Boolean isMatch = matcher.matches();
			
			if(Boolean.FALSE.equals(isMatch)) {
				throw new IllegalArgumentException("The password is invalid");
				
			}
			return true;
			
		}
}
