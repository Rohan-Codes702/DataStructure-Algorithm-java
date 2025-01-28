package TreeDataStructure;

public class ImplimentationTree {
    static class Node{
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

    static class binaryTree
    {
        static int indx=-1;
        public static Node buildtree(int[] nodes)
        {
            indx++;
            
            if (nodes[indx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[indx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
            
        }
    }
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1};
        binaryTree Tree = new binaryTree();
        Node root= Tree.buildtree(nodes);
        System.out.println(root.data);
    }
}
