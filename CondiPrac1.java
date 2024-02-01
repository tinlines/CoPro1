import java.util.Scanner;
public class CondiPrac1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("You have access");
		}else if(age >= 13){
			System.out.println("You need parent consent");
		}else {
			System.out.println("Access denied");
		}
	}
}
