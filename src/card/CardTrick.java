/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and asks the user to pick a card to see if it's in the hand.
 * Modifier: Bineetha Sadula Balakrishna
 * Student ID: 991787553
 * Date Modified: 2025-05-27
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1); 
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;

            
            System.out.println("Card " + (i+1) + ": " + c.getValue() + " of " + c.getSuit());
        }

      
        Scanner input = new Scanner(System.in);

        System.out.print("Pick a card value (1–13): ");
        int userValue = input.nextInt();
        input.nextLine(); 

        System.out.print("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() &&
                c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                System.out.println("You WIN! Your card was in the magic hand.");
                return; 
            }
        }

        // Only printed if loop finishes without a match
        System.out.println("Sorry, you lose. Your card was not in the magic hand.");
}
}


           

