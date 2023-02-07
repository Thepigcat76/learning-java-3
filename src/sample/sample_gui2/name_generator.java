package sample.sample_gui2;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class name_generator extends JFrame implements ItemListener {
    private JTextField textField2;
    private JTextField textField3;
    private JPanel mainPanel;

    public static void main(String[] args) {
        name_generator d = new name_generator();
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

