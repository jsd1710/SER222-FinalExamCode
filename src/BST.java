

public class BST
{

    static class Node 
    { 
    	Node left = null;
    	Node right = null;
        int data; 
    }

    public static Node buildTree(int [] A) 
    {
    	Node root = new Node();
    	root.data = A[0];
    	
    	for (int i = 1; i < A.length; i++)
    	{
    		Node temp = root;
    		if (A[i] < temp.data)
    		{
    			if (temp.left == null)
    			{
    				
    			}
    		}
    	}
    	return null;
    }

    public static void preorder(Node rootNode) 
    {
    	if (rootNode != null)
		{
    		System.out.println(rootNode.data);
		}
    	if (rootNode.left != null)
		{
    		preorder(rootNode.left);
		}
    	if (rootNode.right != null)
    	{
    		preorder(rootNode.right);
    	}
    	
    }

    public static void inorder(Node rootNode) 
    {
    	if (rootNode.left != null)
		{
    		inorder(rootNode.left);
    		
		}
    	System.out.println(rootNode.data);
    	//if (root != null)
		{
    		//inorder(root.data);
		}
    	
    	if (rootNode.right != null)
    	{
    		inorder(rootNode.right);
    	}
    }

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	int[] input = {6, 2, 1, 4, 3, 5, 7, 9, 8};
    	Node temp = buildTree(input);
    }
}

