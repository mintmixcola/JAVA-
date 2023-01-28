import java.util.Scanner;
public class Merchandisefinder {
    String p1[] ={"衣服","150","这件衣服很好看！"};
    String p2[] ={"帽子","60","这个帽子时尚"};
    String p3[] ={"鞋","256","这双鞋保暖"};
    String p4[] ={"手套","15","这双手套实用"};
    boolean y;
    public void find(String a){
        if (y = p1[0].equals(a)) {
            System.out.println("你要查看的商品具体信息为：");
            System.out.println("商品名称："+p1[0]);
            System.out.println("商品价格："+p1[1]);
            System.out.println("商品描述："+p1[2]);
        }

        else if (y = p2[0].equals(a)) {
            System.out.println("你要查看的商品具体信息为：");
            System.out.println("商品名称："+p2[0]);
            System.out.println("商品价格："+p2[1]);
            System.out.println("商品描述："+p2[2]);
        }

        else if (y = p3[0].equals(a)) {
            System.out.println("你要查看的商品具体信息为：");
            System.out.println("商品名称："+p3[0]);
            System.out.println("商品价格："+p3[1]);
            System.out.println("商品描述："+p3[2]);
        }

        else if (y = p4[0].equals(a)) {
            System.out.println("你要查看的商品具体信息为：");
            System.out.println("商品名称："+p4[0]);
            System.out.println("商品价格："+p4[1]);
            System.out.println("商品描述："+p4[2]);
        }

        else {
            System.out.println("库中没有这个商品");
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入要查询的商品名称");
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        Merchandisefinder B = new Merchandisefinder();
        B.find(a);
    }
}
