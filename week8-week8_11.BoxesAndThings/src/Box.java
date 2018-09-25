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
public class Box implements ToBeStored{
    private double maxWeight;
    //private double weight;
    private ArrayList<ToBeStored> items;
    
    public Box(double maxweight){
        this.maxWeight = maxweight;
        //this.weight = 0;
        this.items = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item) {
        
        if (this.weight() + item.weight() < this.maxWeight){
            this.items.add(item);
            //this.weight() = this.weight() + item.weight();
        }
    }
    
    public double weight() {
        double weight = 0;
        for (ToBeStored i:this.items){
            weight = weight + i.weight();
        }
        // it calculates the total weight of the things which had been stored
        return weight;
    }
    
    public String toString(){
        return "Box: " + this.items.size() + " things, total weight " + this.weight() + " kg";
    }
    
}
