import  java.util.Scanner;
public class plalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String c = sc.nextLine();
        char a[] = new char[10];
        int j = c.length();
        for(int i=0;i < j;i++)
        {
            a[i] = c.charAt(i);
        }
        if(j % 2 == 1)
        {
            j -= 1;

            for(int i=0;i != j;++i,--j)
            {
                if (a[i] != a[j])
                {
                    System.out.println("该字符串不是回文");
                    break;
                }
                else if(a[i] == a[j] && (i+2) == j)
                {
                    System.out.println("该字符串是回文" );
                }
            }
        }
        else
        {
            j -= 1;
            for(int i =0; (i+1) != j;i++,j--)
            {
                if (a[i] != a[j])
                {
                    System.out.println("该字符串不是回文");
                    break;
                }
                else if(a[i] == a[j] && (i+1) == j)
                {
                    System.out.println("该字符串是回文" );
                }
            }
        }
    }
}

