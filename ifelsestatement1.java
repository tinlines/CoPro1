import java.util.Scanner;
public class ifelsestatement1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		int grade = s.nextInt();
		if(grade >= 75) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}
}
