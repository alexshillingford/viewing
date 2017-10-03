/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import java.util.Random;

/**
 *
 * @author Greg
 */
public class TexasHoldem {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        LinkedStack shuffledDeck = new LinkedStack();
        ShuffleDeck deck = new ShuffleDeck();
        
        //Draw five cards for the pokerhand (card pile)
        Card[] drawPokerHand = new Card[5];
        for (int i = 0; i < drawPokerHand.length; i++)
        {
            drawPokerHand[i] = deck.myShuffledDeck.pop();
        }
        PokerHand pokerHand = new PokerHand(drawPokerHand);
        
        //Creates two hands for players1 and 2
        Card card1 = deck.myShuffledDeck.pop();
        Card card2 = deck.myShuffledDeck.pop();
        Hand player1 = new Hand (card1, card2);
        card1 = deck.myShuffledDeck.pop();
        card2 = deck.myShuffledDeck.pop();
        Hand player2 = new Hand (card1, card2);
        
        pokerHand.printPokerHand();
    }
    
}
