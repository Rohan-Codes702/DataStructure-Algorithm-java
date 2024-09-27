package Recursion;

public class MergeSort {
    public static void conque(int []arr,int si,int li,int mid)
    {
        int []merged=new int[li-si+1];

        int indx1=si;
        int indx2=mid+1;
        int x=0;

        while(indx1<=mid && indx2<=li)
        {
            if (arr[indx1]<=arr[indx2])
            {
                merged[x++]=arr[indx1++];
            }
            else
            {
                merged[x++]=arr[indx2++];
            }
        }
        while (indx1<=mid)
        {
            merged[x++]=arr[indx1++];
        }
           while (indx2<=li)
           {
               merged[x++]=arr[indx2++];
           }
           for (int i = 0,j=si; i<merged.length; i++,j++)
           {
               arr[j]=merged[i];
           }
    }
    public static void divide(int []arr,int si,int li)
    {
        if (si>=li)
        {
            return ;
        }
        int mid=(si+li)/2;
        divide(arr,si,mid);
         divide(arr,mid+1,li);
        conque(arr,si,li,mid);


    }
    public static void main(String[] args) {
        int []arr={9,8,7,3,5,6};
        int n= arr.length;
        divide(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
