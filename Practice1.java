package FirstSem;

public class Practice1 {

	public static void main(String[] args) {
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);
		System.out.println("_____________________________________");
		
		String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        //char[] charArray = new char[len];
        
        for (int i = 0; i < len; i++) {
        	tempCharArray[i] = palindrome.charAt(i);
        	
        }
        
	}

}
