package TreeDataStructure;

public class InsertBinarySearchTree {
    public static class Node5
    {
        int data;
        Node5 left;
        Node5 right;

     Node5(int data)
     {
         this.data=data;
     }
    }
    public static Node5 insert(Node5 root,int val)
    {
        if (root==null)
        {
            root=new Node5(val);
            return root;
        }
        if (root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else
        {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node5 root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,2,1,3,6,7};
        Node5 root=null;

        for (int i=0;i< values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println( " ");

    }
}
