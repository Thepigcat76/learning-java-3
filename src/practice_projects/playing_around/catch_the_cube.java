package practice_projects.playing_around;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class catch_the_cube {
    public static void main(String[] args) throws InterruptedException {

        JFrame main_screen = new JFrame();
        JButton button = new JButton("Play new game");
        JLabel label = new JLabel("PIGCAT GAME VERY COOL TRUST ME");
        JPanel panel1 = new JPanel();

        main_screen.pack();
        main_screen.setVisible(true);
        main_screen.setSize(400, 400);
        main_screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_screen.add(panel1);
        panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel1.setLayout(new GridLayout(5, 5));
        panel1.add(label);
        panel1.add(button);

        System.out.println("Hello World");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel cube = new JPanel();
        JPanel cube2 = new JPanel();
        JPanel cube3 = new JPanel();
        JPanel cube4 = new JPanel();
        JPanel cube5 = new JPanel();
        JPanel cube6 = new JPanel();
        JTextField score = new JTextField();

        cube.setEnabled(false);
        cube2.setEnabled(false);
        cube3.setEnabled(false);
        cube4.setEnabled(false);
        cube5.setEnabled(false);
        cube6.setEnabled(false);

        frame.pack();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(5, 5));
        panel.add(score);
        panel.add(cube);
        panel.add(cube2);
        panel.add(cube3);
        panel.add(cube4);
        panel.add(cube5);
        panel.add(cube6);
        cube.setBackground(Color.green);
        cube.setBounds(25, 25, 25, 25);
        cube.setOpaque(true);

        cube6.setBackground(Color.red);
        cube6.setBounds(25, 25, 25, 25);
        cube6.setOpaque(true);

        cube2.setBackground(Color.black);
        cube2.setBounds(25, 25, 25, 25);
        cube2.setOpaque(true);

        cube3.setBackground(Color.yellow);
        cube3.setBounds(25, 25, 25, 25);
        cube3.setOpaque(true);

        cube4.setBackground(Color.blue);
        cube4.setBounds(25, 25, 25, 25);
        cube4.setOpaque(true);

        cube5.setBackground(Color.pink);
        cube5.setBounds(25, 25, 25, 25);
        cube5.setOpaque(true);

        score.setEditable(false);
        score.setText("0");

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        cube.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        cube2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        cube3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        cube4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        cube5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        cube6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                main_screen.setVisible(false);
                frame.setVisible(true);
            }
        });

        if (cube.isEnabled()) {
            double m = 100 * 1.2;
            score.setText("1");
        } else if (cube2.isEnabled()) {

        } else if (cube3.isEnabled()) {

        } else if (cube4.isEnabled()) {

        } else if (cube5.isEnabled()) {

        } else if (cube6.isEnabled()) {
        }

            while (true) {
                Random random = new Random();
                int a = random.nextInt(100) + 1;
                int b = random.nextInt(200) + 1;
                int c = random.nextInt(200) + 1;
                int d = random.nextInt(200) + 1;
                int e = random.nextInt(200) + 1;
                int f = random.nextInt(200) + 1;
                int g = random.nextInt(200) + 1;
                int h = random.nextInt(200) + 1;
                int i = random.nextInt(200) + 1;
                int j = random.nextInt(200) + 1;
                int k = random.nextInt(200) + 1;
                int l = random.nextInt(200) + 1;
                Thread.sleep(100);
                cube.setLocation(a, b);
                cube2.setLocation(c, d);
                cube3.setLocation(e, f);
                cube4.setLocation(g, h);
                cube5.setLocation(i, j);
                cube6.setLocation(k, l);
                System.out.println(a);
            }
        }
    }

