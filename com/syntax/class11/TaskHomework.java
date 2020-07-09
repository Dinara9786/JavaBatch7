package com.syntax.class11;

public class TaskHomework {
	public static void main(String[] args) {
		
		String [][] names = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
			System.out.println(names[0][1] +" " +names[1][0] + " " +names[0][0] + " " +names[1][3]+" "+names[0][2] +" " +names[1][2] +
					" " +names[0][3] + " " +names[1][1]);
			
	
			
			System.out.println("==============================================");
			
			String [][] student = {
					{"Mary", "John", "Lora", "Andrew"},
					{"A", "B", "C", "D"}
			};
			
			int j=0; 
			for (int i=0; i<student[j].length; i++) {
				
				System.out.println(student[j][i] +" "+ student[j+1][i]);
			}
			
			System.out.println("=================================================");
			
			int [][] numbers = {
					{23, 57, 12, 66},
					{12, 56, 34, 98},
					{3, 76, 43, 10}
			};
			
			for (int c = 0; c<numbers.length; c++) {
				for (int k= 0; k<numbers[c].length; k++) {
					System.out.print(numbers[c][k] + " ");
							}
				System.out.println();
				
				System.out.println("=================================================");	
				
				int [][] nums = {
						{57, 12, 66},
						{12, 34, 98},
						{3, 43, 10}
				};
				
				int total = 0;
				for (int m = 0; m<nums.length; m++) {
					for (int l= 0; l<nums[m].length; l++) {
						total +=nums[m][l];
					}		
				}		
				System.out.println(total);
				
			System.out.println("==================================================");
			
				int [][] numero = {
						{57, 12, 66, 12},
						{12, 34, 98, 9},
						{3, 43, 10,33}
				};
				
				for (int w=0; w<numero.length; w++) {
					for(int z=w; z<numero[w].length; z++) {
						int even = numero[w][z];
						
							System.out.println(even);
						}
						
					}
				}
	}
	}

