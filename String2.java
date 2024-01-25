public class String2 {

	public static void main(String[] args) {
		String str1 = "Class", str2 = " class ";
		
		if(str1.equalsIgnoreCase(str2.trim())) { //since it's on .equalsIgnoreCase, the output will be true otherwise false
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
