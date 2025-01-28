package TreeDataStructure;

import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

public class OrderLevelOfTree {
    public static class Node2 {
        int data;
        Node2 left;
        Node2 right;

        Node2(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node2 root;

    public static void populate( Scanner sc)
    {
        System.out.println("Enter the root value:");

        int value=sc.nextInt();
        root =new Node2(value);

        populate(root,sc);

    }
    private static void populate(Node2 root,Scanner sc)
    {
        System.out.println("Enter 1 for insert value in right node othewise 0");
        int left=sc.nextInt();

        if (left==1)
        {
            System.out.println("Enter value :");
            int val= sc.nextInt();

            root.left=new Node2(val);

            populate(root.left,sc);
        }
        System.out.println("Enter 1 for insert value in right node othewise 0");
        int right=sc.nextInt();

        if (right==1)
        {
            System.out.println("Enter the value :");
            int val=sc.nextInt();

            root.right=new Node2(val);

            populate(root.right,sc);
        }

    }
    public static void levelorder(Node2 root)
    {
        Queue<Node2>q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            if (root==null)
            {
                return;
            }
            Node2 currentNode=q.remove();

            if (currentNode==null)
            {
                System.out.println(" ");

                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.println(root.data+" ");


                    if (currentNode.left!=null)
                    {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right!=null)
                    {
                        q.add(currentNode.right);
                    }
                }
            }
        }

    public static void main(String[] args) {
        populate(new Scanner(System.in));
        System.out.println("THE Order level of Tree is:");
        levelorder(root);
    }

}
