public class String1 {

	public static void main(String[] args) {
		//counting how many character in a String/sentence
		String sentence = "The quick brown fox jumps over the lazy dog.";
		int numLetter = 0;
		char o;
		for (int i = 0; i < sentence.length(); i++) {
			o = sentence.charAt(i);
			if(o == 'o') {
				numLetter++;
			}
		}
		System.out.println(numLetter);
	}
}
