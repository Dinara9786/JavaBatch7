package com.syntax.class33;

public class SystemProperties {

		public static void main(String[] args) {
			
			String directory = System.getProperty("user.dir");
			System.out.println(directory); // the full path 
		}
}
