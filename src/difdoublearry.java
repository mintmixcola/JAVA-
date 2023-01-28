
public class difdoublearry {
    public static void main(String[] args) {
      int [][]a = new int[3][];
      int i,j,k=0;
      for(i=0;i<3;i++)
          a[i]=new int[i+3];
          for(i=0;i<3;i++){
              for(j=0;j<a[i].length;j++){
                  a[i][j]=++k;
              }
          }
          for(i=0;i<3;i++){
              for(j=0;j<a[i].length;j++){
                  System.out.print(" "+a[i][j]);
              }
              System.out.println();
          }
      }
    }

