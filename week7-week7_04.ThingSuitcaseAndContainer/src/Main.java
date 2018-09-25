
public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        //Suitcase suitcase = new Suitcase(10);
        //Thing thing = new Thing("brick", 4);
        //suitcase.addThing(thing);
        int brickweight = 1;
        for (int i =0;i<=100;i++){
            
            Suitcase suitcase = new Suitcase(101);
            Thing thing = new Thing("brick", brickweight);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
            brickweight++;
            
                    
        }
        // adding 100 suitcases with one brick in each
    }
}
    