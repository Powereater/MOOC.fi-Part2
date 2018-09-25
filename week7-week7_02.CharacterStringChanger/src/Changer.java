import java.util.ArrayList;    // imports ArrayList
import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Changer {
    ArrayList<Change> changeTracker;
    
    public Changer(){
        this.changeTracker = new ArrayList<Change>();
        
    }
    
    
    public void addChange(Change change) {
        this.changeTracker.add(change);
        
    }
    public String change(String characterString) {
        String Output = characterString;
        for (Change i : this.changeTracker){
            Output = i.change(Output);
        }
        
        return Output;
    }
}
