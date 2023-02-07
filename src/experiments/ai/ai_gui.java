package experiments.ai;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ai_gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example GUI");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);
        frame.add(textField);

        JButton button = new JButton("Click Me");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button was clicked!");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}