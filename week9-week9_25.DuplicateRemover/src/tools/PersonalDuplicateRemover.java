/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author SteveWang
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> list = new HashSet<String>(); 
    private int duplicates = 0;
    
    public void add(String characterString) {
        if (this.list.contains(characterString)) {
            this.duplicates++;
        }
        
        this.list.add(characterString);
    }
    
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }
    
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }
    
    public void empty() {
        this.list.clear();
        this.duplicates = 0;
    }
    
}
