package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        
        //make button
        JLabel nameText = new JLabel(Integer.toString(this.calc.giveValue()));
        JButton addButton = new JButton("Click!");
        
        //actions lol
        ClickListener action = new ClickListener( this.calc, nameText);
        addButton.addActionListener(action);
        
        
        //put button
        container.add(nameText);
        container.add(addButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
