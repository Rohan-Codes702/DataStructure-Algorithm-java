public class addmtrx {
public static void main(String[] args)
{
  int [][]mtx1={{1, 2, 3},
          {4, 5, 6}};

  int [][]mtx2={{7, 8, 9},
          {10, 11, 12}};
int[][]result={{0, 0, 0},
        {0, 0, 0}};
for(int i=0;i<mtx1.length;i++)
{
for(int j=0;j<mtx1.length;j++) {
    result[i][j] = mtx1[i][j]+mtx2[i][j];
}
}
for(int i=0;i<mtx1.length;i++)
{
for(int j=0;j<mtx1.length;j++)
{
  System.out.println(result[i][j] +"    ");
  result[i][j]=mtx1[i][j]+mtx2[i][j];
}
}
System.out.println(" ");
}
}
