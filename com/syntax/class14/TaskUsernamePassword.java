package com.syntax.class14;

import java.util.Scanner;

public class TaskUsernamePassword {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please create username");
		String username = scan.nextLine();
		
		System.out.println("Please create password");
		String password = scan.nextLine();
		
		if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Password and username cannot be empty");
		}else {
			} if (password.length()>=8) {
				if (!password.contains(username)) {
					System.out.println("Please confirm your password");
					String passwordConfirm = scan.nextLine(); 
					
					 if (password.equals(passwordConfirm)) {
						System.out.println("Username and Password have been created");	
					} else {
						System.out.println("Passwords do not match");
					}
				}else { 
					System.out.println("The password cannot contain username");
				}
			} else {

				System.out.println("Password is too short");
				
			}				
				
			}//HW continue asking user for username and password until all the requirements are met and credentials are created
		
	}


