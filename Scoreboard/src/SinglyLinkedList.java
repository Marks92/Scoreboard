/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of Singly Linked List that creates a 
 * Video Game High scores lists. It then removes the 
 * lowest score when the list gets over 10 scores.
 * 9/24/2018
 */


/* Singly linked list class creates the linked list that will
 * store the Top scores as well as the methods to add, remove
 * and print the elements of the linked list */
public class SinglyLinkedList
{
	private Node head;
	private int size;
	
	//constructor for the Singly Linked List
	public SinglyLinkedList()
	{
		head = null;
		size = 0;
	}
	
	//method to add an integer at a given position based on its value
	public void add(int data)
    {
		/* New node values that will add
		 * a node based on its value and based on whether
		 * it should be at the head, middle, or tail */
        Node newnode, p, temp = null;
        newnode = new Node(data, null);
        
        boolean insert = false;
        
        //if the head is null the new node will be the head
        if (head == null)
        {
           head = newnode;
        }
        //if the data value is greater than or equal to the head value
        //this will insert after the head
        else if (data >= head.getData())
        {
            newnode.setNode(head);
            head = newnode;
        }
        //if the data is less than the head it will insert after the head
        else
        {
            temp = head;
            p = head.getNode();
            while(p != null)
            {
                if (data <= temp.getData() && data >= p.getData())
                {
                    temp.setNode(newnode);
                    newnode.setNode(p);
                    insert = true;
                    break;
                }
                else
                {
                    temp = p;
                    p = p.getNode();
                }
            }
            if (insert == false)
            {
                temp.setNode(newnode);
            }
        }
        size++;
    }
	
	/* method that removes data based off its position
	* entering an integer value will correspond to its location
	* in the linked list */
	public void remove(int position)
	{
		//if the position is 1 it will delete the first node in the 
		//singly linked list
		if(position == 1)
		{
			head = head.getNode();
			size--;
			return;
		}
		if(position == size)
		{
			Node p = head;
			
			for (int i = 1; i < size - 1; i++)
                p = p.getNode();
                p.setNode(null);  
            
            size --;
            
            return;
		}
		Node p = head;
		position = position - 1;
		
		for (int i = 1; i < size - 1; i++) 
	       {
	           if (i == position) 
	           {
	               Node temp = p.getNode();
	               temp = temp.getNode();
	               p.setNode(temp);
	               break;
	           }
	           p = p.getNode();
	        }
	        size-- ;
	}
	
	//method that prints the list
	public void print()
	{
		//if the size of the list is 0 or null the list is empty
		//and no scores! will print
		if(size == 0)
		{
			System.out.println("No scores!\n");
			return;
		}
		
		if(head.getNode() == null)
		{
			System.out.println(head.getData());
			return;
		}
		
		Node p = head;
		System.out.println(head.getData()+ " ");
		p = head.getNode();
		
		//this will print the entire list until the end of the list
		while(p.getNode() != null)
		{
			System.out.println(p.getData()+ " ");
			p = p.getNode();
		}
		
		System.out.println(p.getData()+ "\n");
	}
	
	//returns the size of the linked list
	public int getSize()
	{
		return size;
	}
	
}
