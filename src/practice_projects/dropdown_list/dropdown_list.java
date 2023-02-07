package practice_projects.dropdown_list;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class dropdown_list extends JFrame implements ItemListener {

    static JLabel l1,l2,l3,l4;

    static JComboBox c1, c2;

    static JFrame f;

    public static void main(String[] args) {
        f = new JFrame();
        dropdown_list d =new dropdown_list();
        String test[] = {"test","test2"};
        String test2[] = {"test3", "test4"};

        c1 = new JComboBox(test);
        c2 = new JComboBox(test2);

        c1.setSelectedIndex(1);
        c2.setSelectedIndex(0);

        c1.addItemListener(d);
        c2.addItemListener(d);

        c1.setEditable(true);
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();

        l1.setForeground(Color.GREEN);
        l2.setForeground(Color.BLUE);
        l3.setForeground(Color.GREEN);
        l4.setForeground(Color.BLUE);

        JPanel p = new JPanel();

        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(c1);
        p.add(c2);

        p.setLayout(new FlowLayout());
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
