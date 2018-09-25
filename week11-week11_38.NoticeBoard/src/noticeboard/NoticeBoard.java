package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    //private JTextArea origin;
    //private JTextArea destination;

    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(600, 600));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);// Create your app here
    }
    public class AreaCopier implements ActionListener {

    private JTextField origin;
    private JLabel destination;

    public AreaCopier(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
    }
    private void createComponents(Container container) {
         GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textAreaUp = new JTextField();
        JLabel textAreaDown = new JLabel();
        JButton copyButton = new JButton("Copy!");

        AreaCopier copier = new AreaCopier(textAreaUp, textAreaDown);
        copyButton.addActionListener(copier);

        container.add(textAreaUp);
        container.add(copyButton);
        container.add(textAreaDown);
        
    }
}
