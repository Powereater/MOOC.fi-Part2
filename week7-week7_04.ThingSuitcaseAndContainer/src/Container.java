
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Container {
   private int maxweight;
   private ArrayList<Suitcase> luggage = new ArrayList<Suitcase>();
    
            
    
    public Container(int weightmax){
        this.maxweight = weightmax;
        
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentweight = 0;
        for (Suitcase i : this.luggage) {
            currentweight += i.totalWeight();
        }
        
        if (currentweight + suitcase.totalWeight() <= this.maxweight) {
            this.luggage.add(suitcase);
        }
        
        
    }
    
    public String toString() {
        int currentweight = 0;
        for (Suitcase i : this.luggage) {
            currentweight += i.totalWeight();
        }
        
        //if (this.things.size() == 0) {
        //    return  "empty (" + currentweight + " kg)";
        //}
        //if (this.things.size() == 1) {
        //    return this.things.size() + " thing (" + currentweight + " kg)";
        //}
        //else {
            return this.luggage.size() + " suitcases (" + currentweight + " kg)";
        //}
        
    }
    
    public void printThings() {
       for (Suitcase i : this.luggage) {
           i.printThings();
            //System.out.println(i.printThings());
        } 
    }
    
    
    
    
     
}
