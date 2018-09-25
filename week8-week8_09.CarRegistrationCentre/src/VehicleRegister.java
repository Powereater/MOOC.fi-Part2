import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> Register = new HashMap<RegistrationPlate, String>();
    //private ArrayList<RegistrationPlate> register = new ArrayList<RegistrationPlate>();
    
    
    
    public boolean add(RegistrationPlate plate, String owner){
        
        if (this.Register.get(plate) != null) {
            return false;
        }
        this.Register.put(plate, owner);
        //this.register.add(plate);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        return this.Register.get(plate);
        
    }
    
    
    public boolean delete(RegistrationPlate plate){
        if (this.Register.get(plate) == null) {
            return false;
        } 
        this.Register.remove(plate);
        //this.register.remove(plate);
        return true;
        
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate i : this.Register.keySet()){
            System.out.println(i);
        }
        
    }
    
    public void printOwners() {
       ArrayList<String> Owners = new ArrayList<String>();
       for (RegistrationPlate i : this.Register.keySet()){
            if (!Owners.contains(this.Register.get(i))) {
                Owners.add(this.Register.get(i));
            }
        }
       
       for (String i : Owners) {
           System.out.println(i);
       }
    }
}
