import java.util.Scanner;
public class User {
    static String name;
    static String cardNumber;

    static void user(String name,String cardNumber){

        System.out.println("该用户用户名为："+name);
        System.out.println("该用户卡号为"+cardNumber);
    }

    public static void main(String[] args) {
        for(int i =1;i<3;i++){
            System.out.println("请输入第"+i+"个用户的用户名：");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            System.out.println("请输入第"+i+"个用户的卡号：");
            Scanner SC = new Scanner(System.in);
            cardNumber = SC.nextLine();
            user(name,cardNumber);
        }

    }
}
