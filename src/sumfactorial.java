public class sumfactorial {
    public static void main(String[] args) {
        int sum = 0;
        int fac =1;
        int i = 1;
        for(; sum <= 10000; i++){
            fac = fac * i;
            sum += fac;
        }
        System.out.println("累加之和为："+sum);
        System.out.println(i);
    }
}
