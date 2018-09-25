/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Thing;
import moving.domain.Box;

/**
 *
 * @author SteveWang
 */
public class Packer {
    private int boxVolume;
    
    public Packer(int boxesVolume){
        this.boxVolume = boxesVolume;
        
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>(); 
        boxes.add(new Box(this.boxVolume));
        int boxnumb = 0;
        for (Thing i: things) {
            if (boxes.get(boxnumb).addThing(i)) {
                
                
            }
            else {
                boxes.add(new Box(this.boxVolume));
                boxnumb++;
                boxes.get(boxnumb).addThing(i);
            }
        }
        return boxes;
        
    }
    
}
