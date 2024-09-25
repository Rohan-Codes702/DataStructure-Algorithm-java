package Array.java;

public class reversearray {
    public static void main(String[] args) {

        int []a={1,2,3,4,5,6,7,8,9,10};
        int n=a.length;
        int temp,i,j;

        for (i=0,j=n-1;i<=j;i++,j--)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for (int element:a)
        {
            System.out.print(element+"\t");
        }

    }
    }

