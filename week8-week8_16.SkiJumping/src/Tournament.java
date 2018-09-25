import java.util.ArrayList;
import java.util.Collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Tournament {
    private ArrayList<Jumper> Jumpers = new ArrayList<Jumper>();
    private int RoundCount = 1;
    
    public void addJumper(Jumper jumper) {
        this.Jumpers.add(jumper);
    }
    
    public void jumpOrder() {
        int order = 1;
        Collections.sort(this.Jumpers);
        for (Jumper i: this.Jumpers){
            System.out.println("  "+order + ". " + i);
            order++;
        }
    }
    
    public void round() {
        System.out.println("\n" + "Results of round " + this.RoundCount);
       for (Jumper i: this.Jumpers){
           i.round();
           
           
           
        } 
       this.RoundCount++;
    }
    
    public int getRound(){
        return this.RoundCount;
    }
    
    public void result(){
        int position = 1;
        Collections.sort(this.Jumpers);
        Collections.reverse(this.Jumpers);
        System.out.println("Position    Name");
        for (Jumper i: this.Jumpers) {
            i.result(position);
            position++;
        }
    }
            
    
}
