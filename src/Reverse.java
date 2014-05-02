/**This is the complete Reverse class, tested for accuracy.
 * 
 * @author jacob.dobkins
 *
 */
public class Reverse
{

    /** Return a list with entries in reverse order.
     * @param head The original linked list.
     * @return The head node of a reversed copy of the original list.
     */
    public static LinkedList.Node reverse(LinkedList.Node head) 
    {
    	LinkedList.Node reversedHead = new LinkedList.Node(); //Reversed Linked List.
    	
    	int headLength = 0; //Records the amount of nodes in head.
    	
    	LinkedList.Node temp = head; //Used for traversing the Linked List head.
    	while (temp.next != null)
    	{ //While there are initialized nodes in head: count them.
    		temp = temp.next;
    		headLength++;
    	}
    	
    	LinkedList.Node tempReverse = reversedHead; //Used for traversing the reversed Linked List.
    	while (headLength >= 0)
    	{ //While there are Nodes left to add.
    		temp = head;
    		for (int i = 0; i < headLength; i++)
        	{ //Finding the Node to be next in line to be reversed.
        		temp = temp.next;
        	}
    		tempReverse.data = temp.data; //Add the Node found above.
    		
    		if (headLength - 1 >= 0)
    		{ //If this is not the last Node.
    			tempReverse.next = new LinkedList.Node();
    			tempReverse = tempReverse.next; //Cycle to next Node in the reversed Linked List.
    		}
    		
    		headLength--; //One less Node to find.
    	}
    	
    	return reversedHead;
    }

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	int[] input1 = {6, 2, 1, 4, 3, 5, 7, 9, 8};
    	LinkedList.Node temp = LinkedList.fromArray(input1);
    	temp = reverse(temp);
    	LinkedList.printList(temp);
    	System.out.println();
    	
    	int[] input2 = {0};
    	temp = LinkedList.fromArray(input2);
    	temp = reverse(temp);
    	LinkedList.printList(temp);
    	System.out.println();
    	
    	int[] input3 = {0,1};
    	temp = LinkedList.fromArray(input3);
    	temp = reverse(temp);
    	LinkedList.printList(temp);
    	System.out.println();
    	
    	int[] input4 = {1,1};
    	temp = LinkedList.fromArray(input4);
    	temp = reverse(temp);
    	LinkedList.printList(temp);
    }
}

