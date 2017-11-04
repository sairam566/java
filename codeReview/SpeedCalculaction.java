package assignment2;

public class SpeedCalculaction 
{
	public static void main(String[] args) 
	{
		double distanceInMeter=2000;
		double hours=1;
		double minutes=20;
		double seconds=30;
		
		
		double totalTimeInSeconds;
		double speed;
		double distanceInKm;
		double totalTimeInHours;
		double distanceInMiles;
		
		//Processing speed in Meter Per Second
		totalTimeInSeconds = ( hours * 60 * 60 ) + ( minutes * 60 ) + ( seconds );
		
		speed = ( distanceInMeter / totalTimeInSeconds );
		
		
		
		//Displaying speed in Meter_Per_Second
		System.out.println("The speed in Meters_per_second :"+speed);
		
		
		//Processing speed in KM/Min
		
		distanceInKm = distanceInMeter / 1000;
		
		totalTimeInHours = hours + ( minutes / 60 ) + ( seconds / 3600 );
		
		//Displaying speed in KM/Min
		System.out.println("The Speed in KM_per_hour: "+( distanceInKm / totalTimeInHours ) );
		
		//Processing speed in Miles_per_Hour
		
		distanceInMiles = distanceInMeter / 1609;
		
		//Displaying speed Miles_per_hour
		
		System.out.println("The Speed in Miles_per_hour: "+distanceInMiles/totalTimeInHours);
		
	}

}
