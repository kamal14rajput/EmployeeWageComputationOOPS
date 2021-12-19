package com.bridgelabz;

public class WagesCondition {
	
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		int totalWorkingDays = 0, totalEmpHrs = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			DailyWage dailywage = new DailyWage();
			dailywage.empWages();
		}	
	}
}
class DailyWage {

	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
    public static int EMP_RATE_PER_HOUR = 20;
    public static int NUM_OF_WORKING_DAYS = 20;
    int empHrs = 0;
    int empWage = 0;
    int totalEmpWage = 0;
    
    public void empWages() {
    	for (int day = 0; day <  NUM_OF_WORKING_DAYS; day++) {
    		int empCheck = (int)Math.floor(Math.random()*10)%3;
    		switch (empCheck) {
    			case IS_PART_TIME:
    					empHrs = 4;
    					break;
    			case IS_FULL_TIME:
    					empHrs = 8;
    					break;
    			default:
    					empHrs = 0;
    		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " + empWage);  
    	}
    	System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
