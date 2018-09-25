package dictionary;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author SteveWang
 */
public class MindfulDictionary  {
    private HashMap<String, String> engtofin = new HashMap<String, String>();
    private HashMap<String, String> fintoeng = new HashMap<String, String>();
    private File thefile;
    private String filename;
    //private Scanner reader;  
    
    public MindfulDictionary(){
        
    }
    public MindfulDictionary(String file)throws Exception{
       this.thefile =  new File(file); 
       this.filename = file;
       //this.reader = new Scanner(this.thefile);
    }
    
    public boolean load(){
        try {
            if (this.thefile == null){
            return false;
        }
        Scanner reader = new Scanner(this.thefile);
        while ( reader.hasNextLine() ){
        String line = reader.nextLine();
        String[] parts = line.split(":");   // the line is split at :
        this.add(parts[0],parts[1]);
             // the part of the line after :
        
        
        }
        reader.close();
        return true;
        }
        catch (Exception e){
            return false;
        }
        
    }
    public void add(String word, String translation){
        if (!this.engtofin.containsKey(word) && !this.fintoeng.containsKey(translation)){
            this.engtofin.put(word,translation);
            this.fintoeng.put(translation,word);
        }
        
        
    }
    
    public String translate(String word){
        if (this.engtofin.containsKey(word)){
            return this.engtofin.get(word);
        }
        if (this.fintoeng.containsKey(word)){
            return this.fintoeng.get(word);
        }
        else {
            return null;
        }
    }
    
    public void remove(String word){
        this.fintoeng.remove(this.engtofin.get(word));
        this.engtofin.remove(word);
        this.engtofin.remove(this.fintoeng.get(word));
        this.fintoeng.remove(word);
    }
    
    public boolean save(){
        
          
        try {
            
        
        
        FileWriter writer = new FileWriter(this.filename);
        for (String i :this.engtofin.keySet()){
            writer.write(i + ":" + this.engtofin.get(i) + "\n");
        }
        writer.close();
        
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
    
    
    
}
