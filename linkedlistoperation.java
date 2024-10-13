package LinkedListDataStructure;

class Node5
{
    String data;
    Node5 next;

 Node5(String data)
 {
     this.data=data;
     this.next=null;
 }
public void setNext(Node5 nextNode)
{
  this.next=nextNode;
}
public static void printlist1(Node5 head)
{
    while(head!=null)
    {
        System.out.print(head.data+" =>");
        head=head.next;
    }
    System.out.println("null");
}
public Node5 addfirst1(Node5 head,String data) {
    Node5 newnode = new Node5(data);
    newnode.setNext(head);
    head = newnode;
    return head;
}
public Node5 addlast(Node5 head,String data)
{
    Node5 newNode=new Node5(data);
    Node5 temp=head;
    while (temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newNode;
    return head;
}
public Node5 addindex(Node5 head,String data,int index)
{
    Node5 newNode=new Node5(data);
    Node5 temp1=head;
    Node5 temp2=head.next;
    int i=1;
    while (i<index-1)
    {
        temp1=temp1.next;
        temp2=temp2.next;
        i++;
    }
    temp1.setNext(newNode);
    newNode.setNext(temp2);
    return head;

}
public Node5 removefirst(Node5 head)
{
    head=head.next;
    return head;
}
public Node5 removelast(Node5 head)
{
    Node5 temp1=head;
    Node5 temp2=head.next;

    while (temp2.next!=null)
    {
      temp1=temp1.next;
      temp2=temp2.next;
    }
    temp2.next=null;
    return head;
}
}
public class linkedlistoperation {
    public static void main(String[] args) {
        Node5 n1=new Node5("R");
        Node5 n2=new Node5("o");
        Node5 n3=new Node5("h");
        Node5 n4=new Node5("a");
        Node5 n5=new Node5("n");
        Node5 n6=new Node5("M");
        Node5 n7=new Node5("a");
        Node5 n8=new Node5("n");
        Node5 n9=new Node5("e");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n9);
        Node5.printlist1(n1);

        n1=n1.addfirst1(n1,"Rohan");
        Node5.printlist1(n1);

        n1.addlast(n1,"complete");
         Node5.printlist1(n1);

        n1= n1.removefirst(n1);
        Node5.printlist1(n1);
        n1=n1.removelast(n1);
        Node5.printlist1(n1);
        n1=n1.addindex(n1,"zz",4);
        Node5.printlist1(n1);

    }
}
