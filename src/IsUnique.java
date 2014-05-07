import java.util.Hashtable;

/**
 * This is the complete IsUnique class, tested for accuracy.
 * @author jacob.dobkins
 *
 */
public class IsUnique
{

    /** Return true if there are NO duplicate values 
     * @param A an array of integers.
     * @return True if and only if every entry in A is unique. 
     */
    public static boolean isUnique(int[] A) 
    {
    	Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
    	for (int i = 0; i < A.length; i++)
    	{
    		if (numbers.containsKey(A[i]))
    		{
    			return false;
    		}
    		numbers.put(A[i], i);
    	}
        return true;
    }

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
        
        RandArray.rng.setSeed(127); 
        int[] a1 = RandArray.randArray(10, 0, 100);
        System.out.println(isUnique(a1));
        
        int[] a2 = RandArray.randArray(10, 0, 0);
        System.out.println(isUnique(a2));
        
        int[] a3 = RandArray.randArray(10, 0, 14);
        System.out.println(isUnique(a3));
        
        int[] a4 = RandArray.randArray(10, 0, 24);
        System.out.println(isUnique(a4));
        
        int[] a5 = RandArray.randArray(10, 0, 34);
        System.out.println(isUnique(a5));
        
        int[] a6 = RandArray.randArray(1, 0, 0);
        System.out.println(isUnique(a6));
        
        int[] a7 = RandArray.randArray(1, 0, 1);
        System.out.println(isUnique(a7));

    }
}

