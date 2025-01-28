package TreeDataStructure;

public class InsertNodeInTree {

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

    public static Node insert(Node root,int val)
    {
            if(root==null)
            {
                root=new Node(val);
                root.left=root.right=null;
                root.data=val;
            }
            else
            {
                if(val<root.data)
                {
                    root.left=insert(root.left,val);
                }
                else
                {
                    root.right=insert(root.right,val);
                }
            }
            return root;
        }


    public static void main(String[] args) {
        int []values={1,2,3,4,5};
        Node root=null;
        root=insert(root,7);
        System.out.println(root);

    }
}
