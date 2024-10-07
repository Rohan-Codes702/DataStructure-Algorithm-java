package Array.java;

import java.util.Scanner;

public class multidimentional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[50][50];
        //int []b=new int[50];
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int i,j;

        System.out.println("Enter the array element:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
               a [i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered array elements are:");

        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }




    }
}
