package com.interview.question;

public class DifferentWaysToConvertAnIntegerToString {
	
	private static String waysToConvertAnIntegerToString(int a)
	{
		// 1st way to convert an String to Integer using Integer.toString() method      (First create one String variable )
	
		String firstWayToConvertAnIntegerToString=Integer.toString(a);
		System.out.println("Using Integer.toString() method :"+firstWayToConvertAnIntegerToString);
		
		
		// 2nd way to convert an String to Integer using String.valueOf() method     (In this case String hold the value of (anything like int, float double)
		// NOTE : String .valueOf() method can hold anyy type of value like in , char float double etc.
		String secondWayToConvertAnIntegerToString=String.valueOf(a);
		System.out.println("Using String.valueOf() method :"+secondWayToConvertAnIntegerToString);
		
		
		// 3rd way to convert an String to Integer using String.format() method which takes 2 parameters one is the format for example if you want to convert to integer so format would be '%d'
		String thirdWayToConvertAnIntegerToString=String.format("%d", a);
		System.out.println("Using String.format() :"+thirdWayToConvertAnIntegerToString);
		
		
		return "";
		
	}

	
	// Main Method
	public static void main(String[] args) {
		int a=52;
		
		String result=waysToConvertAnIntegerToString(a);
		
	}

	
}
