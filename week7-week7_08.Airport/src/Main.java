import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
            //GGGGGGGGGGGGGGGGGGGGGGG
//            String input = "1\n" + "HA-LOL\n" + "42\n" + "1\n" + "G-OWAC\n"
//                     + "101\n" + "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n"
//                    + "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" + "2\n"
//                     + "HA-LOL\n" + "BAL\n" + "HEL\n"+ "x\n" + "1\n" + "2\n" + "3\n"
//                    + "G-OWAC\n"+ "x\n";                    
//            Scanner reader = new Scanner(input);
            //GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
    
    
            System.out.println("Airport panel");
            System.out.println("--------------------");
            //Kill the scanner to test
            
            Scanner reader = new Scanner(System.in);
            
            //GGGGGGGGGGGGGGGGGGG
            
            Airport airport = new Airport();
            String command = "hold"; 
            String planename = "";
            int capacity = 0;
            while (!command.equals("x")){
                
                //System.out.print("command at stat is" + command);
                System.out.println("Choose operation:");
                System.out.println("[1] Add airplane");
                System.out.println("[2] Add flight");
                System.out.println("[x] Exit");
                System.out.print("> ");
                
                command = reader.nextLine();
                
                if (command.equals("1")) {
                    System.out.print("Give plane ID: ");
                    planename = reader.nextLine();
                    System.out.print("Give plane capacity: ");
                    capacity = Integer.parseInt(reader.nextLine());
                    
                    
                    Airplanes plane = new Airplanes(planename, capacity);
                    airport.addPlane(plane);
                }
                
                if (command.equals("2")) {
                    System.out.print("Give plane ID: ");
                    planename = reader.nextLine();
                    System.out.print("Give departure airport code: ");
                    String start = reader.nextLine();
                    System.out.print("Give destination airport code: ");
                    String end = reader.nextLine();
                    
                    Flight flight = new Flight(airport.getPlane(planename),start,end);
                    
                    airport.addFlight(flight);
                }
            }
            
            command = "";
            System.out.println("Flight service");
            System.out.println("------------");
            while (!command.equals("x")){
                
                //System.out.print("command at stat is" + command);
                System.out.println("Choose operation:");
                System.out.println("[1] Print planes");
                System.out.println("[2] Print flights");
                System.out.println("[3] Print plane info");
                System.out.println("[x] Quit");
                System.out.print("> ");
                
                command = reader.nextLine();
                
                if (command.equals("1")) {
                    
                    airport.printAllPlane();
                }
                
                if (command.equals("2")) {
                                        
                    airport.printAllFlight();
                }
                
                if (command.equals("3")) {
                    System.out.print("Give plane ID: ");
                    planename = reader.nextLine();
                    airport.printPlaneInfo(planename);
                }
            }
                
    }
}