package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);// Create your app here
    }
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        JRadioButton noreason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        JButton button = new JButton("Done!");
        
        

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);

        container.add(yes);
        container.add(no);
        container.add(new JLabel("Why?"));
        
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(noreason);
        buttonGroup2.add(fun);
        
        container.add(noreason);
        container.add(fun);
        container.add(button);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
