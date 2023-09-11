package com.tnsif.daysix;

public class ChildClassTwo extends UsingFinal{
	@Override
	public void change()
	{
		System.out.println("Child class change method");
	}
	//final method can't be overriden
	public void FinalMethod()
	{
		System.out.println("Child class final method");
	}
}
