package TreeDataStructure;
import java.util.Scanner;
public class BinaryTree {
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

    public static Node root=null;

    public static void populate( Scanner sc)
    {
        System.out.println("Enter the root value:");
        int val=sc.nextInt();

        root=new Node(val);
        populate(root,sc);
    }
    public static void populate(Node root ,Scanner sc)
    {
        System.out.println("Enter 1 for insert at the left otherwise 0");
        int left=sc.nextInt();

        if (left==1)
        {
            System.out.println("Enter value for insert left:");
            int val=sc.nextInt();
            root=new Node(val);
            populate(root,sc);
        }

        System.out.println("Enter 1 for insert at right otherwise enter 0:");
        int right=sc.nextInt();

        if (right==1)
        {
            System.out.println("Enter value insert at right:");
            int val=sc.nextInt();
            root=new Node(val);
            populate(root,sc);
        }
    }
    public static void Display()
    {
        if (root==null)
        {
            return;
        }
        Display(root," ");
    }
    private static void Display(Node root ,String indent)
    {
        if (root==null)
        {
            return;
        }
        System.out.println(indent+root.data);
        Display(root.left,indent+"\t");
        Display(root.right,indent+"\t");

    }

    public static void main(String[] args) {
        populate(new Scanner (System.in));
        Display();
    }
}
