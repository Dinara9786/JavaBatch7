package com.syntax.class15;

public class TaskSentence {
	
	public static void main(String[] args) {
		
		String sentence = "I am learning Java";
		sentence = sentence.replaceAll(" ","");
		System.out.println(sentence);
		
		// one of the interview questions
		String sentence2 = "I am leaRning Java 7464$&# great!";
		sentence2= sentence2.replaceAll("[^A-Za-z]", "");
		System.out.println(sentence2.length());
		
		String word = "Is it saturday? is it raining? Do we have a Java Class today?";
		
		String []  b = word.split("[?]");
		int length = b.length;
		System.out.println(length);
	}

}
