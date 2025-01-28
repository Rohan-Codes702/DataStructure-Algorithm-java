package TreeDataStructure;

import java.util.Scanner;

public class CountNodesTree {
    static class Node3
    {
        int data;
        Node3 left;
        Node3 right;


        Node3(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node3 root;

    public static void populate(Scanner sc)
    {
        System.out.println("Enter the Root value:");
        int val=sc.nextInt();

        root=new Node3(val);
        populate(root,sc);
    }
    private static void populate(Node3 root, Scanner sc)
    {
        System.out.println("Enter 1 for left insert"+root.data +"otherwise enter 0");
        int left=sc.nextInt();
        if (left==1)
        {
            System.out.println("Enter value :");
            int val=sc.nextInt();

            root.left=new Node3(val);
            populate(root.left,sc);
        }

        System.out.println("Enter 1 for insert rigth "+root.data +"otherwise enter 0");
        int right=sc.nextInt();

        if (right==1)
        {
            System.out.println("Enter value :");
            int val=sc.nextInt();

            root.right=new Node3(val);
            populate(root.right,sc);
        }
    }

    public static int countNodes(Node3 root)
    {
        if (root ==null)
        {
            return 0;
        }
        int leftcount=countNodes(root.left);
        int rightcount=countNodes(root.right);

        return leftcount+rightcount+1;
    }

    public static void main(String[] args) {
        populate(new Scanner(System.in));

        System.out.println("The Nodes of the Tree are:"+countNodes(root));
    }
}
