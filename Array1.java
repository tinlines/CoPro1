package FirstSem;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a, b, c, d, e, f; int num;
		String[] name = new String[3];
		System.out.println("Enter 3 first names: ");
		name[0] = s.nextLine();
		name[1] = s.nextLine();
		name[2] = s.nextLine();
		System.out.println("Possible names are:");
		a = name[0] + " " + name[1];
		System.out.println("1 - " + a);
		b = name[0] + " " + name[2];
		System.out.println("2 - " + b);
		c = name[1] + " " + name[0];
		System.out.println("3 - " + c);
		d = name[1] + " " + name[2];
		System.out.println("4 - " + d);
		e = name[2] + " " + name[0];
		System.out.println("5 - " + e);
		f = name[2] + " " + name[1];
		System.out.println("6 - " + f);
		System.out.print("Enter 1-6 to select a name: ");
		num = s.nextInt();
		switch(num) {
		case 1:
			System.out.println("The initials for " + a + " is " + name[0].charAt(0) + name[1].charAt(0) + ".");
			System.out.println("Suggested username: " + a.replace(' ', '_').toLowerCase());
			break;
		}
		

	}

}
