package TreeDataStructure;

public class RangeOfBST
{
    public static class Node8
    {
        int data;
        Node8 left;
        Node8 right;

    Node8(int data)
    {
        this.data=data;
    }
    }

    public static Node8 insert(Node8 root,int val)
    {
           if (root==null)
           {
               root=new Node8(val);
               return root;
           }
           if (root.data>val)
           {
               root.left=insert(root.left,val);
           }
           else
           {
             root.right=insert(root.right,val) ;
           }
           return root;
    }

    public static void inorder(Node8 root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }
    public static void Range(Node8 root,int x,int y)
    {
        if (root==null)
        {
            return;
        }
        if(root.data>=x && root.data<=y)
        {
            Range(root.left,x,y);
            System.out.println(root.data+" ");
            Range(root.right,x,y);
        }
        else if (root.data>=x)
        {
            Range(root.left,x,y);
        }
        else
        {
          Range(root.right,x,y);
        }
    }

    public static void main(String[] args) {
        int[] values ={8,7,6,5,4,3,2,1};
        Node8 root=null;

        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println(" ");

        System.out.println("Range of Entered value is:");

        Range(root,1,4);


    }
}
