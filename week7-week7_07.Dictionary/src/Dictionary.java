import java.util.ArrayList;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
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
public class Dictionary {
    private HashMap<String, String> translation = new HashMap<String, String>(); 
    
    
    public Dictionary() {
        
    //this.translation = new HashMap<String, String>();
    
    }
    
    public String translate(String word){
        
        return this.translation.get(word);
        
    }
    
    public void add(String word, String translation){
        
        this.translation.put(word, translation);
       
    }
    
    public int amountOfWords() {
        return this.translation.size();
    }
    public ArrayList<String> translationList(){
        //private ArrayList<String> translations;
        //this.translations = new ArrayList<String>();
        ArrayList<String> translationlist = new ArrayList<String>();
        
        for ( String word : this.translation.keySet() ) {
            translationlist.add(word + " = " + this.translation.get(word));
        }
         //this.translations.add(word + " = " + translation);
         return translationlist;
    }
}
