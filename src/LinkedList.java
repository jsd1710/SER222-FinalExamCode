/**
 * This is the complete LinkedList class, tested for accuracy.
 * @author jacob.dobkins
 *
 */

public class LinkedList
{
    public static class Node 
    {
        int data;
        Node next;
    }


    /** Return the head of a linked list with the same values as an array. 
     * @param A an array of integers.
     * @return The head of a linked list with the same values as an array. 
     */
    public static Node fromArray(int[] A) 
    {
    	Node head = new Node(); //The head of the LinkedList set for Return.
    	
    	Node temp = head; //The temp Node for traversing the LinkedList head.
    	for (int i = 0; i < A.length; i++)
    	{ //Add each element of A to head.
    		temp.data = A[i]; //Copy data from A to the temp Node.
    		if (i+1 != A.length)
    		{ //If this is not the last Node.
    			temp.next = new Node();
    			temp = temp.next; //Cycle to the next Node.
    		}
    	}
    	
        return head;
    }

    public static void printList(Node head) 
    {
        //Print the numbers as 1->2->3->....
    	Node temp = head; //Node used for traversing the LinkedList head.
    	while (temp != null)
    	{ //While the temp Node is not empty.
    		System.out.print(temp.data); //Print the data.
    		
    		if (temp.next != null)
    		{ //If this is not the last Node to print.
    			System.out.print("->");
    		}
    		temp = temp.next; //Cycle to next Node.
    	}

    }

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	int[] input2 = {0};
    	Node temp = fromArray(input2);
    	printList(temp);
    	System.out.println();
    	
    	int[] input1 = {6, 2, 1, 4, 3, 5, 7, 9, 8};
    	temp = fromArray(input1);
    	printList(temp);
    	System.out.println();
    	
    	
    	
    	int[] input3 = {0,1};
    	temp = fromArray(input3);
    	printList(temp);
    	System.out.println();
    	
    	int[] input4 = {1,1};
    	temp = fromArray(input4);
    	printList(temp);
    }
}

