import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addmechen extends JFrame implements ActionListener {
    JFrame f = new JFrame();
    JLabel l1 = new JLabel("+");
    JTextField f1 = new JTextField(10);
    JTextField f2 = new JTextField(10);
    JTextField f3 = new JTextField(10);
    JButton b = new JButton("=");

    addmechen(String name){
        super(name);
        this.setSize(800,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        f3.setEditable(false);
        this.add(f1);this.add(l1);this.add(f2);this.add(b);this.add(f3);
        b.addActionListener(this);
    }
  public void actionPerformed(ActionEvent e){
            String s1 = f1.getText();
            String s2 = f2.getText();
            int c  = Integer.parseInt(s1);
            int d = Integer.parseInt(s2);
            f3.setText(c+d+" ");
  }


    public static void main(String[] args) {
        addmechen a = new addmechen("小型加法计算器");
    }
}
