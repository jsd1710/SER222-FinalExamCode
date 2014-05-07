/**
 * This is the complete RandArrayUnique class, tested for accuracy.
 * @author jacob.dobkins
 *
 */
public class RandArrayUnique
{
	public static java.util.Random rng = new java.util.Random();
		
    /** Return an array of random values with no duplicates
     *
     * @param n The number of items in the returned array
     * @param low The minimum possible random value to generate
     * @param high The maximum possible random value to generate. 
     * @return An array of random integers in random order, each in low..high.
     */
    public static int[] randArrayUnique(int n, int low, int high)
    {
    	/* Uncomment this field if you want to use the HashTabled algorithm.
    	int[] result = new int[n];
    	
    	Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
    	
    	int r = low + (rng.nextInt(high - low + 1));
    	
		for (int i = 0; i < n; ++i) // For O(n).
		{
			while (numbers.containsKey(r)) //Contains key O(1).
			{
				r = low + (rng.nextInt(high - low + 1));
			}
			result[i] = r;
			numbers.put(r,i); //Put O(1).
		}
		*/
    	int[] result = alternative(n, low, high); //Comment this if you want to use Hashtabled algorithm.
		return result;
    }
   

    public static void main(String[] args) 
    {
        //Test your code here (do not ask for input)
    	rng.setSeed(1234569);
        System.out.println(java.util.Arrays.toString(randArrayUnique(5, 5, 9)));
        System.out.println(java.util.Arrays.toString(randArrayUnique(6, 5, 10)));
        System.out.println(java.util.Arrays.toString(randArrayUnique(15, 0, 100)));
        System.out.println(java.util.Arrays.toString(randArrayUnique(30, 5, 34)));
    }
    
    private static int[] alternative(int n, int low, int high)
    {
    	int[] result = RandArray.randArray(n,low,high);;
    	while (!IsUnique.isUnique(result))
    	{
    		result = RandArray.randArray(n,low,high);
    	}
    	return result;
    }
}

