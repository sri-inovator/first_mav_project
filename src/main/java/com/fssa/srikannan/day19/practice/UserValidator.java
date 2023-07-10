//package com.fssa.srikannan.day19.practice;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class UserValidator{
//// getting the userdetail validatye
//	public static boolean  validate(User user) {
//		
//		idValidator(user.id);
//		nameValidator(user.name);
//		emailValidator(user.email);
//	   passwordValidator(user.password);
//		
//		
//		
//		return true;
//	}
//	
//	
//	//id validate
//	
//	public static boolean idValidator(String id) throws IllegalArgumentException {
//		
//		
//		String intregex= "^[1-9]\\d{7}$";
//		Pattern pattern = Pattern.compile(intregex);
//		Matcher matcher = pattern.matcher(id);
//		Boolean isMatch = matcher.matches();
//		
//		if(!isMatch) {
//			throw new IllegalArgumentException("The entered digit is invalid");
//			
//		}
//		
//		return true;
//		
//		
//		
//	}
//	// name validate
//	public static boolean nameValidator(String name)throws IllegalArgumentException {
//		
//		String nameregex= "^[A-Za-z]{2,}$";
//		Pattern pattern = Pattern.compile(nameregex);
//		Matcher matcher = pattern.matcher(name);
//		Boolean isMatch = matcher.matches();
//		
//		if(!isMatch) {
//			throw new IllegalArgumentException("The name should be in minimum 2 letters");
//			
//		}
//		
//		return true;
//		
//	}
//	// email validate
//	public static boolean emailValidator(String email) throws IllegalArgumentException{
//		
//		
//		String emailregex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
//		Pattern pattern = Pattern.compile(emailregex);
//		Matcher matcher = pattern.matcher(email);
//		Boolean isMatch = matcher.matches();
//		
//		if(!isMatch) {
//			throw new IllegalArgumentException("The email is invalid");
//			
//		}
//		
//		return true;
//	}
//	// password  validate
//	public static boolean passwordValidator(String password)throws IllegalArgumentException {
//		String passwordregex= "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
//		Pattern pattern = Pattern.compile(passwordregex);
//		Matcher matcher = pattern.matcher(password);
//		Boolean isMatch = matcher.matches();
//		
//		if(!isMatch) {
//			throw new IllegalArgumentException("The password is invalid");
//			
//		}
//		return true;
//	}
//}
//
//
//
//
//
//
//
