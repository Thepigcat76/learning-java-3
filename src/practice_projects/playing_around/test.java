package practice_projects.playing_around;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class test {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello World");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel cube = new JPanel();
        JButton button = new JButton("Random");
        JButton button2 = new JButton("Random_2");

        frame.setVisible(true);
        frame.pack();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(5, 5));
        panel.add(button);
        panel.add(button2);
        button.setVisible(true);
        cube.setBackground(Color.green);
        cube.setBounds(25, 25, 25, 25);
        cube.setOpaque(true);
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    button.setSelected(true);
                    button2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);
                            button2.setSelected(true);
                            if (button.isSelected() && button2.isSelected()) {
                                System.out.println("neeeeee");
                            }
                        }
                    });
                }
            });
            while(true) {
                Random random = new Random();
                int a = random.nextInt(200) + 1;
                int b = random.nextInt(200) + 1;
                button.setLocation(a,b);
                Thread.sleep(150);
                button2.setLocation(b,a);
                Thread.sleep(150);
            }
        }
    }
