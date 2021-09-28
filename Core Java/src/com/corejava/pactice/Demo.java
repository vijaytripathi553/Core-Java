package com.corejava.pactice;

class Demo extends InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName
{
	public String doAddition(int a,int b)
	{
		int c=a+b;
		return"Addition form Derived Class"+" "+c;
	}
	
	
	//Mian method
	public static void main(String[] args) {
		
		// Creating an object of derived class
		//Demo d=new Demo();   //derived class doAddition() method is called
		
		InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName d=new Demo();   //derived class doAddition() method is called
		
		d=new InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName();        // Now it will call to base class doAddition method
		
		
		// InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName d=new InheritanceWhenBothBaseAndDerivedClassHaveMethodWithSameName(); //base class doAddition() method is called
		
		
		System.out.println(d.doAddition(20, 10));
		
	}
}
