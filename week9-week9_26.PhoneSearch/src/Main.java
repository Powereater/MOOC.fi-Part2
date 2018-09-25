import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Phonebook book = new Phonebook();
        String command = "nothing";
        
        System.out.println("phone search\n" +
"available operations:\n" +
" 1 add a number\n" +
" 2 search for a number\n" +
" 3 search for a person by phone number\n" +
" 4 add an address\n" +
" 5 search for personal information\n" +
" 6 delete personal information\n" +
" 7 filtered listing\n" +
" x quit");
        
        while (!command.equals("x")) {
            System.out.println("command: ");
            command = reader.nextLine();
            if (command.equals("1")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                book.addNumber(name, number);
                
            }
            
            if (command.equals("2")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                
                if (book.numbersWithName(name) == null){
                    System.out.println("  not found");
                }
                
                else {
                    System.out.println(book.numbersWithName(name));
                }
               
                
                
            }
            
            if (command.equals("3")){
                System.out.print("number: ");
                String number = reader.nextLine();
                String name = book.nameWithNumb(number);
                
                if (name == null){
                    System.out.println(" not found");
                }
                else{
                    System.out.println(name);
                }
                
                
            }
            
            if (command.equals("4")){
                System.out.print("whose address: ");
                String name = reader.nextLine();
                System.out.print("street: ");
                String street = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                String address = street + " " + city;
               
                book.addAdress(name, address);
                
            }
            
            if (command.equals("5")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
               
                book.printInfo(name);
                
            }
            
            if (command.equals("6")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
               
                book.remove(name);
                
            }
            
            if (command.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String search = reader.nextLine();
               
                book.searchAll(search);
                
            }
            
        }
                
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
    }
}
