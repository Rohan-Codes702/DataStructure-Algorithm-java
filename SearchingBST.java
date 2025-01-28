package TreeDataStructure;

public class SearchingBST {
    public static class Node7
    {
        int data;
        Node7 left;
        Node7 right;

    Node7(int data)
    {
        this.data=data;
    }
    }
    public static Node7 insert(Node7 root,int val)
    {
        if(root==null)
        {
            root=new Node7(val);
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

    public static void inorder(Node7 root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static boolean searching(Node7 root,int key)
    {
        if (root==null)
        {
            return false;
        }
        if(root.data>key)
        {
            return searching(root.left,key);
        }
        else if (root.data==key)
        {
            return true;
        }
        else
        {
            return searching(root.right,key);
        }
    }
    public static void main(String[] args) {
        int values[]={6,5,3,2,1,7,8,9};
        Node7 root=null;

        for (int i=0;i< values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.print(" ");

        if(searching(root,3))
        {
            System.out.println(" Key is Found ");
        }
        else
        {
            System.out.println("Key is Not found ");
        }
    }
}
