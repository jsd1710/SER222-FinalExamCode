import java.util.Hashtable;

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
    	int[] result = new int[n];
    	Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
    	
    	int r = low + (rng.nextInt(high - low + 1));;
		for (int i = 0; i < n; ++i)
		{
			while (numbers.contains(r))
			{
				r = low + (rng.nextInt(high - low + 1));
			}
			result[i] = r;
			numbers.put(i,r);
		}
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
}

