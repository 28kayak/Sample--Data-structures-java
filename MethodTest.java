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
			
		}		
		
	}
	
	
	
	
	
	
}//class
