
package mooc.logic;
import mooc.ui.UserInterface;





public class ApplicationLogic {
    
    private UserInterface Ui;
     public ApplicationLogic(UserInterface ui){
         this.Ui = ui;
         
     }
     
     public void execute(int howManyTimes) {
         for (int i = 0;i < howManyTimes; i++){
             System.out.println("The application logic works" );
             this.Ui.update();
         }
         
     }
}
