
import java.util.Scanner;
public class LinkedList 
{ 
    static class Node 
    { 
        int data; 
        Node next; 

    } Node head; Node last;
    
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node new_node = new Node();
        
        new_node.data = data;
        new_node.next = null;
        
        if (list.head == null) 
        { 
            list.head = new_node;
            list.last = new_node;
        } 
        else 
        {  
            list.last.next = new_node;
            list.last = new_node; 
        } 
        return list; 
    }
    
    public static void printList(LinkedList list) 
    { 
        while (list.head != null) 
        { 
            System.out.print(list.head.data + " "); 
            list.head = list.head.next; 
        } 
    }
    
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList();
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