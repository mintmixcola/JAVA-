public class Fibonacci {
    public static void main(String[] args) {
        int a[] = new int[19];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2;i < 20;i++)
        {
            a[i] = a[i-1] + a[i-2];
         }

    }
}
