/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SteveWang
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public boolean isOn(){
        for (Sensor i: this.sensors){
            if (!i.isOn()){
                return false;
            }
            
        }
        return true;
    }
    public int measure(){
        if (!this.isOn()) {
            throw new IllegalStateException();
        }
        int total = 0;
        for (Sensor i: this.sensors){
            
            total = total + i.measure();
            
        }
        this.readings.add(total/ this.sensors.size());
        return total/ this.sensors.size();
        
    }
    
    public void on(){
        for (Sensor i: this.sensors){
            i.on();
            
        }
    } 
    
    public void off(){
        for (Sensor i: this.sensors){
            i.off();
        }
        
    }
    
    public List<Integer> readings() {
        
        return this.readings;
        
    }
    
    
}
