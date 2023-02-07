package experiments.ai;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class ai_keybind {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Keybind GUI");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.LIGHT_GRAY);

        JButton redButton = new JButton("Red");
        redButton.setActionCommand("red");
        panel.add(redButton);

        JButton greenButton = new JButton("Green");
        greenButton.setActionCommand("green");
        panel.add(greenButton);

        JButton blueButton = new JButton("Blue");
        blueButton.setActionCommand("blue");
        panel.add(blueButton);

        frame.add(panel, BorderLayout.CENTER);

        InputMap inputMap = panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = panel.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "red");
        actionMap.put("red", new ColorAction(Color.RED));

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G, 0), "green");
        actionMap.put("green", new ColorAction(Color.GREEN));

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "blue");
        actionMap.put("blue", new ColorAction(Color.BLUE));

        frame.pack();
        frame.setVisible(true);
    }

    static class ColorAction extends AbstractAction {
        private Color color;

        public ColorAction(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel panel = (JPanel) e.getSource();
            panel.setBackground(color);
        }
    }
}