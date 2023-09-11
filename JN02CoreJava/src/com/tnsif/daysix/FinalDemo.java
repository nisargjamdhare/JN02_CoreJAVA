package com.tnsif.daysix;

public class FinalDemo {

	public static void main(String[] args) {
		UsingFinal obj=new UsingFinal();
		System.out.println(obj.getSize());
		System.out.println(UsingFinal.getLength());
		obj=new UsingFinal(50);
		System.out.println(obj.getSize());
		System.out.println(UsingFinal.getLength());				
	}

}
