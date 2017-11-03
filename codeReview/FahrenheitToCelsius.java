package assignment2;

public class FahrenheitToCelsius
{
	public static void main(String[] args)
	{
		float fahrenheit=160;
		
		float celsius;
		
		celsius = (fahrenheit - 32) * 5/9 ;
		
		System.out.println("The Temperature in Fahrenheit is "+fahrenheit);
		System.out.println();
		System.out.println("The Temperature in Celsius is "+celsius);

	}
}
