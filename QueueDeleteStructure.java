package QueueDataStructure;
import java.util.Scanner;
public class QueueDeleteStructure {
    public class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.next = null;
            this.data = data;
        }
    }

    Node1 rear = null;
    Node1 front = null;
    Scanner sc = new Scanner(System.in);

    public void insert() {
        System.out.println("Enter value:");
        int val = sc.nextInt();
        Node1 newNode = new Node1(val);

        if (rear == null && front == null) {
            rear = newNode;
            front = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void delete() {
        if(rear==null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            front=front.next;
        }
    }

    public static void main(String[] args) {
        QueueDeleteStructure q=new QueueDeleteStructure();
        q.insert();
        q.insert();
        q.insert();
        q.insert();
        q.insert();
        q.insert();
   
        q.delete();
        q.delete();
    }

}
