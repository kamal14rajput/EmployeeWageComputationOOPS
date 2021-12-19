package com.bridgelabz;

public class DailyEmpWage {

	public static void main(String[] args) {
		DailyWage dailywage = new DailyWage();
		dailywage.empWages();
	}
}

class DailyWage {
	public static final int IS_FULL_TIME = 1;
    public static int EMP_RATE_PER_HOUR = 20;
	int empHrs = 0;
    int empWage = 0;
    public void empWages() {
    	double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == IS_FULL_TIME){
                empHrs = 8;
        }else{
                System.out.println("Employee is Absent");
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }    
}

