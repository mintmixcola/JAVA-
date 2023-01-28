import javax.swing.*;

public class testJScrollPane {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("MyFrame");
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JPanel p = new JPanel();
        p.setVisible(true);

        JScrollPane s = new JScrollPane(p);
        s.setVisible(true);
        s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton b[] = new JButton[8];
        for (int i=0;i<8;i++){
            b[i] = new JButton("按钮"+(i+1));
            p.add(b[i]);
        }

       // JScrollPane s = new JScrollPane();
        //s.setVisible(true);
        //s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        f.add(p);
        p.add(s);
    }
}
