
public class _7_1 {
	public static void main(String[] args) {
		Deck deck = new Deck();
		// draw a random card from a 52 regular deck of cards
		for (int i=0; i < 10; i++){
			deck.drawRandomCard().printCard();
		}
	}
}
