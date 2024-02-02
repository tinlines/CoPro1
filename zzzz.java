import java.util.Scanner;
public class zzzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, time;
		System.out.print("Enter employee name: ");
		name = scan.nextLine();
		System.out.print("Press F for Full Time or P for Part Time: ");
		time = scan.nextLine();
		if(time.equals("P")) {
			System.out.println("--- Part Time Employee ---");
			double ratePerHour; int numHours, overTime;
			System.out.print("Enter rate per hour: ");
			ratePerHour = scan.nextDouble();
			System.out.print("Enter no. of hours worked: ");
			numHours = scan.nextInt();
			System.out.print("Enter no. of overtime: ");
			overTime = scan.nextInt();
			System.out.println("_________________________________");
			double basicPay, overtimePay, grossPay;
			System.out.println("Employee Name: " + name);
			basicPay = ratePerHour * numHours;
			System.out.println("Basic Pay:     " + basicPay);
			overtimePay = ratePerHour * overTime * 1.25;
			System.out.println("Overtime Pay:  " + overtimePay);
			System.out.println("_________________________________");
			grossPay = basicPay + overtimePay;
			System.out.println("Gross Pay:     " + grossPay);
		}else if(time.equals("P")) {
			System.out.println("--- Full Time Employee ---");
			double basicPay, grossPay;
			System.out.print("Enter Basic Pay: ");
			basicPay = scan.nextDouble();
			System.out.println("_________________________________");
			grossPay = basicPay;
			System.out.println("Gross Pay:     " + grossPay);
		}else {
			System.out.println("Invalid Status.");
		}
	}
}
