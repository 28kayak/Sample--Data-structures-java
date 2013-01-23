
public class MaxOfArray
{
	/*
	 * this private method checks to make sure that the specified value is contained 
	 * somewhere in the array a. the return value is true if the values is found.
	 * otherwise, the return values is false
	 */
	static boolean contains(int [] a, int value)
	{
		boolean isContained;
		int i;
		for(i=0; i < a.length; i++)
		{
			if(a[i] == value)
			{
				isContained = true; 
			}//if
		}//for
		
		isContained = false;
		return isContained;
	}//contains
	/*
	 * this private method checks to make sure that the specified vales is greater than or equal to 
	 * every element in the array a. in this case, the method returns true. on the other hand, if the 
	 * specified value is less than some element in the array, then method returns false.
	 */
	static boolean greaterOrEqual(int [] a, int value)
	{
		int i;
		for(i = 0; i < a.length ; i++)
		{
			if(a[i] > value)
			{
				return false;
			}
		}
		
		/*the loop finished without finding an array element that exceeds the value,
		 * so we can return true:
		 */
		return true;
	}//greaterOrEqual
	
	
	
	
	public static int maxOfArray(int [] a)
	{
		int answer;
		int i;
		
		//set answer to the largest value in the array.
		answer = a[0]; //initially set answer to first element
		
		for(i = 1; i < a.length; i++)
		{
			if(a[i] > answer)
			{
				answer = a[i];
			}
		}
		//check that the computation did what we expected;
		assert contains(a, answer)
			:"maxOfArray answer is not equal in the array";
		assert greaterOrEqual(a,answer)
			:"maxOfArray answer is less than an array element";
		return answer;
	}
	
	
}//class
