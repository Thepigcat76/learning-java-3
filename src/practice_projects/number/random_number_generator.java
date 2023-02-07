package practice_projects.number;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class random_number_generator {


    public random_number_generator() {

        JFrame frame = new JFrame("Random percentage generator");
        JPanel panel = new JPanel();
        JButton button = new JButton("Show Percentage");
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


        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String a = text.getText();
                if (a.equals("")) {
                } else {
                    label2.setText("Question: " + text.getText());
                    text.setText("");
                    Random random = new Random();
                    int x = random.nextInt(100) + 1;
                    label.setText(String.valueOf(x) + "%");
                }



            }





        });
    }
    public static void main(String[] args) {


        new random_number_generator();


    }
}
