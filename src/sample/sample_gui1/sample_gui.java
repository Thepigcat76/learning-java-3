package sample.sample_gui1;

import javax.swing.*;
import java.awt.*;

public class sample_gui {


    public sample_gui() {

        JFrame frame = new JFrame("Random percentage generator");
        JPanel panel = new JPanel();
        JButton button = new JButton("Awnser");
        JTextField text = new JTextField();
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 5));
        panel.add(text);
        panel.add(label2);
        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(200, 400, 400, 200);
    }


    public static void main(String[] args) {

        new sample_gui();

    }
}
