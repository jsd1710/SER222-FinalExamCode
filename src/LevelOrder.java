/**
 * This is the complete LevelOrder class, tested for accuracy.
 * @author jacob.dobkins
 *
 */
public class LevelOrder
{
    /** Print a tree in level order (like a heap)
     * @param root The root node of a tree.
     */
    public static void printLevelOrder(BST.Node root) 
    {
    	java.util.LinkedList<BST.Node> queue= new java.util.LinkedList<BST.Node>(); //A queue to track which Nodes have been processed.
    	if (root != null)
    	{ //If there is a root Node initialized.
    		queue.add(root); //Enqueue
    	}
    	while (!queue.isEmpty())
    	{ //While there are Nodes to process.
    		BST.Node removed = queue.removeFirst(); //Dequeue and process.
    		System.out.print(removed.data);
    		
    		if (removed.left != null)
    		{ //Enqueue the left node of the processed Node if it exists.
    			queue.add(removed.left);
    		}
    		if (removed.right != null)
    		{ //Enqueue the right node of the processed Node if it exists.
    			queue.add(removed.right);
    		}	
    		
    		if (!queue.isEmpty())
    		{ //If the last Node was popped, stop adding arrows.
    			System.out.print("->");
    		}
    		else
    		{ //If the last Node was popped, start a new line.
    			System.out.println();
    		}
    	}
    }
    
    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	int[] input = {6, 2, 1, 4, 3, 5, 7, 9, 8};
    	BST.Node temp = BST.buildTree(input);
    	printLevelOrder(temp);
    	
    	int[] input1 = {0};
    	temp = BST.buildTree(input1);
    	printLevelOrder(temp);
    	
    	int[] input2 = {0,1};
    	temp = BST.buildTree(input2);
    	printLevelOrder(temp);
    	
    	int[] input3 = {1, 0};
    	temp = BST.buildTree(input3);
    	printLevelOrder(temp);
    	
    }
}

