package LinkedListDataStructure;

class Node6
{
  String data;
  Node6 next;
  Node6 pre;

 Node6(String data)
 {
     this.data=data;
     this.next=null;
     this.pre=null;
 }
 public void setNext(Node6 nextNode)
 {
     this.next=nextNode;
 }
 public void setPre(Node6 preNode)
 {
     this.pre=preNode;
 }
 public void printlistbyhead(Node6 head)
 {
     while (head!=null)
     {
         System.out.print(head.data+"=>");
         head=head.next;

     }
     System.out.println("null");
 }
 public void printlistbytail(Node6 tail)
 {
     while (tail!=null)
     {
         System.out.print(tail.data+"=>");
         tail=tail.next;
     }
     System.out.println("null");
 }
 public Node6 addfirst(Node6 head,String data)
 {
     Node6 newNode=new Node6(data);
     newNode.setNext(head);
     head.setPre(newNode);

     head=newNode;
     return head;

 }
 public Node6 addlast(Node6 tail,String data)
 {
     Node6 newNode=new Node6(data);
     newNode.setPre(tail);
     tail.setNext(newNode);

     tail=newNode;
     return tail;
 }
}

public class Doublelinked {
    public static void main(String[] args) {
        Node6 n1 = new Node6("R");
       Node6 n2=new Node6("o");
       Node6 n3=new Node6("h");

        n1.setNext(n2);
        n2.setPre(n1);

        n2.setNext(n3);
        n3.setPre(n2);


        n1=n1.addfirst(n1,"Rohan");
        n1.printlistbyhead(n1);

        n1=n3.addfirst(n3,"Mane");
        n3.printlistbytail(n3);

        n3=n1.addlast(n1,"shreyash");
        n1.printlistbyhead(n1);

        n3=n3.addlast(n3,"rohh");
        n3.printlistbytail(n3);
    }
}
