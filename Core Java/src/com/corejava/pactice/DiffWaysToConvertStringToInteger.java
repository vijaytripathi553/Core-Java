package com.interview.question;

public class DiffWaysToConvertStringToInteger {
	
	private static int waysToConvertAnStringToInteger(String a)
	{
		// 1st way to convert an String to Integer using Integer.parseInt() method      
	
		int firstWayToConvertAnStringToInteger=Integer.parseInt(a);
		System.out.println("Using Integer.parseInt() method :"+firstWayToConvertAnStringToInteger);
		
		
		// 2nd way to convert an String to Integer using Integer.valueOf() method     (In this case String hold the value of (anything like int, float double)
		
		int secondWayToConvertAnStringToIntegerInteger=Integer.valueOf(a);
		System.out.println("Using Integer.valueOf() method :"+secondWayToConvertAnStringToIntegerInteger);
		
		
		
		return 0;
		

}
	
	// Main Method
	
	public static void main(String[] args) {
		String a="1234";
		int result=waysToConvertAnStringToInteger( a);
		System.out.println(result);
	}
}
