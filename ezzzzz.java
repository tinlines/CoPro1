package Condi;
import java.util.Scanner;
public class ezzzzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name; char job;
		System.out.print("Enter employee name: ");
		name = scan.nextLine();
		System.out.print("Press F for Full Time or P for Part Time: ");
		job = scan.next().charAt(0);
		if(job == 'P') {
			System.out.println("--- Part Time Employee ---");
			double ratePerHour, basicPay, overTimePay, grossPay; 
			int hoursWorked, overTime;
			
			System.out.print("Enter rate per hour: ");
			ratePerHour = scan.nextDouble();
			
			System.out.print("Enter no. of hours worked: ");
			hoursWorked = scan.nextInt();
			
			System.out.print("Enter no. of overtime: ");
			overTime = scan.nextInt();
			
			System.out.println("_________________________________");
			System.out.println("Employee Name: " + name);
			
			basicPay = ratePerHour * hoursWorked;
			System.out.println("Basic Pay:     " + basicPay);
			
			overTimePay = ratePerHour * overTime * 1.25;
			System.out.println("Overtime Pay:  " + overTimePay);
			
			System.out.println("_________________________________");
			
			grossPay = basicPay + overTimePay;
			System.out.println("Gross Pay:     " + grossPay);
		}else if(job == 'F') {
			System.out.println("--- Full Time Employee ---");
			double basicPay, grossPay;
			
			System.out.print("Enter Basic Pay: ");
			basicPay = scan.nextDouble();
			
			System.out.println("_________________________________");
			
			System.out.println("Employee Name: " + name);
			System.out.println("Basic Pay    : " + basicPay);
			
			System.out.println("_________________________________");
			
			grossPay = basicPay;
			System.out.println("Gross Pay:     " + grossPay);
			
		}else {
			System.out.println("Invalid Input");
		}
	}

}
