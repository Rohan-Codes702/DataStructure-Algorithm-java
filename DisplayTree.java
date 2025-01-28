package TreeDataStructure;

import java.util.Scanner;

public class DisplayTree {

    static class Node1
    {
        int data;
        Node1 left;
        Node1 right;


     Node1(int data)
     {
         this.data=data;
         this.left=null;
         this.right=null;
     }
    }
    public static Node1 root;

    public static void populate(Scanner sc)
    {
        System.out.println("Enter the Root value:");
        int val=sc.nextInt();

        root=new Node1(val);
        populate(root,sc);
    }
    private static void populate(Node1 root,Scanner sc)
    {
        System.out.println("Enter 1 for left insert"+root.data +"otherwise enter 0");
        int left=sc.nextInt();
        if (left==1)
        {
            System.out.println("Enter value :");
            int val=sc.nextInt();

            root.left=new Node1(val);
            populate(root.left,sc);
        }

        System.out.println("Enter 1 for insert rigth "+root.data +"otherwise enter 0");
        int right=sc.nextInt();

        if (right==1)
        {
            System.out.println("Enter value :");
            int val=sc.nextInt();

            root.right=new Node1(val);
            populate(root.right,sc);
        }
    }
    public static void display()
    {
        if (root==null)
        {
            return;
        }
        display(root ," ");
    }
    private static void display(Node1 root ,String indent)
    {
        if (root ==null)
        {
            return;
        }
        display(root.right,indent+"\t");
        System.out.println(indent+root.data);
        display(root.left,indent+"\t");
    }
    public static void inoreder()
    {
        inorder(root);
    }
    private static void inorder(Node1 node)
    {
        if(node==null){
            return;
        }

        inorder(node.right);
        System.out.print(node.data+"->");
        inorder(node.left);
    }
    public static void preorder()
    {
        preorder(root);
    }
    private static void preorder(Node1 node)
    {
        if (node==null)
        {
            return;
        }
        System.out.print(node.data+"---> ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void postorder()
    {
        postorder(root);
    }
    private static void postorder(Node1 node)
    {
        if(node==null)
        {
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.data+"--->");
    }

    public static void main(String[] args) {
        populate(new Scanner(System.in));
        System.out.println("The Tree is:");
        display();

        System.out.println("The inorder traversal is:");
        inoreder();

        System.out.println("the preorder traversal is:");
        preorder();

        System.out.println("the postorder traversal is:");
        postorder();

    }
}
