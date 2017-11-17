package black.jack;

import java.util.ArrayList;

public class Deck {
	

	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		newDeck();
	}
		public void newDeck() {
		for (int i = 0; i < 52; i ++) {
			while (true) {
				Card myCard = new Card();
				
				boolean sameCard = false;
				//browses the deck.
				for (int j = 0; j < deck.size(); j++){
					if (myCard.getCard() .equals(deck.get(j).getCard())) {
						sameCard = true;
						break;
					}
				}
				if (sameCard == false){
				deck.add(myCard);
				break;	
				}
			}
		}
	}	
	public Card getCard() {
		Card tempCard = deck.get(0);
		deck.remove(0);
		return tempCard;
	}
}
