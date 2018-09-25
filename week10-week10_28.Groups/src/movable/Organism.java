/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author SteveWang
 */
public class Organism implements Movable{
    private int xcord;
    private int ycord;
    
    
    public Organism(int x, int y){
        this.xcord = x;
        this.ycord = y;
    }
    
    
    public String toString(){
        return "x: " + xcord +"; y: " + this.ycord;
    }
    
    public void move(int dx, int dy){
        this.xcord += dx;
        this.ycord += dy;
    }
}
