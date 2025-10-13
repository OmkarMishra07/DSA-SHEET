package linkedList;
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main{
    public static void display(Node head){
        if(head == null)return;
        System.out.print(head.data + " ");
        display(head.next);
    
    }
    public static void reverse(Node head){
        if(head == null)return;
        reverse(head.next);
        System.out.print(head.data + " ");
    }
    public static Node createNode(int val){
        return new Node(val);
    }
    public static Node insertatfirst(Node head , int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        return head;

    }
    public static Node insertatend(Node head , int data){
        Node newnode = createNode(data);
        if(head == null){
            head = newnode;
            return head;
        }
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next = newnode;
        return head;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node head = null;
        while (true) {
            System.out.println("\n1. Add node at end");
            System.out.println("2. Add node at beginning");
            System.out.println("3. Display Nodes");
            System.out.println("4. Reverse Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data: ");
                    int data1 = in.nextInt();
                    head = insertatend(head, data1);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    int data2 = in.nextInt();
                    head = insertatfirst(head, data2);
                    break;

                case 3:
                    display(head);
                    break;

                case 4:
                    System.out.print("Reversed order: ");
                    reverse(head);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}