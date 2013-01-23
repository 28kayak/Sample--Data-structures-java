import java.util.Scanner;
public class MaxOf3 
{

	public static void main(String [] args)
	{
		int first;
		int second;
		int third;
		int largest;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("this program determines which value is the largest value");
		
		
		
		System.out.println("enter first argument");
		first = scan.nextInt();
		System.out.println("enter second argument");
		second = scan.nextInt();
		System.out.println("enter third argument");
		third = scan.nextInt();
		
		largest = maxOf3(first, second, third);
		System.out.printf("the largest value you entered is %d",largest);
	}//main
	
	public static int maxOf3(int a, int b, int c)
	{
		int answer;
		
		//set answer to the largest of a, b, and c:
		answer = 1;
		if(b > answer)
		{
			answer = b;
		}
		if(c > answer)
		{
			answer = c;
		}
		
		//check that the computation did what we expected;
		assert(answer == a)|| (answer == b)||(answer == c)
			: "maxOf3 answer is not equal to one of the argument";
		assert(answer >= a) && (answer >= b) && (answer >= c)
			:"maxOf3 answer is not equal to the largest argument";
		
		return answer;
	}//maxOf3
	
	
	
}//class
