
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("matti","mage");
         nicknames.put("mikael","mixu");
          nicknames.put("arto","arppa");
          
         String name = nicknames.get("mikael");
         System.out.println(name);
// Do the operations requested in the assignment here!
    }

}
