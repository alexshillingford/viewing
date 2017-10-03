/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

/**
 *
 * @author Greg
 */
public class combinedHand {
    
    private Card[] cards;
    
    public combinedHand(PokerHand hand, Hand playerHand)
    {
        for (int i = 0; i < hand.getCards().length; i++)
        {
            //cards[i] = hand.cards[i]();
        }
        cards[0] = playerHand.myFirstCard;
        cards[1] = playerHand.mySecondCard;
    }
}
