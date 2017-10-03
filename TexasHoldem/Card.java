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
public class Card {
    
    public int faceVal;
    public String suit;
    
    public Card(String suit, int face)
    {
        this.faceVal = face;
        this.suit = suit;
    }
    
    public int getFaceVal()
    {
        return faceVal;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public int compareTo(Card other)
    {
        return this.faceVal - other.faceVal;
    }
}