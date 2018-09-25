
import java.util.ArrayList;
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
public class Airport {
    private ArrayList<Airplanes> planes;
    private ArrayList<Flight> flight;
    //private Airplanes planelist;
    
    public Airport() {
        this.planes = new ArrayList<Airplanes>();
        this.flight = new ArrayList<Flight>();
        //this.planelist =  planelist;
    }
    
    public void addPlane (Airplanes plane) {
        this.planes.add(plane);
    }
    
    public void addFlight (Flight flight) {
        this.flight.add(flight);
    }
    
    public void printAllPlane(){
        for (Airplanes plane: this.planes) {
            System.out.println(plane.printInfo());
        }
    }
    
    
    public void printAllFlight(){
        for (Flight flight: this.flight) {
            System.out.println(flight.printInfo());
        }
    }
    
    public void printPlaneInfo(String search){
        for (Airplanes plane: this.planes) {
            if (plane.getName().equals(search)) {
                System.out.println(plane.printInfo());
            }
        }
    }
    
    public Airplanes getPlane(String name){
        for (Airplanes plane: this.planes) {
            if (name.equals(plane.getName())) {
                return plane;
            }
            
        }
        return null;
    }
    
}
