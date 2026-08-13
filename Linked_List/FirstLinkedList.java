import java.util.Scanner;

public class FirstLinkedList 
{
    static class Node 
    {
        int data;
        Node next;    
    }

    public static void display(Node first)
    {
        Node current = first;

        while (current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;    
        }
        System.out.println("null");
    }

    public static int countNodes(Node first)
    {
        Node current = first;

        int cnt = 0;
        while (current != null) 
        {
            cnt++;
            current = current.next;    
        }
        return cnt;
    }

    public static boolean search(Node first, int target)
    {
        Node current = first;
        boolean check = false;

        while (current != null) 
        {
            if (current.data == target) 
            {
                check = true;
                break;
            }    
            current = current.next;
        }
        return check;
    }

    public static Node insertAtBeginning(Node first, int data)
    {
        Node newnode = new Node();
        newnode.data = data;

        newnode.next = first;
        first = newnode;

        return first;
    }

    public static Node insertAtTheEnd(Node first, int data)
    {
        Node newnode = new Node();
        newnode.data = data;

        Node current = first;
        while (current.next != null) 
        {
            current = current.next;    
        }
        current.next = newnode;

        return first;

    }

    public static Node deleteAtBeginning(Node first)
    {
        if (first == null) 
        {
            return null;    
        }

        first = first.next;

        return first;
    }

    public static Node deleteLast(Node first)
    {
        if (first == null) 
        {
            return null;    
        }

        if (first.next == null) 
        {
            return null;    
        }
        Node current = first;
        Node prev = null;

        while (current.next != null) 
        {
            prev = current;
            current = current.next;    
        }
        prev.next = null;

        return first;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        fourth.data = 40;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        display(first);
        System.out.println();

        int count = countNodes(first);
        System.out.println("The total number of nodes are:" + count);

        System.out.println("Enter the number to check if present :");
        int num = sc.nextInt();

        boolean isPresent = search(first, num);

        if (isPresent) 
        {
            System.out.println(num + " is present !");    
        }
        else
        {
            System.out.println(num + " is not present!");
        }

        System.out.println("After inserting node in the beginning :");
        first = insertAtBeginning(first, 88);
        display(first);

        System.out.println();

        System.out.println("After inserting node at the end :");
        first = insertAtTheEnd(first, 100);
        display(first);

        System.out.println("After deleting the first node:");
        first = deleteAtBeginning(first);
        display(first);

        System.out.println("After deleting the last node:");
        first = deleteLast(first);
        display(first);
    }
}