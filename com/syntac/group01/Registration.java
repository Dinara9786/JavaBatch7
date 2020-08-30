package com.syntac.group01;

//Create Registration Class in which you would have variables as email, userName and password 
//that have an access scope only within its own class. After creating an object of the class
//user should be able to call methods and in each method separately pass values to set users email, 
//username and password. 
//Requirements: 
//Valid email consider to be only yahoo
//Valid userName and password cannot be empty and should be of length larger than 6 characters. 
//Also valid password cannot contain userName.

public class Registration {
	
	private String email, userName, password;
	static String mail = "yahoo";
	
	public String getEmail() {
		return email;
	}
	
	public String getUsename() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail() {
		if (email.contains(mail)) {// checkign if its contain "yahoo";
			this.email=email;
		}
	}
	
	public void setUserName (String userName) {//set username;
		if (!userName.isEmpty()) {
			if (userName.length()>6) {
				if (!password.contains(userName)) {
					this.password=password;
			} else {
			System.out.println("Passwordd cannot contain username");
			}
		} else {
			
			System.out.println("Password should be larger than  characters");
		}
		}
		public void setPassword (String password) {
		if (password.length()>6 && !password.isEmpty()&& !password.contains(userName)) {
			this.password = password;
		}
	}
}
