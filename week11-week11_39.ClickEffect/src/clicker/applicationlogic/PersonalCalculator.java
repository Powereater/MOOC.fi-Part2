
package clicker.applicationlogic;

/**
 *
 * @author SteveWang
 */
public class PersonalCalculator implements Calculator{
    private int value = 0;
    
    
    public int giveValue(){
        return this.value;
        
    }
    
    public void increase(){
        this.value++;
        
    }
    
    
}
