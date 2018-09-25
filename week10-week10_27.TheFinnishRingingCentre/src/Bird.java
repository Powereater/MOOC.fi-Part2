
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public int hashCode() {
        return this.ringingYear + this.latinName.hashCode();
    }
    public String getLatinName(){
        return this.latinName;
    }
    public boolean equals(Object other){
        if (other == null) {
            return false;
        }

        if (this.hashCode() != other.hashCode()) {
            return false;
        }

        return true;
    }
    


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


