/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SteveWang
 */
public class WordInspection {
    
    private File f;
    
     public WordInspection(File file) throws Exception {
         this.f = file;
         
         
     }
    
     public int wordCount() throws Exception {
        Scanner reader = new Scanner(this.f);
        int counter = 0;
        while (reader.hasNext()) {
            reader.next();
            counter++;
        }
        reader.close();
            
        return counter;
     }
     public List<String> wordsContainingZ()throws Exception {
         List<String> zlist = new ArrayList<String>();
         Scanner reader = new Scanner(this.f,"UTF-8");
        //int counter = 0;
        while (reader.hasNext()) {
            String i = reader.next();
            if (i.contains("z")) {
                zlist.add(i);
            }
            //counter++;
        }
        reader.close();
        
        return zlist;
         
     }
     
     public List<String> wordsEndingInL() throws Exception {
         List<String> llist = new ArrayList<String>();
         Scanner reader = new Scanner(this.f, "UTF-8");
        //int counter = 0;
        while (reader.hasNext()) {
            String i = reader.next();
            if (i.charAt(i.length() - 1) == 'l') {
                llist.add(i);
            }
            //counter++;
        }
        reader.close();
        
        return llist;
         
     }
     
      public List<String> palindromes() throws Exception {
          List<String> plist = new ArrayList<String>();
         Scanner reader = new Scanner(this.f, "UTF-8");
        //int counter = 0;
        while (reader.hasNext()) {
            String i = reader.next();
            String reversei = new StringBuilder(i).reverse().toString();
            if (i.equals(reversei)) {
                plist.add(i);
            }
            //counter++;
        }
        reader.close();
        
        return plist;
      }
      
      public List<String> wordsWhichContainAllVowels() throws Exception {
          List<String> vlist = new ArrayList<String>();
         Scanner reader = new Scanner(this.f, "UTF-8");
        //int counter = 0;
        while (reader.hasNext()) {
            String i = reader.next();
            if (i.contains("a") && i.contains("e") && i.contains("i") && i.contains("o") && i.contains("u") &&i.contains("y") &&i.contains("ä") &&i.contains("ö") ){
                vlist.add(i);
            }
            
        }
        reader.close();
        
        return vlist;
          
      }
     
    
}
