import java.util.Scanner;
public class putscore {
    public static void main(String[] args){
        System.out.println("请输入等级:");
        Scanner sc = new Scanner(System.in);
        String an= sc.nextLine();
        char s=an.charAt(0);
        if(s == 'A')
        {
            System.out.println("90~100");
        }
        else if(s =='B'){
            System.out.println("80~90");
        }
        else if(s =='C'){
            System.out.println("70~80");
        }
        else if(s =='D'){
            System.out.println("60~70");
        }
        else if(s =='E'){
            System.out.println("0~60");
        }
    }


}
