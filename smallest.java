package Array.java;

public class smallest {
    public static void main(String[] args) {
         int []a={4,2,5,6,87,4,3,6,7,9,7,5,1,14,6,7};
         int small=a[0];
         int n=a.length;
         
         for (int i=1;i<n;i++)
         {
             if (i<small)
             {
                 small=a[i];
             }
         }

        System.out.println("Smallest number is :"+small);
    }
}
