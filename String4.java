public class String4 {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog.";
		int letter = sentence.indexOf("h"); 
		System.out.println("Index " + letter); //the index start at zero so the index of char h in sentence is 1 while the T is 0
	}
}
