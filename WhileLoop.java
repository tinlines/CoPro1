package FirstSem;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max, even = 0; //this is for even/odd numbers
		System.out.print("Enter number: ");
		max = s.nextInt();
		
		while(even <= max) {
			System.out.println(even);
			even += 2;
		}

	}

}
