package FirstSem;

public class Practice2 {

	public static void main(String[] args) {
		int x, y; 
		System.out.println("Multiplication Table of 1-10:"); 
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) { 
				System.out.print(x * y + "\t");
			}
			System.out.println();	
		}
	}

}
