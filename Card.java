package textBasedVideoPoker;
//import java.*;


// design the template for 1 card.
public class Card {
	
	private int cardSuit;
	private int cardValue;
	
	public Card(int suit, int value){
		cardSuit  = suit;
		cardValue = value;
	}
	public Card(){
		cardSuit = 0;
		cardValue = 0;
	}	
	public int getCardSuit(){
		return cardSuit;
	}
	public int getCardValue(){
		return cardValue;
	}	
	public String toString(){
		String str = "Card Value: " + getCardValue() + 
					 " Card Suit : " + getCardSuit();
		return str;
	}
}
