/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of Singly Linked List that creates a 
 * Video Game High scores lists. It then removes the 
 * lowest score when the list gets over 10 scores.
 * 9/24/2018
 */

/* Game entry class will use methods from the Sinlgy Linked list
 * class  */
public class GameEntry 
{
	public static void main(String[] args)
	{
		System.out.println("Top scores using Singly Linked list!");
		System.out.println("------------------------------------");
		
		SinglyLinkedList Scores = new SinglyLinkedList();
		
		Scores.add(5);  	     //element 1 to be removed (lowest)
		Scores.add(10);		//element 2
		Scores.add(20);		//element 3
		Scores.add(15);		//element 4
		Scores.add(50); 	    //element 5
		Scores.add(17);		//element 6
		Scores.add(80);		//element 7
		Scores.add(100);		//element 8
		Scores.add(65);		//element 9
		Scores.add(42);		//element 10
		Scores.add(89);		//element 11
		Scores.print();
		System.out.println("The number of top scores is: " + Scores.getSize() + "\n");
		Scores.remove(11);
		System.out.println("Too many scores! deleting the lowest score from the list \n");
		Scores.print();
		System.out.println("The number of top scores is: " + Scores.getSize());
	}
}
