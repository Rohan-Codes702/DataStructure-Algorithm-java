package TreeDataStructure;

import java.util.Scanner;

public class SumOfNodes {

    public static class Node
    {
        int data;
        Node left;
        Node right;

    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    public static Node root;
    public static void populate(Scanner sc)
    {
        System.out.println("Enter the root value:");
        int val= sc.nextInt();

        root=new Node(val);

        populate(root,sc);
    }
    private static void populate(Node root,Scanner sc)
    {
        System.out.println("Enter 1 for insert the node at the left otherwise 0 ");
        int left=sc.nextInt();

        if (left==1)
        {
            System.out.println("Enter the value:");
            int val=sc.nextInt();

            root.left=new Node(val);
            populate(root.left,sc);
        }
        System.out.println("Enter 1 for insert the Right otherwise 0 ");
        int right=sc.nextInt();

        if (right==1) {
            System.out.println("Enter the value:");
            int val = sc.nextInt();

            root.right = new Node(val);
            populate(root.right, sc);
        }
    }
    public static void display()
    {
        display(root," ");
    }
    private static void display(Node root ,String indent)
    {
        if (root==null)
        {
            return;
        }
        System.out.print(root.data+indent+"\t");
        display(root.left,indent+" \t");
        display(root.right,indent+"\t");
    }

    public static int sum(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);

        return leftsum+rightsum+ root.data;
    }
    public static void main(String[] args) {

        populate(new Scanner(System.in));

        System.out.println("Tree is :\n");
        display();

        System.out.println("\nSum of Nodes of tree is:"+sum(root));
    }
}
