package TreeDataStructure;


public class DeleteNodeInBST {
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
public static Node8 insert(Node8 root, int val)
{
    if(root==null)
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
        root.right=insert(root.right,val);
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

public  static Node8 delete(Node8 root,int val)
{
    if (root.left==null && root.right==null)
    {
        return null;
    }
    if (root.left==null)
    {
        return root.right;
    }
    else if (root.right==null)
    {
        return root.left;
    }
    Node8 IS=inorderSuccer(root.right);
    root.data= IS.data;
    root.right=delete(root.right, IS.data);

    return root;
}
public static Node8 inorderSuccer(Node8 root)
{
    while (root.left!=null)
    {
        root=root.left;
    }
    return root;
}
public static void main(String[] args) {
    int values[]={6,5,3,2,1,7,8,9};
    Node8 root=null;

    for (int i=0;i< values.length;i++)
    {
        root=insert(root,values[i]);
    }
    System.out.println("Binary Search tree is:");
    inorder(root);
    System.out.print(" ");

    System.out.println("After deletion the Node ");
    delete(root,6);
    inorder(root);
}
}

