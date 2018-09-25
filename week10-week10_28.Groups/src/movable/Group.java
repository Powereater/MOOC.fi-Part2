/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SteveWang
 */
public class Group implements Movable{
    private List<Movable> group = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable i : this.group) {
            i.move(dx,dy);
        }
    }
    
    public String toString(){
       String string = "";
        for(int i = 0;i < this.group.size();i++ ) {
            string += this.group.get(i) + "\n";
        
    }
        return string;
        
    }
    
}

