import java.util.Scanner;
public class Circle2 {
    double r;
    static final double pi = 3.14;
    static double area(double r){
        double a;
        a = r*r*pi;
        System.out.println("该圆面积为"+a);
        return a;
    }

    public static void main(String[] args) {
        int i =1;
        for(;i<4;i++){
            System.out.println("请输入第"+i+"个圆的半径");
            double r1 = new Scanner(System.in).nextDouble();
            area(r1);
        }

    }
}
