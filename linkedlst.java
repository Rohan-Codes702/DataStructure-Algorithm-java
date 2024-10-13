package LinkedListDataStructure;
class Noden {
    String data;
    Noden next;

Noden(String data)
{
    this.next=null;
    this.data=data;
}
public void setNext(Noden nextNode)
{
    this.next=nextNode;
}
public void printlist(Noden head)
{
    while (head!=null)
    {
        System.out.print(head.data+"=>");
        head=head.next;
    }
    System.out.println("null");
}
public Noden reversee(Noden head)
{
    Noden current=head;
    Noden pre=null;

    while (current!=null)
    {
        Noden temp=current.next;
        current.next=pre;
        pre=current;
        current=temp;
    }
    return pre;

}
public Noden Addfirst(Noden head,String data)
{
    Noden newNode=new Noden(data);
    newNode.setNext(head);
    head=newNode;
    return head;
}
public Noden addlast(Noden head,String data) {
    Noden newNode = new Noden(data);
    Noden temp = head;
    while (temp.next != null)
    {
        temp = temp.next;
    }
    temp.next=newNode;
    return newNode;
}
public Noden delfirst(Noden head)
{
    head=head.next;
    return head;
}
public Noden dellast(Noden head)
{
    Noden temp1=head;
    Noden temp2=head.next;
    while (temp2.next!=null)
    {
        temp1=temp1.next;
        temp2=temp2.next;
    }
     temp1.next=null;
    return head;
}

}
public class linkedlst {
    public static void main(String[] args) {
        Noden n1=new Noden("Rohan");
        Noden n2=new Noden("s");
        Noden n3=new Noden("d");
        n1.setNext(n2);
        n2.setNext(n3);
        n1.printlist(n1);
        n1=n1.Addfirst(n1,"Rohan");
        n1.printlist(n1);
        n1=n1.addlast(n1,"M");
        n1.printlist(n1);
        n1=n1.delfirst(n1);
        n1.printlist(n1);
        n1=n1.dellast(n1);
        n1.printlist(n1);

       n1=n1.reversee(n1);
       n1.printlist(n1);

    }
}

