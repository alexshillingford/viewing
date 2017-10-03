/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Greg
 */
public class ShuffleDeck extends LinkedStack{
    
    private ArrayList<Card> deck = new ArrayList<Card>();
    public LinkedStack<Card> myShuffledDeck = new LinkedStack<Card>();
    
    public ShuffleDeck() throws Exception
    {
        ArrayList<Card> deck = new ArrayList<Card>();
        addCards(deck);
        myShuffledDeck = shuffleDeck(deck);
    }
    
    private ArrayList<Card> addCards(ArrayList<Card> deck)
    {
        
        for ( int face = 2; face < Face.ACE; face++ )
        {
            deck.add( new Card( Suit.Spade, face ) );
        }
        for ( int face = 2; face < Face.ACE; face++ )
        {
            deck.add( new Card( Suit.Heart, face ) );
        }
        for ( int face = 2; face < Face.ACE; face++ )
        {
            deck.add( new Card( Suit.Club, face ) );
        }
        for ( int face = 2; face < Face.ACE; face++ )
        {
            deck.add( new Card( Suit.Diamond, face ) );
        }
        return deck;
    }

    private LinkedStack<Card> shuffleDeck(ArrayList<Card> deck) throws Exception
    {
        LinkedStack<Card> thisIsTheRealDeck = new LinkedStack();
        
        Random random = new Random();
            while ( !deck.isEmpty() )
            {
                thisIsTheRealDeck.push(
                deck.remove( random.nextInt(deck.size())) );
            }
         return thisIsTheRealDeck;

}
    public void getDeck() throws Exception
    {
        while(!myShuffledDeck.isEmpty())
        {
            Card card = myShuffledDeck.pop();
            System.out.println(card.faceVal +" Of "+ card.suit);
        }
    }
}