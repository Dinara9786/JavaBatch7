package com.syntax.class14;

import java.util.Scanner;

public class TASK {
public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);
	
	System.out.println("please enter your username");
	String username = scan.nextLine();
	
	System.out.println("please enter your password");
	String password = scan.nextLine();
	
	String actual="username and password can not be empty";
	
	if(username.isEmpty() || password.isEmpty()) {
		System.out.println(actual);
	}
	
	if(password.length() < 8) {
		System.out.println("it's too short,  but okay");
	}
	
	if(password.contains(username)) {
		System.out.println("password can not contain username");
	}
	
	System.out.println("please confirm your password");
	String confirm = scan.nextLine();
	
	if(!password.equals(confirm)) {
		System.out.println("passwords do not match");
	}else {
		System.out.println("account has been created");
	}
	
	
	
	//continue asking user for username & password untill all credentials are created 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
