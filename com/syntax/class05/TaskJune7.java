package com.syntax.class05;

import java.util.Scanner;

public class TaskJune7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please state your height in inches");
		int height = scan.nextInt();
		
		if(height <=60) {
			System.out.println("Your height is short");
		}else if (height>60 && height<72) {
			System.out.println("Your height is medium");
		}else if (height>72) {
			System.out.println("Your height is tall");
		}
		
		
	}

}
