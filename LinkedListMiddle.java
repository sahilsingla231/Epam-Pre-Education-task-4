import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node()
	{
		next = null;
	}
}

class LinkedList
{
	private Node head;
	private Node tail;
	
	LinkedList()
	{
		head = null;
		tail = null;
	}
	
	void insert(int val)
	{
		Node newnode = new Node();
		newnode.data = val;
		
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	int middle()
	{
		Node slow = head;
		Node fast = head;
		
		while((fast != null) && (fast.next != null))
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
	
}

public class LinkedListMiddle {
	public static void main(String []args)
	{
		LinkedList ll = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++)
		{
			int val = sc.nextInt();
			ll.insert(val);
		}
		
		System.out.println("Middle element: "+ll.middle());
		
		sc.close();
	}
}
