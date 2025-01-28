package TreeDataStructure;

import java.util.ArrayList;

public class LeafByPathBST {
    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node insert(Node root, int val)
    {
        if (root==null)
        {
            root=new Node(val);
            return root;
        }
        if (root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else
        {
            root.right=insert(root.right,val) ;
        }
        return root;
    }

    public static void inorder(Node root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }
    public static void printpath(ArrayList<Integer>path)
    {
        for (int i=0;i< path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println(" ");
    }
    public static void leafpath(Node root, ArrayList<Integer>path)
    {
        if (root==null)
        {
            return;
        }
        path.add(root.data);

        if (root.left==null && root.right==null)
        {
            printpath(path);
        }
        else
        {
            leafpath(root.left,path);
            leafpath(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int[] values = {8, 7, 6, 5, 4, 3, 2, 1};
        Node root = null;

        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println(" ");

     leafpath(root,new ArrayList<>());

    }
    }
