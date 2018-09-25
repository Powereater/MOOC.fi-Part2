
package clicker.ui;
import java.awt.event.ActionListener;
import javax.swing.*;
import clicker.applicationlogic.PersonalCalculator;
import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
/**
 *
 * @author SteveWang
 */
public class ClickListener implements ActionListener {
    private JLabel message;
    
    private Calculator calc;
    
    public ClickListener(Calculator cal, JLabel button){
        this.calc = cal;
        this.message = button;
    }
    
    public void actionPerformed(ActionEvent ae) {
       this.calc.increase();
       
       this.message.setText(Integer.toString(this.calc.giveValue()));
       
    }
    
}
