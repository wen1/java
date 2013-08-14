import java.util.ArrayList;
import java.util.Random;

public class Deck {
	ArrayList<Card> cards;
	
	Deck(){
		String[] suitRange = { "♠", "♥", "♦", "♣" };
		cards = new ArrayList<Card>();
		for (int i = 1; i <= 13; i++) {
			for (int j = 0; j < 4; j++) {
				this.addCard(new Card(i, suitRange[j]));
			}
		}
	}
	
	void addCard(Card card) {
		if (cards == null)
			this.cards = new ArrayList<Card>();
		this.cards.add(card);
	}

	Card drawRandomCard() {
		if (cards.size() > 0) {
			Random random = new Random();
			int randomIndex = random.nextInt(cards.size());
			return cards.get(randomIndex);
		} else {
			return null;
		}
	}
}
