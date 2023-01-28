import javax.swing.*;
import java.awt.*;

public class TestBorderLayout extends JFrame  {

    public static void main(String[] args) {
        JFrame a = new JFrame();
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton( );
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        a.setLayout(new BorderLayout());
        a.add(b1,BorderLayout.EAST);
        a.add(b2,BorderLayout.WEST);
        a.add(b3,BorderLayout.NORTH);
        a.add(b4,BorderLayout.SOUTH);
        a.add(b5);
        a.setSize(400,300);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
