// Author: Julia Green
// This program uses several premade classes in order to test their functionality.
import textio.TextIO;

public class TestClass {
    public static void main(String[] args) {
		Deck deck;   
		deck = new Deck();         
		Card card;            
		BlackjackHand hand;   
		int cardsInHand;      
		boolean repeat;        
      
		do {
			deck.shuffle();
			hand = new BlackjackHand(); 
			cardsInHand = 2 + (int)(Math.random()*5);
			System.out.println();
			System.out.println();
			System.out.println("This hand contains:");
			for (int i = 1; i <= cardsInHand; i++) {
				card = deck.dealCard();
				hand.addCard("   " + card);
				System.out.println(card);
			}
			
			System.out.println("The value of this hand is " + hand.getBlackjackValue());
			System.out.print("Would you like to repeat? ");
			repeat = TextIO.getlnBoolean();
			System.out.println();
		} while (repeat == true);
	} // end main
}  // end class TestClass