package Condi;
import java.util.Scanner;
public class CondiPrac8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name; char time;
		System.out.print("Enter employee name: ");
		name = s.nextLine();
		System.out.print("Press F for Full Time or P for Part Time: ");
		time = s.next().charAt(0);
		if(time == 'P') {
			System.out.println("--- Part Time Employee ---");
			double perHour; int numHours, overTime;
			System.out.print("Enter rate per hour: ");
			perHour = s.nextDouble();
			System.out.print("Enter no. of hours worked: ");
			numHours = s.nextInt();
			System.out.print("Enter no. of overtime: ");
			overTime = s.nextInt();
			System.out.println("_________________________________");
			double basicPay, overtimePay, grossPay;
			System.out.println("Employee Name: " + name);
			basicPay = perHour * numHours;
			System.out.println("Basic Pay:     " + basicPay);
			overtimePay = perHour * overTime * 1.25;
			System.out.println("Overtime Pay:  " + overtimePay);
			System.out.println("_________________________________");
			grossPay = basicPay + overtimePay;
			System.out.println("Gross Pay:     " + grossPay);
		}else if(time == 'F') {
			System.out.println("--- Full Time Employee ---");
			double basicPay, grossPay;
			System.out.print("Enter Basic Pay: ");
			basicPay = s.nextDouble();
			System.out.println("_________________________________");
			grossPay = basicPay;
			System.out.println("Gross Pay:     " + grossPay);
		}else {
			System.out.println("Invalid Status.");
		}
	}

}
