package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and checks if a hard-coded lucky card is in the hand.
 * Modifier: Kirandeep Kaur
 * Student ID: 991802972
 * Date Modified: 2025-05-27
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Generate random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;

            System.out.println("Card " + (i+1) + ": " + c.getValue() + " of " + c.getSuit());
        }

        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7);           
        luckyCard.setSuit("Hearts");    

        System.out.println("\nLooking for lucky card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() &&
                c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                System.out.println("You WIN! The lucky card is in the magic hand.");
                return;  // exit immediately on a win
            }
        }

        
        System.out.println("Sorry, you lose. The lucky card is not in the magic hand.");
    }
}
