package Array.java;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        int []a=new int[50];

        a = new int[]{1, 2, 3, 4, 6, 3, 2, 4, 3, 34, 22, 34, 5, 4, 6};
        int large=a[0];
        int n = a.length;
        int i;
        for (i=1;i<n;i++)
        {
            if(i>large)
            {
                large=a[i];
            }
        }
        System.out.println("Largest element is:"+large);
    }
}
