import java.util.ArrayList; /**
 *
 * @author SteveWang
 */
public class Suitcase {
    private int maxweight;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
            
    
    public Suitcase(int weightmax){
        this.maxweight = weightmax;
        
    }
    
    public void addThing(Thing thing) {
        int currentweight = 0;
        for (Thing i : this.things) {
            currentweight += i.getWeight();
        }
        
        if (currentweight + thing.getWeight() <= this.maxweight) {
            this.things.add(thing);
        }
        
        
    }
    
    public String toString() {
        int currentweight = 0;
        for (Thing i : this.things) {
            currentweight += i.getWeight();
        }
        
        if (this.things.size() == 0) {
            return  "empty (" + currentweight + " kg)";
        }
        if (this.things.size() == 1) {
            return this.things.size() + " thing (" + currentweight + " kg)";
        }
        else {
            return this.things.size() + " things (" + currentweight + " kg)";
        }
        
    }
    
    public void printThings() {
       for (Thing i : this.things) {
            System.out.println(i);
        } 
    }
    
    public int totalWeight() {
        int currentweight = 0;
        for (Thing i : this.things) {
            currentweight += i.getWeight();
        }
        
        return currentweight;
    }
    
    public Thing heaviestThing() {
        int hvyweight = 0;
        Thing hvything = new Thing(null,0);
        for (Thing i : this.things) {
            if (i.getWeight() > hvyweight) {
                hvyweight = i.getWeight();
                hvything = i;
            }
            
            
        }
        
        if (hvyweight == 0) {
            return null;
            
        }
        else {
            return hvything;
        }
    }
    
    
    
}
