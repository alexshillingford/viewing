
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import java.util.Arrays;

/**
 *
 * @author etcharn1
 */
public class PokerHand implements Comparable<PokerHand>{
    
    
    public static int STRAIGHT_FLUSH = 9;
    public static int FOUR_OF_A_KIND = 8;
    public static int FULL_HOUSE = 7;
    public static int FLUSH = 6;
    public static int STRAIGHT = 5;
    public static int THREE_OF_A_KIND = 4;
    public static int TWO_PAIR = 3;
    public static int ONE_PAIR = 2;
    public static int HIGH_CARD = 1;
    
    private Card[] cards;
    
    public PokerHand(Card[] cards)
    {
        this.cards = cards;
        //Arrays.sort(this.cards);
    }

    @Override
    public int compareTo(PokerHand o) {
        if ( getHandRank() == o.getHandRank() )
        {
            // tiebreak
        }
        return getHandRank() - o.getHandRank();
    }
    
    public int getHandRank()
    {
        int rank = HIGH_CARD;
        if (isStraightFlush())
        {
            rank = STRAIGHT_FLUSH;
        }
        else if (isFourOfKind())
        {
            rank = FOUR_OF_A_KIND;
        }
        else if (isFullHouse())
        {
            rank = FULL_HOUSE;
        }
        else if (isFlush())
        {
            rank = FLUSH;
        }
        else if (isStraight())
        {
            rank = STRAIGHT;
        }
        else if (isThreeOfKind())
        {
            rank = THREE_OF_A_KIND;
        }
        else if (isTwoPair())
        {
            rank = TWO_PAIR;
        }
        else if (isOnePair())
        {
            rank = ONE_PAIR;
        }
        
        return rank;
    }
    
    private boolean isStraightFlush()
    {
        return isFlush() && isStraight();
    }

    public boolean isFlush() {
        boolean flush = false;
        for (int i = 0; i < cards.length; i ++)
        {
            if (cards[0].suit == cards[i].suit)
            {
                flush = true;
            }
            else
            {
                flush = false;
                break;
            }
        }
        return flush;
    }

    public boolean isStraight() {
        //return cards[0].faceVal == cards[1].faceVal - 1 && cards[1].faceVal == cards[2].faceVal - 1 ; // ...\
        int[] myHand = new int[5];
        int straight = 0;
        boolean result = false;
        for (int i = 0; i<cards.length;i++) {
            myHand[i] = cards[i].getFaceVal();
        }
        Arrays.sort(myHand);
        for (int i = 1; i < cards.length; i++) {
            int previousCard = myHand[i-1];
            int currentCard = myHand[i];

            if (currentCard - previousCard == 1) {
                straight++;
            }
        }
        if (straight == 4) {
            result = true;
        }
        return result;
    }
    
    public boolean isFullHouse() {
        int[] myHand = new int[5];
        boolean result;

        //fill abstract hand w/face vals
        for (int i = 0; i<cards.length;i++) {
            myHand[i] = cards[i].getFaceVal();
            System.out.println("Hand @ "+i+": " + myHand[i]);
        }

        Arrays.sort(myHand);

        for (int i = 0; i<cards.length;i++) {
            System.out.println("Hand @ "+i+": " + myHand[i]);
        }

        if ( myHand[0] == myHand[1] && myHand[1] == myHand[2] &&
                myHand[3] == myHand[4] || myHand[0] == myHand[1] && 
                myHand[2] == myHand[3] &&
                myHand[3] == myHand[4]) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println("result: " +result);
        return result;
    }

    public boolean isFourOfKind() {
        int[] myHand = new int[5];
        for (int i = 0; i < cards.length; i++) {
            myHand[i] = cards[i].getFaceVal();
        }
        Arrays.sort(myHand);
        
        int currentCard = 0;
        int previousCard = 0;
        int matches = 0;
        boolean fourOfKind = false;
        for (int i = 1; i < cards.length; i++)
        {
            currentCard = myHand[i];
            previousCard = myHand[i-1];
            if (previousCard == currentCard)
            {
                matches++;
            }
        }
        if (matches >= 3){
            fourOfKind = true;
        }
        return fourOfKind;
    }
    
    public boolean isThreeOfKind() {
        int[] myHand = new int[5];
        for (int i = 0; i < cards.length; i++) {
            myHand[i] = cards[i].getFaceVal();
        }
        Arrays.sort(myHand);
        
        int currentCard = 0;
        int previousCard = 0;
        int matches = 1;
        boolean threeOfKind = false;
        for (int i = 1; i < cards.length; i++)
        {
            currentCard = myHand[i];
            previousCard = myHand[i-1];
            if (previousCard == currentCard)
            {
                matches++;
            }
        }
        if (matches >= 3 && !isTwoPair()){
            threeOfKind = true;
        }
        return threeOfKind;
    }
    
    public boolean isTwoPair() {
        int[] tempHand = new int[5];
        boolean result = false;
        
        for (int i = 0; i < cards.length; i++) {
            tempHand[i] = cards[i].getFaceVal();
        }
        Arrays.sort(tempHand);
        
        if (tempHand[0] == tempHand[1] && tempHand[2] == tempHand[3])
        {
            result = true;
        }
        if (tempHand[0] == tempHand[1] && tempHand[3] == tempHand[4])
        {
            result = true;
        }
        if (tempHand[1] == tempHand[2] && tempHand[3] == tempHand[4])
        {
            result = true;
        }
        
        return result;
    }
    
    public boolean isOnePair() {
        int[] myHand = new int[5];
        for (int i = 0; i < cards.length; i++) {
            myHand[i] = cards[i].getFaceVal();
        }
        Arrays.sort(myHand);
        
        int currentCard = 0;
        int previousCard = 0;
        int matches = 0;
        boolean onePair = false;
        for (int i = 1; i < cards.length; i++)
        {
            currentCard = myHand[i];
            previousCard = myHand[i-1];
            if (previousCard == currentCard)
            {
                matches++;
            }
        }
        if (matches >= 1){
            onePair = true;
        }
        return onePair;
    }
    
    public boolean isHighCard() {
        boolean result = false;
        
        if (!isStraight() && !isFlush() && !isFullHouse() && !isThreeOfKind()
                && !isOnePair() ) {
            result  = true; //&& !isTwoPair() -- add this into if logic l8r
        }
        return result;
    }

    public void printPokerHand()
    {
        for(int i = 0; i < cards.length; i++)
        {
            System.out.println(cards[i].getFaceVal() + " " + cards[i].getSuit());
        }
    }
}