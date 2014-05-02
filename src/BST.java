/**
 * This is the complete BST class, tested for accuracy.
 * @author jacob.dobkins
 *
 */

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
    	Node root = new Node(); //Creates root set to return.
    	root.data = A[0]; //First node obviously takes first data.
    	
    	for (int i = 1; i < A.length; i++)
    	{ //Inserts the second element of A onward into the root tree.
    		insert(root, A[i]);
    	}
    	return root;
    }
    
    private static void insert(Node subTree, int data)
	{
		assert subTree != null; //insert() will make Nodes as necessary, should never be null.
		
		if(data < subTree.data)
		{ //If the data must traverse left.
			if(subTree.left == null)
			{ //If there is no Node to the left.
				Node theNode = new Node();
				theNode.data = data; //Set the Node's data to inserted data.
				subTree.left = theNode; //The new Node belongs in this location.
			}
			else
			{ //Continue traversing the left tree.
				insert(subTree.left,data);
			}
		}
		else if (data > subTree.data)
		{ //If the data must traverse right.
			if(subTree.right == null)
			{ //If there is no Node to the right.
				Node theNode = new Node();
				theNode.data = data; //Set the Node's data to inserted data.
				subTree.right = theNode; //The new Node belongs in this location.
			}
			else
			{ //Continue traversing the right tree.
				insert(subTree.right,data);
			}
		}
		//Ignore equal case.
	}

    public static void preorder(Node rootNode) 
    { //DLR
    	if (rootNode != null)
		{ //If there is data to be found:
    		System.out.print(rootNode.data);// + "->");
		}
    	if (rootNode.left != null)
		{ //If there is a left Node traverse the left Tree:
    		preorder(rootNode.left);
		}
    	if (rootNode.right != null)
    	{ //If there is a right Node traverse the right Tree:
    		preorder(rootNode.right);
    	}
    	
    }

    public static void inorder(Node rootNode) 
    { //LDR
    	if (rootNode.left != null)
		{ //If there is a left Node traverse the left Tree:
    		inorder(rootNode.left);
		}
    	
    	//Print the data of the left most Nodes not visited.
    	System.out.print(rootNode.data);
    	
    	if (rootNode.right != null)
    	{ //If there is a right Node traverse the right Tree:
    		inorder(rootNode.right);
    	}
    }

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	int[] input = {6, 2, 1, 4, 3, 5, 7, 9, 8};
    	Node temp = buildTree(input);
    	inorder(temp);
    	System.out.println();
    	preorder(temp);
    	
    	System.out.println();
    	
    	int[] input1 = {0};
    	temp = buildTree(input1);
    	inorder(temp);
    	System.out.println();
    	preorder(temp);

    	System.out.println();
    	
    	int[] input2 = {0,1};
    	temp = buildTree(input2);
    	inorder(temp);
    	System.out.println();
    	preorder(temp);
    	
    	System.out.println();
    	
    	int[] input3 = {1,1};
    	temp = buildTree(input3);
    	inorder(temp);
    	System.out.println();
    	preorder(temp);
    	
    	System.out.println();
    	
    	int[] input4 = {0, 6, 2, 1, 4, 3, 5, 7, 9, 8};
    	temp = buildTree(input4);
    	inorder(temp);
    	System.out.println();
    	preorder(temp);
    }
}

