import javax.swing.*;
import java.awt.*;

public class TestGridLayout extends JFrame {
    int size =9;
    JButton jButton[] = new JButton[size];//定义按钮数组
    public TestGridLayout(){
        for (int i = 0;i<size;i++){//创建组件
            jButton[i] = new JButton(String.valueOf(i+1));
    }
        for (int i = 0;i<size;i++)
            this.add(jButton[i]);
            this.setLayout(new GridLayout(3,3,10,30));
            this.setTitle("演示网格布局管理器");
            this.setSize(400,400);
            this.setLocation(200,200);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);}

    public static void main(String[] args) {
        TestGridLayout testGridLayout =new TestGridLayout();
    }
}
