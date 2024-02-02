import java.util.Scanner;
public class CondiPrac9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter temperature: ');
		int temperature = s.nextInt();
		
		if (temperature >= 50) {
			if (temperature >= 110) {
				System.out.println("hot");
			}else {
				System.out.println("warm");
			}
		}else {
			System.out.println("cold");
		}
	}
}
