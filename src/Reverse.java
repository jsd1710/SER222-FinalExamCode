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
    	
    	if (head == null || head.next == null)
    	{ //If there is no more List to reverse, also considers base case if there is no head to begin with.
    		return head;
    	}
    	
    	LinkedList.Node nextNode = head.next; //Goes to next Node in List.
    	head.next = null; //Removes that head Node from the rest of the list
    	reversedHead = reverse(nextNode); //Recursively breaks lists into smaller lists until the are single Nodes.
    	nextNode.next = head; //Adds the single Node before itself after it. (e.g. L->2 turns into 2->L where as L is all of the pending individual Nodes)
    	
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
    	
    	int[] input5 = {3,1,2};
    	temp = LinkedList.fromArray(input5);
    	temp = reverse(temp);
    	LinkedList.printList(temp);
    }
}

