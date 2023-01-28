import java.util.Scanner;
public class putgrade2 {
    public static void main(String[] args){
        System.out.println("请输入成绩");
        Scanner rg = new Scanner(System.in);
        int g = rg.nextInt();

        int k;
        if(g != 100) {
            k = g / 10;
        }
        else {
            g = g-1;
            k = g / 10;
        }
        switch (k)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("E");break;
            case 6:System.out.println("D");break;
            case 7:System.out.println("C");break;
            case 8:System.out.println("B");break;
            case 9:System.out.println("A");break;
            default:System.out.println("输入不合法");break;
        }

    }
}
