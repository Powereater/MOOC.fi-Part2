//import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Calculator {
    private int counter = 0;
    private Reader reader = new Reader();
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum(){
        //int value1 = 0;
        System.out.print("value1: ");
         int value1 = reader.readInteger();
         System.out.print("value2: ");
         int value2 = reader.readInteger();
         System.out.println("sum of the values " + (value1 + value2));
         this.counter++;
    }
    
    private void product(){
        //int value1 = 0;
        System.out.print("value1: ");
         int value1 = reader.readInteger();
         System.out.print("value2: ");
         int value2 = reader.readInteger();
         System.out.println("product of the values " + (value1 * value2));
         this.counter++;
    }
    
    private void difference(){
        //int value1 = 0;
        System.out.print("value1: ");
         int value1 = reader.readInteger();
         System.out.print("value2: ");
         int value2 = reader.readInteger();
         System.out.println("difference " + (value1 - value2));
         this.counter++;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.counter);
    }
    
    
}
