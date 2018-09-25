/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author SteveWang
 */
public class Farm {
    private String name;
    private Barn barn;
    
    private Collection<Cow> cows = new ArrayList<Cow>();
    
    public Farm(String name, Barn barn){
        this.name = name;
        this.barn = barn;
        
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
        
    }
    
    public String getOwner(){
        return this.name;
        
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
        
    }
    
    public void liveHour(){
        for (Cow i :cows){
            i.liveHour();
        }
    }
    
    public void manageCows() throws Exception{
        this.barn.takeCareOf(this.cows);
    }
    
    
    public String toString(){
        String output = "";
        output += "Farm owner: " + this.name + "\n";
        output += "Barn bulk tank: " + this.barn + "\n";
        if (cows.size() == 0){
            output += "No cows.";
        }
        else {
           output += "Animals:\n";
           for (Cow i: cows){
               output += "        " + i.toString() +"\n"; 
           }
        }
        
        return output;
        
    }
}
