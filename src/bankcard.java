import java.util.Scanner;

public class bankcard {
    static String bank ="中国工商银行";
    static String name ="张三";
    static String cardNum = "6222123456";
    static String password ="888888";
    static double balance = 5000;
    static int c = 1;
    static double consumer = 500.5;
    static boolean y;
    static boolean submit(){
        Scanner sc = new Scanner(System.in);
        String password_u = sc.nextLine();
        y = password.equals(password_u);
        if(!y){
            System.out.println("密码错误！" );
        }
       return y;
    }
    static double check_ban(){
        System.out.println("您的余额为"+balance);
        return balance;
    }
    static double month_ex(){
        balance -= consumer;
        return balance;
    }
    static double deposit(){
        System.out.println("请输入您的存款金额：");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        balance += d;
        return  balance;
    }
    public static void main(String[] args) {
        System.out.println("***欢迎使用自助银行系统，请输入密码***");

        submit();
       if(y){
           while (c == 1){
               System.out.println("请输入服务编号（1——3）");
               System.out.println("1--查询余额 | 2--月消费扣费");
               System.out.println("3--存款    | 4--退出系统");
               Scanner sc = new Scanner(System.in);
               int a = sc.nextInt();
               switch (a)
               {
                   case 1:check_ban();break;//查询余额
                   case 2:month_ex();break;//月消费
                   case 3:deposit();break;//存款
                   case 4:c = 0;break;//退出
                   default:
                       System.out.println("您输入的服务编号不合法");
                       System.out.println("=======================");
               }

           }
           System.out.println("******系统已退出。欢迎下次使用******");
       }
        else{
           System.out.println("******系统已退出。欢迎下次使用******");
       }
    }
}
