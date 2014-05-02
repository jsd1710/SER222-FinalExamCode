/**
 * This is the complete RandArray class, tested for accuracy.
 * @author jacob.dobkins
 *
 */
public class RandArray 
{
	public static java.util.Random rng = new java.util.Random();
	
	/** Generate n random integers WITH duplicates.
	 */
	public static int[] randArray(int n, int low, int high)
	{
		int[] result = new int[n]; //Array to output.
		for (int i = 0; i < n; ++i)
		{ //Cycle through the array.
			int r = low + (rng.nextInt(high - low + 1)); //Generate a random number based on method parameters.
			result[i] = r; //Assign random number to next index of result.
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		rng.setSeed(1234569);
        System.out.println(java.util.Arrays.toString(randArray(10, 5, 100)));
        
        System.out.println(java.util.Arrays.toString(randArray(10, 5, 20)));
        
        System.out.println(java.util.Arrays.toString(randArray(10, 5, 5)));
        
        System.out.println(java.util.Arrays.toString(randArray(5, 5, 10)));
	}
}
