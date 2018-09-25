/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SteveWang
 */
public class ContainerHistory {
    private List<Double> history = new ArrayList<Double>();
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset() {
        this.history.clear();
    }
    public String toString() {
        return this.history.toString();
    }
    public double maxValue(){
        double maxval = 0;
        for (double i: this.history){
            if(i > maxval){
                maxval = i;
            }    
        }
        return maxval;
            
    }
    
    public double minValue(){
        if (this.history.size() == 0){
            return 0;
        }
        double minval = this.history.get(0);
        for (double i: this.history){
            if(i < minval){
               minval = i;
            }    
        }
        return minval;
        
    }
    
    public double average(){
        double sum = 0;
        for (double i: this.history){
            sum +=i;
        }
        return sum/this.history.size();
        
    }
    
    public double greatestFluctuation(){
        double grtfluc = 0;
        for (int i = 1;i < this.history.size();i++){
            if (Math.abs(this.history.get(i)-this.history.get(i-1))>grtfluc){
                grtfluc = Math.abs(this.history.get(i)-this.history.get(i-1));
            }
            
        }
        
        return grtfluc;//if this turns out to be the otheirng thing ima lunch the computer
            
    }
    public double variance(){
        double vtol = 0;
        for (double i: this.history){
            vtol += ((this.average()-i)*(this.average()-i));
        }
        
        return vtol/(this.history.size()-1);
    }
}
