/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author SteveWang
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.tank);
        
    }
    
    public void takeCareOf(Cow cow) throws Exception {
        if (this.robot == null) {
            throw new IllegalStateException();
        }
        this.robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows)throws Exception{
        //if (cows == null) {
        //    throw new IllegalStateException();
        //}
        for (Cow i: cows){
            this.takeCareOf(i);
        }
        
    }
    
    public String toString(){
        return this.tank.toString();
    }
}
