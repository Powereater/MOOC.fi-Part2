
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
       int tally = characterString.length() % 2 + 2;
       //if (characterString.length() % 2 == 1){
       //    tally = 3;
       //}
       
       int numbsmileys = characterString.length()/2 + tally;
       for (int i = 0; i < numbsmileys;i++) {
           System.out.print(":)");
           
       }
       System.out.println(":)");
       
       if (tally == 2){
         System.out.println(":) " + characterString + " :)");
       }
       else {
           System.out.println(":) " + characterString + "  :)");
       }
       
       for (int i = 0; i < numbsmileys;i++) {
           System.out.print(":)");
           
       }
       System.out.println(":)");
       
    }
    

}
