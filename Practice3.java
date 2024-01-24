package FirstSem;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<-----FACTORIAL CALCULATOR----->");        
		int num=0;                
		for (int s=1; s<=5; s++){
			System.out.print("Enter a positive number: ");        
			boolean isNumber;
			if (sc.hasNextInt()){
				isNumber = true;                
				num = sc.nextInt();                                      
				int factorial = 1; 
				if (num<=0){                    
					System.out.println("Unable to find the factorial number.\n--End of program--.");
				break;	
				}}else if (num<=1){                    
					System.out.printf("%d! = %d", num, factorial);                    
					System.out.printf("\nThe factorial of %d is : %d\n\n", num, factorial);
					
			}
		}
	}

}
