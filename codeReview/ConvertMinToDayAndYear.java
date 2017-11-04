package assignment2;

public class ConvertMinToDayAndYear
{
	public static void main(String[] args)
	{
		int minutes=12360;
		
		float days;
		float years;
		
		days = minutes / 1440;
		years = minutes / 525600;
				
		System.out.println(minutes+" Minutes is EqualTo "+days+" Days");
		System.out.println();
		System.out.println(minutes+" Minutes is EqualTo "+years+" Years");
		
	}

}
