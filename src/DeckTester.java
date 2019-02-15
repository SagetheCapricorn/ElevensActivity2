/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        System.out.println("\n"+"----DECK 1----"+"\n");
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck deck1= new Deck(ranks, suits, pointValues);
        System.out.println(deck1.toString());
        deck1.deal();
        System.out.println("Dealed 1 card" + " \nDeck size: "+ deck1.size());

        System.out.println("\n"+"----DECK 2----"+"\n");
        String[] ranks1 = {"jack", "10", "ace"};
        String[] suits1 = {"heart", "spades"};
        int[] pointValues1 = {11, 12, 13};
        Deck deck2= new Deck(ranks1, suits1, pointValues1);
        System.out.println(deck2.toString());
        deck2.deal();
        System.out.println("Dealed 1 card" + " \nDeck size: "+ deck2.size());
        deck2.deal();
        System.out.println("Dealed 1 card" + " \nDeck size: "+ deck2.size());

        System.out.println("\n"+"----DECK 3----" +"\n");

        String[] ranks2 = {"2", "9", "5"};
        String[] suits2 = {"heart", "spades"};
        int[] pointValues2 = {11, 12, 13};
        Deck deck3= new Deck(ranks2, suits2, pointValues2);
        deck3.deal();
        deck3.deal();
        deck3.deal();
        deck3.deal();
        System.out.println("Dealed 4 cards" + " \nDeck size: "+ deck3.size());
        System.out.println(deck3.toString());
    }
}

