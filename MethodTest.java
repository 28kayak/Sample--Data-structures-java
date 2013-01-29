/*
 * To test various classes
 */




import java.util.Scanner;



public class MethodTest
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String insufficiency; 
		int allocateSeat;
		 
		System.out.println("Are 10 seats enough for your seat-chart? Y or N");
		insufficiency = scan.nextLine();
		if(insufficiency.equalsIgnoreCase("N"))
		{
			System.out.println("How many seat do you need??");
			allocateSeat = scan.nextInt();
			//SeatChart seatChart = new SeatChart(allocateSeat);
			System.out.println(allocateSeat);
			
			
			int array[] = new int[allocateSeat];
			/*
			for(int i = 0; i < array.length; i++)
			{
				array[i] = i;
				System.out.println(array[i]);  
			}
			*/
			System.out.println("from net");
			/*for ( int i = 0; i < array.length; ++i ) 
			{
				array[i] = i;
				System.out.println(array[i]); 
				
			}
			System.out.println(array[allocateSeat]);
			
			 */ 
			String array1[] = new String[10];
			
			 for ( int i = 0; i < array.length; ++i )
			 {
					array1[i] = "ƒf[ƒ^_" + i;
					System.out.println(array1[i]);
			}
			
			
			
		}		
		
	}
	
	
	
	
	
	
}//class
