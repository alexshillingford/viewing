/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texasholdem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T-Mobile
 */
public class PokerHandTest {
    
    public PokerHandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compareTo method, of class PokerHand.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        PokerHand o = null;
        PokerHand instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFlush method, of class PokerHand.
     */
    @Test
    public void testIsFlush() {
        System.out.println("isFlush");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Spade, 12);
        cards[1] = new Card(Suit.Spade, 3);
        cards[2] = new Card(Suit.Spade, 5);
        cards[3] = new Card(Suit.Spade, 14);
        cards[4] = new Card(Suit.Spade, 17);
        
        PokerHand instance = new PokerHand(cards);
        boolean expResult = true;
        boolean result = instance.isFlush();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isStraight method, of class PokerHand.
     */
    @Test
    public void testIsStraight() {
        System.out.println("isStraight");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Diamond, 4);
        cards[1] = new Card(Suit.Spade, 6);
        cards[2] = new Card(Suit.Club, 7);
        cards[3] = new Card(Suit.Spade, 3);
        cards[4] = new Card(Suit.Heart, 5);
        
        PokerHand instance = new PokerHand(cards);
        boolean expResult = true;
        boolean result = instance.isStraight();
        assertEquals(expResult, result);
    }

@Test
    public void testIsFullHouse() {
        System.out.println("isFullHouse");

        Card[] testCards = new Card[5];
        testCards[0] = new Card(Suit.Spade, 14);
        testCards[1] = new Card(Suit.Spade, 14);
        testCards[2] = new Card(Suit.Spade, 14);
        testCards[3] = new Card(Suit.Spade, 2);
        testCards[4] = new Card(Suit.Spade, 2);

        PokerHand instance = new PokerHand(testCards);
        boolean expResult = true;
        boolean result = instance.isFullHouse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testIsNotFullHouse() {
        System.out.println("isFullHouse");

        Card[] testCards = new Card[5];
        testCards[0] = new Card(Suit.Spade, 14);
        testCards[1] = new Card(Suit.Spade, 13);
        testCards[2] = new Card(Suit.Spade, 12);
        testCards[3] = new Card(Suit.Spade, 11);
        testCards[4] = new Card(Suit.Spade, 10);

        PokerHand instance = new PokerHand(testCards);
        boolean expResult = false;
        boolean result = instance.isFullHouse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFourOfKind method, of class PokerHand.
     */
    @Test
    public void testIsFourOfKind() {
        System.out.println("isFourOfKind");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Diamond, 4);
        cards[1] = new Card(Suit.Spade, 2);
        cards[2] = new Card(Suit.Club, 4);
        cards[3] = new Card(Suit.Spade, 4);
        cards[4] = new Card(Suit.Heart, 4);
        
        PokerHand instance = new PokerHand(cards);
        boolean expResult = true;
        boolean result = instance.isFourOfKind();
        assertEquals(expResult, result);
    }

    /**
     * Test of isThreeOfKind method, of class PokerHand.
     */
    @Test
    public void testIsThreeOfKind() {
        System.out.println("isThreeOfKind");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Diamond, 7);
        cards[1] = new Card(Suit.Spade, 2);
        cards[2] = new Card(Suit.Club, 4);
        cards[3] = new Card(Suit.Spade, 2);
        cards[4] = new Card(Suit.Heart, 2);
        
        PokerHand instance = new PokerHand(cards);
        boolean expResult = true;
        boolean result = instance.isThreeOfKind();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOnePair method, of class PokerHand.
     */
    @Test
    public void testIsOnePair() {
        System.out.println("isOnePair");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Diamond, 7);
        cards[1] = new Card(Suit.Spade, 2);
        cards[2] = new Card(Suit.Club, 8);
        cards[3] = new Card(Suit.Spade, 7);
        cards[4] = new Card(Suit.Heart, 4);
        
        PokerHand instance = new PokerHand(cards);
        
        boolean expResult = true;
        boolean result = instance.isOnePair();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsTwoPair() {
        System.out.println("IsTwoPair");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Diamond, 7);
        cards[1] = new Card(Suit.Spade, 2);
        cards[2] = new Card(Suit.Club, 4);
        cards[3] = new Card(Suit.Spade, 2);
        cards[4] = new Card(Suit.Heart, 4);
        
        PokerHand instance = new PokerHand(cards);
        
        boolean expResult = true;
        boolean result = instance.isTwoPair();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isHighCard method, of class PokerHand.
     */
    @Test
    public void testIsHighCard() {
        System.out.println("isHighCard");
        PokerHand instance = null;
        boolean expResult = false;
        boolean result = instance.isHighCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPokerHand method, of class PokerHand.
     */
    @Test
    public void testPrintPokerHand() {
        System.out.println("printPokerHand");
        
        Card[] cards = new Card[5];
        cards[0] = new Card(Suit.Diamond, 7);
        cards[1] = new Card(Suit.Spade, 2);
        cards[2] = new Card(Suit.Club, 4);
        cards[3] = new Card(Suit.Spade, 2);
        cards[4] = new Card(Suit.Heart, 4);
        
        PokerHand instance = new PokerHand(cards);
        
        instance.printPokerHand();

    }
    
}
