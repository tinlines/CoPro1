package Condi;
import java.util.Scanner;
public class CondiPrac7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name; char status;
		
		System.out.print("Enter employee name: ");
		name = s.nextLine();
		
		System.out.print("Press F for Full Time or P for Part Time: ");
		status = s.next().charAt(0);
		
		switch(status) {
		case 'P':
			System.out.println("--- Part Time Employee ---");
			double perHour, basicPay, overtimePay, grossPay; 
			int numHours, overTime;
			
			System.out.print("Enter rate per hour: ");
			perHour = s.nextDouble();
			
			System.out.print("Enter no. of hours worked: ");
			numHours = s.nextInt();
			
			System.out.print("Enter no. of overtime: ");
			overTime = s.nextInt();
			
			System.out.println("_________________________________");
			
			System.out.println("Employee Name: " + name);
			
			basicPay = perHour * numHours;
			System.out.println("Basic Pay:     " + basicPay);
			
			overtimePay = perHour * overTime * 1.25;
			System.out.println("Overtime Pay:  " + overtimePay);
			
			System.out.println("_________________________________");
			
			grossPay = basicPay + overtimePay;
			System.out.println("Gross Pay:     " + grossPay);
			
			break;
			
		case 'F':
			System.out.println("--- Full Time Employee ---");
			
			System.out.print("Enter Basic Pay: ");
			basicPay = s.nextDouble();
			
			System.out.println("_________________________________");
			
			System.out.println("Employee Name: " + name);
			
			System.out.println("Basic Pay    : " + basicPay);
			
			System.out.println("_________________________________");
			
			grossPay = basicPay;
			System.out.println("Gross Pay:     " + grossPay);
			
			break;
			
		default:
			System.out.println("Invalid Status.");
			
		}
	}

}
