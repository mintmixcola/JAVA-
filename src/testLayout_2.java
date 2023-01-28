import javax.swing.*;
import java.awt.*;

public class testLayout_2 {
    public static void main(String[] args) {
        JFrame a = new JFrame("MyFrame");
        a.setSize(400,300);
        a.setLocationRelativeTo(null);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        p1.setSize(80,60);
        p2.setSize(80,70);
        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        a.add(p1);
        a.add(p2);
        p1.add(b1);
        p2.add(b2);
        p2.add(b3);
        a.setLayout(null );
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
