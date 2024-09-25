package Array.java;
import java.util.Scanner;

public class avrage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a=new int[50];
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();

        System.out.println("Enter the array element:");

        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enterd array is :");
        for (int i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }
        int sum=0;

        for (int element:a)
        {
            sum=sum+element;
        }
        System.out.println("\nAverage of array is :"+sum/n);

    }
}
