package FirstSem;
import java.util.Scanner;
public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; //terminate after entering a num 1 to 10
		while(true) {
			System.out.print("Enter a number between 1 and 10:");
			n = sc.nextInt();
			if(n < 1 || n > 10)
				continue;
			System.out.println(n + " is between 1 and 10");
			break;
		}

	}

}
