package Array.java;
import java.util.Scanner;
public class Multiplyarry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int [][]a=new int[50][50];
        int [][]b=new int[50][50];
        int [][]c=new int[50][50];
        int i,j;

        System.out.println("Enter the array element of 1at matrix:");
        for (i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered array elemnt");
        for (i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Enter the array element of 2nd matrix:");
        for (i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered array elemnt");
        for (i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                for (int k=0;k<n;k++)
                {
                    c[i][j]=+a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
