import  java.util.Scanner;
public class Animal {

    public double weight;
    public String kind;

    public int setKind() {
        System.out.println("请输入Weight:");
        Scanner SC = new Scanner(System.in);
        weight = SC.nextInt();
        System.out.println("请输入kind");
        Scanner sc = new Scanner(System.in);
        kind = sc.nextLine();
        return 1;
    }

    public String getKind() {
        System.out.println("种类为：" + kind);
        return kind;
    }

    public double getweight() {
        System.out.println("体重为：" + weight);
        return weight;
    }

    public int eat(String food) {
        System.out.println(kind + "喜欢吃" + food);
        return 1;
    }

    public int sleep() {
        System.out.println(kind + "在睡觉");
        return 1;
    }

    public int cachRat() {
        System.out.println(kind + "会抓老鼠");
        return 1;
    }
}





