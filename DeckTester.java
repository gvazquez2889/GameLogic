package textBasedVideoPoker;

public class DeckTester {

	public static void main(String[] args) {
		Deck d = new Deck(); // create the deck object
		d.populateDeck(); // populate the deck with cards
		d.printDeck();   // print out the populated deck 
		
		System.out.println("*************Start to shuffle Deck****************");
		d.shuffleDeck();// shuffled deck
		//print newly shuffled deck		
		d.printDeck();
		System.out.println("*************Shuffle Deck Complete****************");
	}

}
