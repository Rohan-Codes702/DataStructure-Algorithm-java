package LinkedListDataStructure;

class Node2
{
    String data;
    Node2 next;

 Node2(String data)
 {
     this.data=data;
     this.next=null;
 }
 public void setNext(Node2 nextNode)
 {
     this.next=nextNode;
 }
 public Node2 addfirst(Node2 head, String data)
 {
     Node2 newnode=new Node2(data);
     newnode.setNext(head);
     head=newnode;
     return  head;
 }
 public Node2 addlast(Node2 head,String data)
 {

     Node2 newNode=new Node2(data);
     Node2 temp=head;
     while (temp.next!=null)
     {
         temp=temp.next;
     }
     temp.next=newNode;
     return  head;
 }
 public void printlist(Node2 head)
 {
     while (head!=null)
     {
         System.out.print(head.data+"  =>  ");
         head=head.next;
     }
     System.out.println("null");
 }
}
public class linkedli {
    public static void main(String[] args) {
        Node2 n1=new Node2("a");
        Node2 n2=new Node2("b");
        n1.setNext(n2);
        n1.printlist(n1);
        n1=n1.addfirst(n1,"Z");
        n1.printlist(n1);
        n1=n1.addlast(n1,"rohan");
        n1.printlist(n1);
    }
}
