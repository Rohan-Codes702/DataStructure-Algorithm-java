package QueueDataStructure;
import java.util.Scanner;
public class QueueInsertoperation {
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node rear=null;
    Node front =null;

    Scanner sc=new Scanner(System.in);

    public void  insert()
    {
        System.out.println("Enter value:");
        int val=sc.nextInt();

        Node newNode=new Node(val);

        if (rear==null && front ==null)
        {
            rear=newNode;
            front=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }

    public void display()
    {
        Node temp=front;
        while (temp!=null)
        {
            System.out.print(temp.data+" =>");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        QueueInsertoperation q=new QueueInsertoperation();
        q.insert();
        q.insert();
        q.insert();

        q.display();
    }
}
