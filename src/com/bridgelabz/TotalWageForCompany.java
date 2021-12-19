package com.bridgelabz;

public class TotalWageForCompany {

	public static void main(String[] args) {
		EmpWage emp = new EmpWage();
		emp.calcEmpWageForCompany("Dmart",20,2,10);
		emp.calcEmpWageForCompany("BigBazar",10,4,10);
	}
}

class EmpWage {
	 public static final int IS_PART_TIME = 1;
     public static final int IS_FULL_TIME = 2;
     public static final int EMP_RATE_PER_HOUR = 20;
	 public static final int NUM_OF_WORKING_DAYS = 20;
	 public static final int MAX_HRS_IN_MONTH = 100;
	
	 public static int calcEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {
		 int totalEmpHrs = 0;
		 int totalEmpWage = 0;
		 int totalWorkingDays = 0;
		 
		 while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
			 int empHrs = 0;
			 totalWorkingDays++;
			 int empCheck = (int) Math.floor(Math.random()*10)%3;
           switch ( empCheck ) {
           	case IS_PART_TIME:
           		empHrs = 4;
           		break;
           	case IS_FULL_TIME:
           		empHrs = 8;
           		break;
           	default:
           		empHrs = 0;
           }
           totalEmpHrs += empHrs;
           System.out.println("Day:" + totalWorkingDays + "Emp hrs:" + empHrs);
		  }
		 
		 totalEmpWage = totalEmpHrs * empRate;
		 System.out.println("Total emp wage for company: " + company + " is: " + totalEmpWage ); 
		 return totalEmpWage;
	 }

}
