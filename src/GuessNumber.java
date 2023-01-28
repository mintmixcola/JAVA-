import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int ran = (int) (Math.random()*100);
       /* System.out.println("请输入一个1~100之间的数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();*/
        int b = 1;
        int sum = 1;
        while(b == 1)
        {
            System.out.println("请输入一个1~100之间的数");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a > ran)
            {
                System.out.println("你猜大了");
                sum += 1;
            }
            else if(a < ran)
            {
                System.out.println("你猜小了");
                sum += 1;
            }
            else if (a == ran){
                System.out.println("恭喜你，猜对了！");
                System.out.println("次数："+sum);
                b = 0;
            }
            else{
                System.out.println("输入不合法");
            }
        }


    }
}
