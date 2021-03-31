package com.array.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MindnervesPractice {
	public static void array1(int demo[])
	{
		List<Integer>al=new ArrayList<Integer>();
		for(int i=0; i<demo.length;i++)
		{	
			if(i==3 || i==5 ||i==7 || i==13)
			{//i=i+2;
				continue;
			}
			if(i==9)
				i=i+2;
			al.add(demo[i]);
		}
		Collections.addAll(al, demo[3], demo[5], demo[7], demo[9],demo[10],demo[13]);
		System.out.println(al);
	}
	public static void main(String args[])
	{
		int demo[]= {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		Practice1.array1(demo);
	}
}

Input: 2,4,8,5,12,15,6,10,7,30,25,43,46,45,21
  
OutPut:[2, 4, 8, 12, 6, 7, 43, 46, 21, 5, 15, 10, 30, 25, 45]
