package com.tnsif.daysix;
import com.tnsif.dayfive.Sample;
public class UsingAccess {

	public static void main(String[] args) {
		Sample s=new Sample();
		//private members can't be accessible
		//s.privateNo=100;
		//default members can't be accessible in another package		
		//s.defaultNo=200;
		s.no=401;
		//protected members can't be accessible in non subclass of another package		
		//s.protectedNo=300;
		System.out.println(s);
	}

}
