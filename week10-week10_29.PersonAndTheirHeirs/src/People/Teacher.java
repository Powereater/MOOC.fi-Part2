/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author SteveWang
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher (String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }
    
    public String toString(){
        return super.toString() +
"  salary " + this.salary +" euros/month";
    }
    
}
