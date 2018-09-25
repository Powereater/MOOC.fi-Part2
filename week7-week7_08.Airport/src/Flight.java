
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
public class Flight {
    private String start;
    private String end;
    private Airplanes planes;
    
    public Flight(Airplanes plane, String start, String end) {
        this.start = start;
        this.planes = plane;
        this.end = end;
    }
    
    //public void add( String name, String path) {
   //     this.flights.put(name, path);
    //}
    
    public String printInfo(){
        //String planeinfo = ;
        return this.planes.printInfo() + " (" + this.start +"-" + this.end + ") ";
    }
    
}
