package practice_projects.name_generator;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class name_generator extends JFrame implements ItemListener {
    private JTextField textField2;
    private JTextField textField3;
    private JPanel mainPanel;

    public static void main(String[] args) {
        sample.sample_gui2.name_generator d = new sample.sample_gui2.name_generator();
    }

    public name_generator() {
        setContentPane(mainPanel);
        setSize(450,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
