public class constructionmethod {
    static  void figure(double r){
        double s;
        s = r*r*3.14;
        System.out.println("该圆的面积为："+s);
    }
    static void figure(double l,double h){
        double s;
        s = l*h;
        System.out.println("该长方形的面积："+s);
    }
    static void figure(int a){
        int s;
        s = a*a;
        System.out.println("该正方形的面积:"+s);
    }

    public static void main(String[] args) {
        figure(3.1);
        figure(3,5);
        figure(4);
    }

        }
