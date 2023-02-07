package practice_projects.password_manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class password_manager {

    public password_manager() throws IOException {
        JFrame frame = new JFrame("Password manager");
        JFrame frame2 = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button = new JButton("Log In");
        JTextField email = new JTextField();
        JTextField password = new JTextField();
        JLabel label = new JLabel("Email-address:");
        JLabel label2 = new JLabel("Password:");
        JLabel label3 = new JLabel();
        JLabel lbl = new JLabel("Password:");
        JTextField txt = new JTextField();
        JButton bttn = new JButton("edit");


        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(7, 5));
        panel.add(label);
        panel.add(email);
        panel.add(label2);
        panel.add(password);
        panel.add(label3);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(200, 400, 400, 200);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.add(panel2, BorderLayout.CENTER);
        frame2.pack();
        frame2.setBounds(200, 400, 400, 200);

        panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel2.setLayout(new GridLayout(2, 5));
        panel2.add(lbl);
        panel2.add(txt);
        panel2.add(bttn);

        txt.setEditable(false);

        String email1 = "pigcat@viljo.lil";
        String password1 = "#1FanOfElysiaModpacks";
        String passwordList1 = txt.getText();
        String default1 = "";

        txt.setText(passwordList1);

        if (txt.getText().equals(default1)) {
            bttn.setText("save");
            txt.setEditable(true);
        } else {
            txt.getText();
        }
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (email.getText().equals(default1) && password.getText().equals(default1)) {
                    frame2.setVisible(true);
                    frame.setVisible(false);
                }
            }
        });
        bttn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!txt.getText().equals("") && bttn.getText().equals("save")) {

                    bttn.setText("edit");
                    txt.setEditable(false);
                } else if (bttn.getText().equals("edit")) {
                    bttn.setText("save");
                    txt.setEditable(true);
                }
            }
        });
        if (!txt.isEditable()) {
            File file1 = new File("password.txt");

            FileWriter fw = new FileWriter(file1);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(txt.getText());

            pw.close();
        }
    }
}
