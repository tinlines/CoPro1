import java.util.Scanner;
public class breakAndContinue1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0, num;
		while(true) {
			System.out.println("type 0");
			System.out.print("enter a num: ");
			num = s.nextInt();
			
			if(num == 0) {
				System.out.println("You entered 0");
				break;
			}
			sum = sum + num;
			System.out.println("The sum of entered number is: " + sum);			
		}
	}
}
