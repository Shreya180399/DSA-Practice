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
    public static void main(String[] args) 
    {
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
    }
}