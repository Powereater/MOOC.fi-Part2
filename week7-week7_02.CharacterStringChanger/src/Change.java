/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Change {
    char from;
    char to;
    
    public Change(char fromCharacter, char toCharacter){
        this.from = fromCharacter;
        this.to = toCharacter;
    }
    
    
    public String change(String characterString) {
        String output = "";
        for (int i = 0; i < characterString.length(); i++){
            
            if (this.from == characterString.charAt(i)) {
                output += this.to;
            }       
            else {
                output += characterString.charAt(i);
            }
            
    //Process char
        }
        return output;
    }
}
