package archive.prints_to_file.oh_no_math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class math_practice {
    public math_practice() {

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

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                result = b + 1;
                label.setText(String.valueOf(result));
                b = Double.parseDouble(label.getText());
            }
        });
    }
    double  b, result;

    public static void main(String[] args) {
        new math_practice();
    }
}
