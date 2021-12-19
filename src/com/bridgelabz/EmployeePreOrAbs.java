package com.bridgelabz;

public class EmployeePreOrAbs {

	public static void main(String[] args) {
		Attendance attendance = new Attendance();
		attendance.preOrAbs();
	}
}

class Attendance {
	
	public static final int IS_PRESENT = 1;
	public static final int IS_ABSENT = 0;
	public void preOrAbs() {
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		switch(empCheck) {
		case 0: 
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is present");
			break;
		default:
			System.out.println("Execute again!");
		}
	}
}
