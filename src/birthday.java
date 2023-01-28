import java.util.Scanner;
public class birthday {
    static int y;
    static int m;
    static int d;
    static void setDate(){
        Scanner a = new Scanner(System.in);
        System.out.println("请输入出生年");
        y = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("请输入出生月");
        m = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("请输入出生日");
        d = c.nextInt();
        return ;
    }
    static void printDate(){
        System.out.println("出生日期是："+y+"年"+m+"月"+d+"日");
        return ;
    }

    public static void main(String[] args) {
        setDate();
        printDate();
    }
}
