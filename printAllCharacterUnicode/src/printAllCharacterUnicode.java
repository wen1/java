public class printAllCharacterUnicode {
	public static void main(String[] args) {
		for (int i = 0; i <= 256; i++) {
			char c = (char)i;
			if (c == 'A') System.out.println("A is at: "+i);
			System.out.println(c);
		}
	}
}
