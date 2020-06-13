package com.syntax.class04;

public class NestingElseIf {
	
	public static void main(String[] args) {
		
		// A student takes a quizz, and if the student completed quiz we will check the score
		// If score >= 90 ---> A, Great job!
		// if score >= 80 ---> B, Well done!
		// if score >= 70 --> C, You just passed!
		// else --> F, You failed!
		// if student did not take the quiz --> Please finish your quiz!
		
		boolean completed = true;
		int score = 82;
		
		if (completed) {
			if (score>=90)
			System.out.println("Great Job");
		} else if (score >=80) {
			System.out.println("Well done");
		}  else if (score >=70) {
			System.out.println("You just passed");
		} else {
			System.out.println("failed");
		}

		System.out.println ("Please finish your quiz!");
		
		
		}
		
		
	}


