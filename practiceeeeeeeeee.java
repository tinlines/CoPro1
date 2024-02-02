import java.util.Scanner;
public class practiceeeeeeeeee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name; int rollNum;
		String fieldNum;
		
		System.out.print("Enter name: ");
		name = s.nextLine();
		
		System.out.print("Enter field: ");
		fieldNum = s.nextLine();
		
		System.out.print("Enter roll number: ");
		rollNum = s.nextInt();
		
		System.out.println(name + rollNum + fieldNum);
		
	}
	

}
