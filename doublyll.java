package LinkedListDataStructure;

class Nodeb
{
    int data;
    Nodeb next;
    Nodeb pre;

Nodeb(int data)
{
    this.data=data;
    this.next=null;
    this.pre=null;
}

public void setNext(Nodeb nextNode)
{
    this.next=nextNode;
}

public void setpre(Nodeb preNode)
{
    this.pre=preNode;
}
public void printlstbyhead(Nodeb head)
{
    while (head!=null)
    {
        System.out.print(head.data+"=>");
        head= head.next;
    }
    System.out.println("NULL");

}
    public void printlstbytail(Nodeb tail)
    {
        while (tail!=null)
        {
            System.out.print(tail.data+"=>");
            tail= tail.next;
        }
        System.out.println("NULL");
    }
 public Nodeb addfirst(Nodeb head,int data)
 {
     Nodeb newNodde=new Nodeb(data);
     newNodde.setNext(head);
     head.setpre(newNodde);
     head=newNodde;
     return head;
 }

 public Nodeb addinsdex(Nodeb head ,int data,int index)
 {
     Nodeb newNodde=new Nodeb(data);
     Nodeb temp1=head;
     Nodeb temp2=head.next;
     int i=1;

     while (i<index-1)
     {
         temp1=temp1.next;
         temp2=temp2.next;
         i++;
     }
     temp1.setpre(newNodde);
     newNodde.setpre(temp1);

     newNodde.setNext(temp2);
     temp2.setpre(newNodde);

     return head;
 }

 public Nodeb addlast(Nodeb tail,int data)
 {
     Nodeb newNodde=new Nodeb(data);
     tail.setNext(newNodde);
     newNodde.setpre(tail);
     tail=newNodde;
     return tail;
 }

public Nodeb delfirst(Nodeb head)
{
    Nodeb temp=head.next;
    temp.setpre(head.pre);
    head=temp;
    return head;
}
public Nodeb delindex(Nodeb head,int index)
   {
        Nodeb temp1=head;
        Nodeb temp2=head.next;
        int i=1;

        while (i<index)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp1.setNext(temp2.next);
        temp2.setpre(temp1);
        return head;
   }
    public Nodeb dellast(Nodeb tail)
    {
        Nodeb temp1=tail.pre;
        temp1.setNext(tail.next);
        tail=temp1;
        return tail;

    }

}


public class doublyll {
    public static void main(String[] args) {
        Nodeb n1=new Nodeb(2);
        Nodeb n2=new Nodeb(3);
        Nodeb n3=new Nodeb(4);
        Nodeb n4=new Nodeb(5);
        Nodeb n5=new Nodeb(6);

        n1.setNext(n2);
        n2.setpre(n1);

        n2.setNext(n3);
        n3.setpre(n2);

        n3.setNext(n4);
        n4.setpre(n3);

        n4.setNext(n5);
        n5.setpre(n4);

        n1.printlstbyhead(n1);
        n5.printlstbytail(n5);

        n1=n1.addfirst(n1,1);
        n1.printlstbyhead(n1);

        n1=n1.addfirst(n1,1);
        n1.printlstbyhead(n1);

        n1=n1.addfirst(n1,1);
        n1.printlstbyhead(n1);

        n1=n1.addfirst(n1,1);
        n1.printlstbyhead(n1);

        n1=n1.addinsdex(n1,2,222);
        n1.printlstbyhead(n1);

        n5=n5.addlast(n5,7);
        n5.printlstbyhead(n5);

        n1=n1.delfirst(n1);
        n1.printlstbyhead(n1);

        n1=n1.delindex(n1,2);
        n1.printlstbyhead(n1);

        n1=n1.dellast(n1);
        n1.printlstbyhead(n1);


    }
}
