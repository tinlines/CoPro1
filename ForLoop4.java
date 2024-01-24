public class ForLoop4 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 10;
		for (int i = 1; i <= n; ++i) {
			sum += i;     // sum = sum + i
			System.out.println(sum);//displaying numbers
		}
		System.out.println("Sum = " + sum);//for displaying sum of numbers
	}
}
