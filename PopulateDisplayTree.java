package TreeDataStructure;
import java.util.*;
public class PopulateDisplayTree {
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

    public static void populate( Scanner sc)
    {
        System.out.println("Enter the root value:");
        int val=sc.nextInt();

        root=new Node(val);
        populate(root,sc);
    }

    private static void populate(Node root,Scanner sc)
    {
        System.out.println("Enter 1 insert left of the root "+root.data+"Otherwise enter the 0");
        int left= sc.nextInt();

        if (left==1)
        {
            System.out.println("Enter the value at left:");
            int val=sc.nextInt();

            root.left=new Node(val);
            populate(root.left,sc);
        }


        System.out.println("Enter 1 insert right of the root "+root.data +  "Otherwise enter the 0");
        int right= sc.nextInt();

        if (right==1)
        {
            System.out.println("Enter the value at right:");
            int val=sc.nextInt();

            root.right=new Node(val);
            populate(root.right,sc);
        }
    }
    public static void display()
    {
        if(root==null)
        {
            return;
        }
        display(root,"  ");
    }
    private static void display(Node root,String indent)
    {
        if (root ==null)
        {
            return;
        }
        System.out.println(indent+root.data);
        display(root.left,indent+"\t" );
        display(root.right,indent+"\t");

    }

    private static int count(Node root)
    {
        if (root==null)
        {
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);

        return left+right+1;
    }




    public static void main(String[] args) {

        populate(new Scanner(System.in));
        System.out.println("The tree is :");
        display();
        System.out.println("Nodes are:"+count(root));



    }

}
