package LinkedListDataStructure;

class  Nodec {
    int val;
    Nodec next;

    Nodec(int val) {
        this.next = null;
        this.val = val;
    }

    public void setNext(Nodec nextNode) {
        this.next = nextNode;
    }

    public void printlst(Nodec head) {
        Nodec temp = head;
        do {
            System.out.print(temp.val + "=>");
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("NULL");
    }

    public Nodec addfrst(Nodec head, int val) {
        Nodec newNode = new Nodec(val);
        Nodec temp = head;
        do {
            temp = temp.next;
        }
        while (temp.next != head);
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Nodec addlast(Nodec head, int val) {
        Nodec NewNode = new Nodec(val);
        Nodec temp = head;

        do
        {
            temp = temp.next;
        }
        while (temp.next!= head);
        temp.next = NewNode;
        NewNode.next = head;
        return head;
    }

    public Nodec addindex(Nodec head, int val,int index) {
        Nodec newNode = new Nodec(val);
        Nodec temp1 = head;
        Nodec temp2 = head.next;
        int i=1;
        while (i<index-1)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp1.next=newNode;
        newNode.next=temp2;
        return head;
    }

    public Nodec delfirst(Nodec head)
    {
        Nodec temp=head.next;

       do
        {
            temp=temp.next;
        }
       while (temp.next!=head);
       head=head.next;
       temp.next=head;
        return head;

    }

    public Nodec deleteindex(Nodec head,int index)
    {
        Nodec temp1=head;
        Nodec temp2=head.next;
        int i=1;

        while (i<index)
        {
            temp1= temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp1.next=temp2.next;
        return head;
    }

    public Nodec dellast(Nodec head)
    {
        Nodec temp1=head;
        Nodec temp2=head.next;

        do
        {
         temp1=temp1.next;
         temp2=temp2.next;
        }
        while (temp2.next!=head);
        temp1.next=temp2.next;
        return head;

    }
}
public class cirlinkedlist {
    public static void main(String[] args) {
        Nodec n1=new Nodec(2);
        Nodec n2=new Nodec(3);
        Nodec n3=new Nodec(4);
        Nodec n4=new Nodec(5);
        Nodec n5=new Nodec(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n1);

        n1.printlst(n1);

        n1=n1.addfrst(n1,1);
        n1.printlst(n1);

        n1=n1.addlast(n1,7);
        n1.printlst(n1);

        n1=n1.addindex(n1,11,1);
        n1.printlst(n1);

        n1=n1.delfirst(n1);
        n1.printlst(n1);


        n1=n1.deleteindex(n1,1);
        n1.printlst(n1);

        n1=n1.dellast(n1);
        n1.printlst(n1);

    }
}
