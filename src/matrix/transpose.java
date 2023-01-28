package matrix;
import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a = new int[8][5];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("请输入第"+(i+1)+"第"+(j+1)+"列的数");
                int c = sc.nextInt();
                a[i][j] = c;
            }
        }
        System.out.println("转置前矩阵为：");
        for(int i=0;i<8;i++)
        {
            for(int k=0;k<5;k++)
            {
                System.out.print(" "+a[i][k]);
            }
            System.out.println("");
        }
        int [][]b = new int[5][8];
        for(int k=0;k<5 ;k++)
        {

            for(int l=0;l<8 ;l++)
            {
                b[k][l] = a[l][k];

            }
        }
        System.out.println("转置后矩阵为：");
        for(int k=0;k<5;k++)
        {
            for(int l=0;l<8;l++)
            {
                System.out.print(" "+b[k][l]);
            }
            System.out.println("");
        }
    }
}
