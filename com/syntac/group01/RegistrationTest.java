package com.syntac.group01;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		Registration r = new Registration();
		r.setEmail ("gp@yahoo.com");
		System.out.println(r.getEmail());
		
		r.setUsername("girls power");
		System.out.println(r.userName());
		
		r.setPassword("Hihihihi");
		System.out.println(r.getPassword());
	}

}
