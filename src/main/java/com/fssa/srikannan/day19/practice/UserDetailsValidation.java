//package com.fssa.srikannan.day19.practice;
//
//import java.util.Scanner;
//public class UserDetailsValidation {
//	public static void main(String[] args) {
//		/*
//		 * Create a separate class UserValidator and a method UserValidator.validate(User user)
//		 *  that validate each of the attributes of the below class.
//		 *   Please add the validation of id should be Positive, name should be of minimum length 2,
//		 *     use the Practice#4 rules for validating password, use Practice#2 to validate email.
//		 *      Use the below User class
//		 */
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the user id with digit that contain 8 digit");
//		
//		String userid=scan.next();
//		
//		System.out.println("Enter the user name");
//		String username=scan.next();
//		
//		System.out.println("Enter the user password");
//		String userpassword=scan.next();
//		
//		System.out.println("Enter the user email");
//		String useremail=scan.next();
//		scan.close();
//		
//		
//		
//		User classuser=new User();
//		classuser.setId(userid);
//		classuser.setName(username);
//		classuser.setPassword(userpassword);
//		classuser.setEmail(useremail);
//		
//		
//		
//		try {
//		
//		boolean valid=UserValidator.validate(classuser);
//	
//		if(valid) {
//			System.out.println("All details is in correct format");
//		}
//		
//		
//		
//		}
//		catch(IllegalArgumentException ex) {
//			System.out.println(ex.getMessage());
//			ex.printStackTrace();
//		}
//		
//		finally {
//			System.out.println("The program is ended");
//		}
//		
//	}
//}