/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author SteveWang
 */
public class ConstantSensor implements Sensor {
    private int measure;
    
    public ConstantSensor(int measure){
        this.measure = measure;
        
    }
    
    public void on(){
        
    }
    
    public void off(){
        
    }
    
    public int measure(){
        return this.measure;
    }
    
    public boolean isOn(){
        return true;
    }
    
}
