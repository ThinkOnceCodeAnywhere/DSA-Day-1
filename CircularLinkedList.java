import java.util.Scanner;
public class CircularLinkedList 
{ 
    static class Node 
    { 
        int data; 
        Node next; 
        Node prev;
    } Node head; Node last;
    
    public static CircularLinkedList insert(CircularLinkedList list, int data) 
    { 
        Node new_node = new Node();
        
        new_node.data = data;
        new_node.next = list.head;
        new_node.prev = null;
        
        if (list.head == null) 
        { 
            list.head = new_node;
            list.last = new_node;
        } 
        else 
        {  
        	new_node.prev = list.last;
            list.last.next = new_node;
            list.last = new_node; 
        } 
        return list; 
    }
    
    public static void printList(CircularLinkedList list) 
    { 
        while (list.head != null) 
        { 
            System.out.print(list.head.data + " "); 
            list.head = list.head.next; 
        } 
    }
    
    public static void main(String[] args) 
    { 
    	CircularLinkedList list = new CircularLinkedList();
		Scanner scan = new Scanner(System.in);
		int data;
		do
		{ 
			data = scan.nextInt();
			if(data > 0)
				list = insert(list,data);
		} while(data > 0);
		
		printList(list);
    } 
} 