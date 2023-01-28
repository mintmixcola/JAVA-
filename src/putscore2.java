import java.util.Scanner;
public class putscore2 {
    public static void main(String[] args){
        System.out.println("请输入等级:");
        Scanner sc = new Scanner(System.in);
        String an= sc.nextLine();
        char s=an.charAt(0);
        switch (s){
            case 'A':System.out.println("90~100");break;
            case 'B':System.out.println("80~90");break;
            case 'C':System.out.println("70~80");break;
            case 'D':System.out.println("60~70");break;
            case 'E':System.out.println("0~60");break;
            default:System.out.println("输入不合法");break;
        }

    }


}

