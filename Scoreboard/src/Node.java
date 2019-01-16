/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of Singly Linked List that creates a 
 * Video Game High scores lists. It then removes the 
 * lowest score when the list gets over 10 scores.
 * 9/24/2018
 */

//class Node that contains the constructors used 
//to implement Nodes later on in the program
public class Node 
{
	//int data stores the scores later on while
	//Node next is used as a placeholder for nodes
	public int data;
	public Node next;
	
	//constructor for Node
	public Node()
	{
		next = null;
		data = 0;
	}
	
	//constructor for Node
	public Node(int d, Node n)
	{
		data = d;
		next = n;
	}
	
	//sets the Node to the next node
	public void setNode(Node n)
	{
		next = n;
	}
	
	//sets the data to the current node
	public void setData(int d)
	{
		data = d;
	}
	
	//gets the current node
	public Node getNode()
	{
		return next;
	}
	
	//gets the data of the current node
	public int getData()
	{
		return data;
	}
}
