package com.tnsif.daysixx.usingprotected;

import com.tnsif.daysix.singleinheritance.StudentAssessment;

public class StudentResult extends StudentAssessment {
	public void displayResult()
	{
		System.out.println(super.toString());
		super.calculateFinalScore();
	}
}
