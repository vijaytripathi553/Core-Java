package com.corejava.pactice;

public class InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName {
	
	
	public String doAddition(int a,int b)
	{
		int c=a+b;
		return"This is an addition form Base Class"+" "+c;
	}
}
	
	class Demo extends InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName
	{
		public String doAddition(int a,int b)
		{
			int c=a-b;
			return"This is an substraction form Derived Class"+" "+c;
		}
		
		
		//Mian method
		public static void main(String[] args) {
			
			// Creating an object of derived class
			Demo d=new Demo();
			d.doAddition(20, 10);
			
		}
	}


