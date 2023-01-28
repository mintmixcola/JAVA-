public class hundredball {
    public static void main(String[] args) {
        int h = 100;
        int sum = 0;
        double a = h;
        int i ;
        for(i=0;i < 10;i++){
            a /= 2;
            if(i > 8){
                sum += 100;
                System.out.println(sum);
            }
            else{
                h /= 2;
                sum += h;
            }

        }
        System.out.println("第10次反弹高度为："+a);
        System.out.println("第10次触底路程："+sum);
    }
}
