package com.tnsif.daysix.hasarelationship;

public class Executor {

	public static void main(String[] args) {
		Department d=new Department(10,"IT", 12);
		Department d1=new Department(20,"Account", 5);
		Department d2=new Department(30,"HR", 4);
		
		Employee e=new Employee(101, "Shiwani",67000,d);
		System.out.println(e);
		
		Employee e1=new Employee(102, "Pankaj",34000,d1);
		System.out.println(e1);
		
		Employee e2=new Employee(103, "Dhruv", 50000, d2);
		System.out.println(e2);
		

	}

}
