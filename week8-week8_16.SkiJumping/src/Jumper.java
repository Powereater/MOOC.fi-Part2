
import java.util.ArrayList;
import java.util.Random;
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
public class Jumper implements Comparable<Jumper> {
    private String name;
    private int point;
    private ArrayList<Integer> lengths;
    private Random random;
    
    public Jumper (String name){
        this.name = name;
        this.point= 0;
        this.lengths = new ArrayList<Integer>(); 
        this.random = new Random();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints() {
        return this.point;
    }
    
    public void addPoint( int pointAdded){
        this.point = this.point + pointAdded;
    }
    
    public void round() {
       int distance = random.nextInt(61) + 60;
       this.lengths.add(distance);
       
        ArrayList<Integer> points = new ArrayList<Integer>();
        
        points.add(random.nextInt(11) + 10);//5 times
        points.add(random.nextInt(11) + 10);
        points.add(random.nextInt(11) + 10);
        points.add(random.nextInt(11) + 10);
        points.add(random.nextInt(11) + 10);
        
        
        
        System.out.println("  " + this.name);
        System.out.println("    length: " + distance);
        System.out.println("    judge votes: [" + points.get(0) +", " + points.get(1) + ", "+ points.get(2) +", "+ points.get(3)+", "+ points.get(4) + "]");
        
        Collections.sort(points);
        
        this.point = this.point + points.get(1) + points.get(2) + points.get(3) + distance;
        
    }
    
    public void result(int position){
        System.out.println(position + "           " + this.name + " (" + this.point+ " points)");
        System.out.print("            jump lengths: ");
        for (int i=0;i < this.lengths.size()-1;i++){
            System.out.print(this.lengths.get(i) +" m, ");
        }
        System.out.println(this.lengths.get(this.lengths.size()-1) +" m");
        
        
    }
    
    public int compareTo(Jumper jumper){
        return this.point - jumper.getPoints();
    }
    
    public String toString() {
        return this.name + " (" + this.point + " points)";
    }
    
    
}
