import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Kumpula ski jumping week\n" + "\n" + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String command = "placeholder";
        Tournament contest = new Tournament();
        
        while (!command.equals("")) {
            System.out.print("  Participant name: ");
            command = reader.nextLine();
            if (!command.equals("")) {
                contest.addJumper(new Jumper(command));
            }
            
        }
        System.out.println("\n" + "The tournament begins!\n" );
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            command = reader.nextLine();
            
        while (command.equals("jump")) {
            System.out.println("\n" + "Round "+ contest.getRound() + "\n" + "\n" + "Jumping order:");
            contest.jumpOrder();
            contest.round();
            
            
            
            System.out.print("\n" + "Write \"jump\" to jump; otherwise you quit: ");
            command = reader.nextLine();
            //contest.addJumper(new Jumper(command));
        }
        System.out.println("\n" + "Thanks!\n" + "\n" + "Tournament results:");
        contest.result();
        
        
            
        // Write your main program here. Implementing your own classes will be very useful.
    }
}
