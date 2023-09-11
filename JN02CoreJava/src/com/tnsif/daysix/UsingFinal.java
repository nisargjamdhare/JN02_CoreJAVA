package com.tnsif.daysix;

public class UsingFinal {
	private final int size;
	private static final int length;
	static
	{
		length=500;
	}
	
	public UsingFinal() {
		size=20;
	}
	
	public UsingFinal(int size)
	{
		//this();
		this.size=size;		
	}
	public int getSize() {
		return size;
	}

	public static int getLength() {
		return length;
	}

	public void change()
	{
		System.out.println("Change method");
		//final can't be reassigned
	//	size++;
	//	length++;
	}	
	
	public final void finalMethod()
	{
		System.out.println("Final Method");
	}
}
