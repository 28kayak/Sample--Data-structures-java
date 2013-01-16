
public class TemperatureConversion 
{
	public static void main(String [] args)
	{
		final double TABLE_BEGIN = -50.0; //tahble;s first celsius temp
		final double TABLE_END = 50.0;// teable's final Celsius temp
		final double TABLE_STEP = 10.0;
		
		double celsius; 
		double faherenheit;
		
		System.out.println("Temperature Conversion");
		System.out.println("----------------------");
		System.out.println("Clesius     Fahrenheit");
		
		for(celsius = TABLE_BEGIN;celsius <= TABLE_END;celsius += TABLE_STEP)
		{
			faherenheit = celsiusToFaherenheit(celsius);
					
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF\n",faherenheit );
			
		}
		System.out.println("----------------------");
	}//main
	public static double celsiusToFaherenheit(double c)
	{
		final double MINIMUM_CELSIUS = -273.15;
		if(c < MINIMUM_CELSIUS)
		{
			throw new IllegalArgumentException("Argument" + c + "is too small");
		}
		 
		return (9.0/5.0) * c + 32;
		
		
	}

}//class
/* 
	celsiusToFahrenheit 
	 public static double celsiusToFahrenheit(double c)
	 	convert a temp from C to F degrees
	Parameter 
	 c = a temperature in Celsius
	Preconditions 
	 c > = -273.15  <---- it is also absolute zero
	Returns
	 the temperature c converted to Fahrenheit degree
	Throws 
	 IllegalArgumentException 
	 --> if c is lower then -273.15 then it is thrown. 
*/