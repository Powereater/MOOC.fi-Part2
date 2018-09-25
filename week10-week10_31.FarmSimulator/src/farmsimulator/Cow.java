/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;
import java.util.List;
/**
 *
 * @author SteveWang
 */
public class Cow implements Alive,Milkable {
    private Random random = new Random();
    private String name;
    private double capacity = 15 + this.random.nextInt(26);
    private double amount = 0;
    
    private static final String[] NAME = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(String name) {
        this.name = name;
    }
    
    public Cow(){
       this.name = (NAME[this.random.nextInt(31)]);
               
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
        
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public void liveHour(){
        double produce = 0.1*(this.random.nextInt(14)+7);
        if ((produce + this.amount) < this.capacity){
            this.amount += produce;
        }
        else{
            this.amount = this.capacity;
        }
    }
    
    public double milk(){
        double milk = this.amount;
        this.amount = 0;
        return milk;
    }
    
    
    
    
    public String toString(){
        return this.name + " " + Math.ceil(this.amount) + "/"+ Math.ceil(this.capacity);
    }
    
    
}

