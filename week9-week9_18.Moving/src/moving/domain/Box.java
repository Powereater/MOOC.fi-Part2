/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.ArrayList;
/**
 *
 * @author SteveWang
 */
public class Box implements Thing{
    private int maxCapacity;
    //private int volume;
    private ArrayList<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
        //this.volume = 0;
        
    }
    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maxCapacity) {
            this.things.add(thing);
            //this.volume = this.volume + thing.getVolume();
            return true;
        }
        return false;
        
    }
    
    public int getVolume() {
        int volume = 0;
        for (Thing i: this.things) {
            volume = volume + i.getVolume();
        }
        return volume;
    }
    
}
