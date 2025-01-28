package TreeDataStructure;

import java.util.Scanner;

public class DiameterOfTree {
    public static class Node4
    {
        int data;
        HeightOfTree.Node4 left;
        HeightOfTree.Node4 right;

        Node4(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static HeightOfTree.Node4 root;
    public static void populate(Scanner sc)
    {
        System.out.println("Enter the root value:");
        int val= sc.nextInt();

        root=new HeightOfTree.Node4(val);

        populate(root,sc);
    }
    private static void populate(HeightOfTree.Node4 root, Scanner sc)
    {
        System.out.println("Enter 1 for insert the node at the left otherwise 0 ");
        int left=sc.nextInt();

        if (left==1)
        {
            System.out.println("Enter the value:");
            int val=sc.nextInt();

            root.left=new HeightOfTree.Node4(val);
            populate(root.left,sc);
        }
        System.out.println("Enter 1 for insert the Right otherwise 0 ");
        int right=sc.nextInt();

        if (right==1) {
            System.out.println("Enter the value:");
            int val = sc.nextInt();

            root.right = new HeightOfTree.Node4(val);
            populate(root.right, sc);
        }
    }
    public static void display()
    {
        display(root," ");
    }
    private static void display(HeightOfTree.Node4 root , String indent)
    {
        if (root==null)
        {
            return;
        }
        System.out.println(root.data+indent+"\t");
        display(root.left,indent+" \t");
        display(root.right,indent+"\t");
    }

    public static int height(HeightOfTree.Node4 root)
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
    public static int diameter(HeightOfTree.Node4 root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftht=diameter(root.left);
        int rightht=diameter(root.right);
        int MHeight=height(root.left)+height(root.right)+1;

        return Math.max((leftht+rightht),MHeight);
    }

    public static void main(String[] args) {
        populate(new Scanner(System.in));

        System.out.println("Tree is:");

        display();

        System.out.println("Diameter of Tree will be:"+diameter(root));

    }

}
