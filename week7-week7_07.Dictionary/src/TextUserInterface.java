import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
     public TextUserInterface(Scanner reader, Dictionary dictionary){
         this.reader = reader;
         this.dictionary = dictionary;
     }
     
     public void start() {
         String command = "";
         while (!command.equals("quit")) {
             System.out.print("Statement: ");
             command = this.reader.nextLine();
             if (command.equals("add")) {
                 this.add();
             }
             
             else if (command.equals("translate")) {
                 this.translate();
             }
             
             else {
                 System.out.println("unknown statement");
             }
             
             
         }
         System.out.print("Cheers! ");
         
     }
     
     public void add() {
         System.out.print("In Finnish: ");
         String word = this.reader.nextLine();
         System.out.print("Translation: ");
         String translation = this.reader.nextLine();
         this.dictionary.add(word,translation);
         
     }
     
     public void translate() {
         System.out.print("Give a word: ");
         String word = this.reader.nextLine();
         System.out.println("Translation: " + this.dictionary.translate(word));
     }
}
