package day_9_assignments.com;

public class EmployeeWageComputation {

	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;
	public static final int WAGE_PER_HR = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		int num;
		int min = 0;
		int max = 5;
		num = (int) (Math.random () );
		
		if (num <=1)
		{
		System.out.println("Employee is present");	
		}
		else if (num < 1)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println( "" );
		}
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < WORKING_DAYS) {
			totalWorkingDays++;

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case PART_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}

			totalEmpHrs += empHrs;
			System.out.println("For Day" + totalWorkingDays + " : Employee Maximum Working Hours are " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * WAGE_PER_HR;
		System.out.println("Total Employee Wage for month is " + totalEmpWage);
	}
}


