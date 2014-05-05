/**
 * The complete Middle class, tested for accuracy.
 * @author jacob.dobkins
 *
 */

public class Middle
{

    /** Return the value in the middle of a linked list. 
     *
     * Return the item at position floor(length/2)
     *
     * @param head The head node of a linked list. 
     *
     * Your solution must work in one pass. 
     */
    public static int middle(LinkedList.Node head) 
    {
   		LinkedList.Node temp = head; //Temp Node used to cycle through the LinkedList head.
    	
    	int nodeCount = 1;
    	while (temp != null)
    	{ //Until you reach the end of the linkedList head.
    		nodeCount++; //Increment the count of Nodes found.
    		temp = temp.next; //Cycle to next Node.
    	}
    	
    	int middle = nodeCount/2; //Find middle index.
    	
    	temp = head; //Reset temp to cycle through to middle.
    	for (int i = 1; i < middle; ++i)
    	{ //From the first Node, to the middle Node.
    		temp = temp.next;
    	}
    	
    	return temp.data;
    }

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	int[] input = {0, 6, 2, 1, 4, 3, 5, 7, 9, 8};
    	LinkedList.Node temp = LinkedList.fromArray(input);
    	System.out.println(middle(temp));
    	
    	int[] input2 = {6, 2, 1, 4, 3, 5, 7, 9, 8};
    	temp = LinkedList.fromArray(input2);
    	System.out.println(middle(temp));
    	
    	int[] input3 = {6, 2, 1, 4, 3, 5, 7, 9};
    	temp = LinkedList.fromArray(input3);
    	System.out.println(middle(temp));
    	
    	int[] input4 = {0};
    	temp = LinkedList.fromArray(input4);
    	System.out.println(middle(temp));
    	
    	int[] input5 = {0, 1};
    	temp = LinkedList.fromArray(input5);
    	System.out.println(middle(temp));
    	
    	int[] input6 = {0, 1, 2, 3, 4};
    	temp = LinkedList.fromArray(input6);
    	System.out.println(middle(temp));
    	
    	int[] input7 = {};
    	temp = LinkedList.fromArray(input7);
    	System.out.println(middle(temp));
    }
}

