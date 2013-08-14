public class Card implements CardInterface {
	private int rank;
	private String suit;
	private String[] validSuits = { "♠", "♥", "♦", "♣" };

	Card(int rank, String suit) {
		if (isValidRank(rank) && isValidSuit(suit)) {
			this.setRank(rank);
			this.setSuit(suit);
		} else {
			throw new IllegalArgumentException("rand or suit is not valid\n");
		}
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void printCard() {
		System.out.println(this.rank + this.suit);
	}

	public boolean isValidRank(int rankNum) {
		return (rankNum <= 13 && rankNum > 0);
	}

	public boolean isValidSuit(String suitType) {
		for (String s : validSuits) {
			if (suitType == s)
				return true;
		}
		return false;
	}

}
