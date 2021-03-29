package com.mindnerves.practice;

import java.util.ArrayList;
import java.util.List;
public class Practice1 {
	public static List<Integer> array1(int demo[])
	{
		List<Integer>al=new ArrayList<Integer>();
		for(int i=0; i<demo.length;i++)
		{	
			// STEP 1
			// Logic to print first 3 element as it is [As soon as i's value becomes 3 it stopp's printing rest of the element]
			if(i==3)
			{
				break;
			}
			al.add(demo[i]);
		}
		System.out.println(al);
		return al;
	}
	// Main method
	public static void main(String args[])
	{
		int demo[]= {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		Practice1.array1(demo);
	}

}

Input:2,4,8,5,12,15,6,10,7,30,25,43,46,45,21
OutPut:2,4,8


Break Statement:
-Break statement usually terminate the loop whenever a wrong condition encounter. Then execution will be transfer to the immediate statement after the step where the execution eas stopped.

- In short, as soon as wrong condition encounter in the loop it terminates the execution and come out of the loop.
