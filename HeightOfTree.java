package TreeDataStructure;

import java.util.*;

public class HeightOfTree {
    public static class Node4
    {
        int data;
        Node4 left;
        Node4 right;

        Node4(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node4 root;
    public static void populate(Scanner sc)
    {
        System.out.println("Enter the root value:");
        int val= sc.nextInt();

        root=new Node4(val);

        populate(root,sc);
    }
    private static void populate(Node4 root, Scanner sc)
    {
        System.out.println("Enter 1 for insert the node at the left otherwise 0 ");
        int left=sc.nextInt();

        if (left==1)
        {
            System.out.println("Enter the value:");
            int val=sc.nextInt();

            root.left=new Node4(val);
            populate(root.left,sc);
        }
        System.out.println("Enter 1 for insert the Right otherwise 0 ");
        int right=sc.nextInt();

        if (right==1) {
            System.out.println("Enter the value:");
            int val = sc.nextInt();

            root.right = new Node4(val);
            populate(root.right, sc);
        }
    }
    public static void display()
    {
        display(root," ");
    }
    private static void display(Node4 root , String indent)
    {
        if (root==null)
        {
            return;
        }
        System.out.println(root.data+indent+"\t");
        display(root.left,indent+" \t");
        display(root.right,indent+"\t");
    }

    public static int height(Node4 root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftht=height(root.left);
        int rightht=height(root.right);
         int maximum=Math.max(leftht,rightht)+1;

         return maximum;

    }
    public static void main(String[] args) {
        populate(new Scanner(System.in));

        System.out.println("Tree is:");

        display();

        System.out.println("Height of the Tree is:"+height(root));

    }

}
