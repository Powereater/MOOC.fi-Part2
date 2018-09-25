import java.util.ArrayList;
import java.util.Collections;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> heldHand = new ArrayList<Card>(); 
    
    public void add(Card card) {
        this.heldHand.add(card);
    }
    
    public ArrayList<Card> getHand(){
        return this.heldHand;
    }
    
    public void print(){
        for ( Card i : this.heldHand) {
            System.out.println(i);
        }
        //System.out.println();
    }
    
     public void sort(){
         Collections.sort(this.heldHand);
     }
     
     public int compareTo(Hand hand){
        int thisHandVal=0;
        for ( Card i : this.heldHand) {
            thisHandVal = thisHandVal + i.getValue();
        }
        int thatHandVal=0;
        for ( Card i : hand.getHand()) {
            thatHandVal = thatHandVal + i.getValue();
        }
        return  thisHandVal-thatHandVal;
        
     }
     
     public void sortAgainstSuit() {
         SortAgainstSuitAndValue suitSorterAV = new SortAgainstSuitAndValue();
         Collections.sort(this.heldHand, suitSorterAV );
     }
     
    
}
