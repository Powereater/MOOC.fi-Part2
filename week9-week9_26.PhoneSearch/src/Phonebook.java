import java.util.HashMap;
import java.util.TreeSet;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String , HashSet<String>> nameAndNumbers = new HashMap<String , HashSet<String>>();
    private HashMap<String , String> nameAndAdress = new HashMap<String , String>();
    
    public void addNumber(String name, String numb){
        if (!this.nameAndNumbers.containsKey(name)) {
            this.nameAndNumbers.put(name, new HashSet<String>());
        }
        this.nameAndNumbers.get(name).add(numb);
    }
    
    public HashSet<String> numbersWithName (String name) {
        
            return this.nameAndNumbers.get(name);
        
        
       
        
    }
    
    public String nameWithNumb (String numb) {
        for (String i : this.nameAndNumbers.keySet()) {
            if (this.nameAndNumbers.get(i).contains(numb)) {
                return i;
            }
            
        }
        return null;
    }
    
    public void addAdress( String name, String adress){
        this.nameAndAdress.put(name,adress);
    }
    
    public void printInfo (String name) {
         
        String adress = this.nameAndAdress.get(name);
        if (adress == null){
            adress = "unknown";
        }
        
        HashSet<String> numbers = this.numbersWithName(name);
        
        if (numbers == null && adress == "unknown"){
            System.out.println("  not found");
        }
        
        else {
            
        System.out.println("address " + adress);
        if (numbers == null){
            System.out.println("phone number not found");
        }
        
        else{
           System.out.println("phone numbers:");
            for (String i: numbers) {
                System.out.println(i);
            }
         
        }
        }
        
    }
    public void remove (String Name) {
        this.nameAndAdress.remove(Name);
        this.nameAndNumbers.remove(Name);
    }
    
    public void searchAll (String search){
        TreeSet<String> output = new TreeSet<String>();
        
        
        
        for (String i: this.nameAndAdress.keySet()){
            if (i.contains(search) || this.nameAndAdress.get(i).contains(search)){
                output.add(i);
            }   
        
        }
        
        for (String i: this.nameAndNumbers.keySet()){
            if (i.contains(search)) {
                output.add(i);
            }
        }
        if (output.isEmpty()) {
            System.out.println(" keyword not found");
        }
        else{
        for (String i: output){
            System.out.println(i);
            this.printInfo(i);
        }
        }
    }
    
    
}
