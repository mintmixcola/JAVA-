import java.util.Scanner;
public class putgrade1 {
    public static void main(String[] args){
    System.out.println("请输入成绩");
    Scanner rg = new Scanner(System.in);
    int g = rg.nextInt();
    if(g >= 90 && g <= 100){
        System.out.println("A");
    }
    else if (g >=80 && g < 90){
        System.out.println("B");
    }
    else if (g >=70 && g <80 ){
        System.out.println("C");
    }
    else if (g >=60 && g <70 ){
        System.out.println("D");
    }
    else if ( g < 60 ){
        System.out.println("E");
    }
    else{
        System.out.println("输入不合法");
    }
    }
}
