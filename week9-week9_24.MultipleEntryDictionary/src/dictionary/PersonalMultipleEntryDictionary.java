/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author SteveWang
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> words = new  HashMap<String, Set<String>>();
    
    public void add(String word, String entry) {
        
        if (!this.words.containsKey(word)){
            this.words.put(word, new HashSet<String>());
        }
        
        this.words.get(word).add(entry);
        
    }
    
    public Set<String> translate(String word) {
        return this.words.get(word);
        
    }
    
    public void remove(String word) {
        this.words.remove(word);
    }
    
}
