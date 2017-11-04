package assignment2;

public class BMICalculator
{
	public static void main(String[] args)
	{
		int weight=85;
		int heightincm=180;
		float heightinmeter;
		
		heightinmeter=heightincm/100.0f;
		
		float bmi=weight/(heightinmeter*heightinmeter);
		System.out.println("your BMI is "+bmi+" ");
		
		if(bmi<=18.5)
		{
			System.out.print("Underweight");
		}
		
	}

}
