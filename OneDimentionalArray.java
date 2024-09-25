package Array;
import java.util.Scanner;
public class OneDimentionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int []a=new int[50];
        System.out.println("Enter the array of element");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered array elements are:");
        for (int i=0;i<n;i++)
        {
            System.out.print(" " +a[i]);
        }
    }
}
