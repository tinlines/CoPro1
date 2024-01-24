package FirstSem;
import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string: ");//PRINTS THE STRING IN A CHARACTER
		String sentence = s.nextLine();
		for(char i = 0; i < sentence.length(); i++) {
			char a = sentence.charAt(i);
			System.out.println(a);
		}

	}

}
