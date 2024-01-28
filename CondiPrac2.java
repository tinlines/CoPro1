package Condi;
import java.util.Scanner;
public class CondiPrac2 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double coPro1, math, uts, computing, average;
	System.out.print("CoPro1   : ");
	coPro1 = s.nextDouble();
	System.out.print("Math     : ");
	math = s.nextDouble();
	System.out.print("UTS      : ");
	uts = s.nextDouble();
	System.out.print("Computing: ");
	computing = s.nextDouble();
	average = (coPro1 + math + uts + computing) / 4;
	System.out.println();
	System.out.printf("Average  :%.2f", average);
	System.out.println();
	if(average > 100) {
		System.out.println("Invalid Grade");
	}else if(average >= 97.50) {
		System.out.println("(1.00) Excellent");
	}else if(average >= 94.50) {
		System.out.println("(1.25) Very Good");
	}else if(average >= 91.50) {
		System.out.println("(1.50) Very Good");
	}else if(average >= 75) {
		System.out.println("Passed");
	}else{
		System.out.println("Failed");
	}
	}
}
