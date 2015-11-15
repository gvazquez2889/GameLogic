package textBasedVideoPoker;
import java.util.ArrayList;
import java.util.*;

public class Deck {
	
	public enum Suit{
		HEART, DIAMOND, CLUBS, SPADES
	}
	//private static ArrayList<Card> deck2;
	//private static Queue<Card> deck;
	private static Card[] deck;
	
	public Deck(){
		//deck2 = new ArrayList<Card>();
		deck = new Card[52];
	}
	// Card(cardSuit,cardValue)
	// function used to fill the deck with 
	// cards.
	public void populateDeck(){
		int i = 0;
		deck = new Card[52];
		for(int suit = 1; suit <=4 ; suit++) {
			for(int value = 1; value <=13;value++){				
				// creates a new object and places it into the array
				// should loop through and fill the array with the
				// desired values.
				deck[i] = new Card(suit,value);
				i++;
			}			
		}		
	}
	// function used to print out the deck.
	public void printDeck(){
		for(int i = 0; i <= 51 ; i++) {
			if (deck[i].getCardValue() == 1) 
				System.out.println("A of " + deck[i].getCardSuit());
			// prints out the values in the deck.
				System.out.println(deck[i]);			
		}	
	}
	// this function will be used to shuffle the poker deck
	// to shuffle I must use a dummy variable that will be used to 
	// store the card object that I pull from the array.
	// Plans :
	// Use a loop to shuffle the cards around 10,000 times.
	// I will randomly choose a card from the 52 that exist in the array.
	// Next I will choose another card position randomly from the 52 and store it
	// into a dummy variable to hold the card.
	// Once the card is being stored in a certain spot, then grab the other card
	// and essentially switch places between the two cards.
	public void shuffleDeck(){
		for (int j = 0; j <10000; j++ ) {
			for(int i = 0; i <52 ; i++){		
				//    System.out.println(answer);
				//used to hold the card			
				Card dummy1 = new Card();
				Card dummy2 = new Card();
				dummy1 = deck[i];
				Random rn = new Random();
				int randomCard = rn.nextInt(51) + 1;
				while (randomCard < i) {
					randomCard = rn.nextInt(51) + 1;
				}				
				dummy2 = deck[randomCard];				
				deck[i] = dummy2;
				deck[randomCard] = dummy1;				
			}
		}
		
	}
		
	// this function will return the completed 
	// deck to manipulate it within the Hand class.
	public Card[] getDeck(){
		return deck;
	}
	
}
