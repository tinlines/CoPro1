package FirstSem;

public class Practice5 {

	public static void main(String[] args) {
		int month = 12, week = 4, day = 7, i = 1;
		while(i <= month) {
			System.out.println("Month: " + i);
			
			for(int j = 1; j <= week; j++) {
				System.out.println("Weeks: " + i);
				
				for(int k = 1; k <= day; k++) {
					System.out.println("Dys: " + k);
					
				}
				i++;
			}
		}

	}

}
