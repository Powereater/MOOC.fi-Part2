/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
/**
 *
 * @author SteveWang
 */
public class Thermometer implements Sensor{
    private Random random = new Random();
    private boolean onoff = false;
   // private int reading = 0;
    
    
    
    public boolean isOn(){
        return this.onoff;
    }
    public int measure(){
        if (!this.isOn()){
            throw new IllegalStateException();
        }
        
        return this.random.nextInt(61) - 30;
            
        
    } 
    

    public void on() {
        this.onoff = true;
    }
    
    public void off(){
        this.onoff = false;
        
    }
    
}
