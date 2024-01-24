package FirstSem;
import java.util.*;
public class Array2d1 {

	public static void main(String[] args) {
		String[][] busSeat = {
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"},
				{"*", "*", "*", "*"}
		};
		System.out.println("Bus Seat Reservation:");
		for(int row = 0; row < busSeat.length; row++) {
			for(int col = 0; col < busSeat[row].length; col++ ) {
				System.out.print(busSeat[row][col] + "\t");
			}System.out.println();
		}
		

	}

}
