
import people.Student;
import people.Teacher;
import people.Person;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli );
        olli.study();
        System.out.println( olli );
    }
    public static void printDepartment(List<Person> people){
        for (Person i: people){
            System.out.println(i);
        }
        
    }
}
