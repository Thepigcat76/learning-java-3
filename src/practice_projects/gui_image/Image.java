package practice_projects.gui_image;

import javax.swing.*;

public class Image {
    public Image(){

        JFrame frame = new JFrame("PIGUS CATUS PIGUS CATUS PIGUS CATUS PIGUS CATUS PIGUS CATUS PIGUS CATUS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon image = new ImageIcon(getClass().getResource("image1.png"));
            JLabel displayField = new JLabel(image);
            frame.add(displayField);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Image i = new Image();
    }
}

