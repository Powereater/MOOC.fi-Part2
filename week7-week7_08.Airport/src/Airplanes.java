
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Airplanes {
    private String name;
    private Integer capacity;
    
    public Airplanes(String name,Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    
   // public void add( String name, int capacity) {
   //    this.planes.put(name,capacity);
    //}
    
    public String printInfo(){
        return this.name + " (" + this.capacity + " ppl)";
    }
    
    public String getName(){
        return this.name;
    }
    
}
