package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInfo {
	static Map<String,Object> map = new HashMap<>();
	static {
		User u1 = new User("chikky","sudha",94910,"female","bhargavi@gmail.com","Chintu");
		map.put("bhargavi@gmail.com",u1 );
		User u2 = new User("chintu","sudha",94901,"male","bharath@gmail.com","Chikky");
		map.put("bharath@gmail.com",u2 );
		User u3 = new User("latha","sudhaveni",64378,"female","latha@gmail.com","ChintuChikky");
		map.put("latha@gmail.com",u3);
		User u4 = new User("Gangadhar","sudhaveni",64387,"male","gangadhar@gmail.com","ChikkyChintu");
		map.put("gangadhar@gmail.com",u4 );
	}
	public static void userRegistration() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Email");
		String email = s.next();
		boolean allow = Validation.isValid(email);
		if(allow) {
			if(map.containsKey(email)) {
				System.out.println("Email already exist");
			}
			else {
				System.out.println("Enter FirstName");
				String firstName = s.next();
				System.out.println("Enter LastName");
				String lastName = s.next();
				System.out.println("Enter MobileNumber");
				int mobileNumber = s.nextInt();
				System.out.println("Enter Gender");
				String gender = s.next();

				System.out.println("Enter Passwod");
				String password = s.next();

				User user = new User(firstName,lastName,mobileNumber,gender,email,password);
				map.put(email, user);
			}
		}
		else {
			System.out.println("enter valid email address");
		}
	}
	public static void userLogin() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter email");
		String email = s.next();
		if(map.containsKey(email)) {
			System.out.println("Enter Password");
			String pass = s.next();
			User ob = (User)map.get(email); 
			if(ob.getPassword().equals(pass))
				System.out.println("Login Success");
			else {
				System.out.println("Password is incorrect");
			}
		}else {
			System.out.println("Email doesn't exist");
              
		}
	}

	public static void getDetails() {
		System.out.println(map.get("sudha"));

	}

}
