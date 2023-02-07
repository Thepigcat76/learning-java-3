package practice_projects.word;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class random_word_generator {


    public random_word_generator() {

        JFrame frame = new JFrame("Answer Generator");
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
                if (!a.equals("")) {
                    label2.setText("Question: " + text.getText());
                    text.setText("");
                    Random random = new Random();
                    int x = random.nextInt(100) + 1;
                    label.setText(x + "%");
                }


            }





        });
    }
    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 7;
        for(int i =0; i < length; i++);
        {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println(randomString);
    }
}
