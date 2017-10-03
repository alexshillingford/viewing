/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import java.util.ArrayList;
/**
 *
 * @author T-Mobile
 */
public class Hand extends LinkedStack {
    
    //private ArrayList<Card> hand = new ArrayList<Card>();
    //public LinkedStack<Card> myHand = new LinkedStack<Card>();
    public Card myFirstCard;
    public Card mySecondCard;
    
    
//    public Hand() throws Exception {
//        ArrayList<Card> hand = new ArrayList<Card>(2);
//        addCards(hand);
//        myHand = Hand(hand);
//    }
//    
//    private ArrayList<Card> addCards (ArrayList<Card> deck) {
//        deck.add();
//        deck.add();
//        return deck;
//    }

    public Hand (Card first, Card second) {
        this.myFirstCard = first;
        this.mySecondCard = second;
    }
    
    public int getFirstCardVal() {
        return myFirstCard.faceVal;
    }
    
    public int getSecondCardVal() {
        return mySecondCard.faceVal;
    }

    public int getHandVal() {
        return myFirstCard.faceVal + mySecondCard.faceVal;
    }
    
}
