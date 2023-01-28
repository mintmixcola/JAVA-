import javax.swing.*;
import java.awt.*;
public class gui_1 {
    public static void main(String[] args) {
        gui_1 win = new gui_1();
        JButton b = new JButton("我是一个按钮");
        JLabel C =new JLabel("我是一个标签");
        JTextArea d = new JTextArea("我是一个文本区");
        Frame f=new Frame();
        f.setSize(800, 400);
        f.setLocation(200,300);
        f.setTitle("first GUI");
        f.add(b);
        f.add(d);
        f.add(C);
        f.setLayout(new FlowLayout());

        f.setVisible(true);
    }
}
