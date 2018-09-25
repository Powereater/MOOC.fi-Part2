/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.File;/**
 *
 * @author SteveWang
 */
public class Printer {
    private File f;
    //private Scanner reader;
    
    public Printer(String fileName) throws Exception {
        this.f = new File(fileName);
        //this.reader = new Scanner(this.f);
      // ...
   }
    
    public void printLinesWhichContain (String word) throws Exception {
        Scanner reader = new Scanner(this.f);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            //if (word.equals("")){
                
            //    System.out.println(line);
            //}
            
            
            
            
        
            
            
            if (line.contains(word)){
                System.out.println(line);
            }
            
        }
        
    }
    
}
