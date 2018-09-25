/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author SteveWang
 */
public class RingingCentre {
    private Map<Bird, List<String>> birds = new HashMap<Bird, List<String>>();
    
    public void observe(Bird bird, String place){
        if (!this.birds.containsKey(bird)){
            this.birds.put(bird,new ArrayList<String>() );
        }
        this.birds.get(bird).add(place);
        
    }
    
    public void observations(Bird bird){
        
        if (this.birds.containsKey(bird)){
            
        
            System.out.println(bird + " observations: " + this.birds.get(bird).size());
            for (String i:this.birds.get(bird)) {
                System.out.println(i);
            }
        }
        else{
            System.out.println(bird + " observations: 0");
        }
        //else {
            
        //}
        
    }
    
}
