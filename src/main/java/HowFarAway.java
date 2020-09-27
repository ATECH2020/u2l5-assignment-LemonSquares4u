import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here
       Scanner userInput = new Scanner(System.in);  
        double bLat;
        double bLong;
        double eLat;
        double eLong;
        double distance;
        System.out.print("\n"+"Enter the latitude of the starting location: ");
        bLat = userInput.nextDouble();
        System.out.print("\n"+"Enter the longitude of the starting location: ");
        bLong = userInput.nextDouble();
        System.out.print("\n"+"Enter the latitude of the ending location: "); 
        eLat= userInput.nextDouble();
        System.out.print("\n"+"Enter the longitude  of the ending location: ");
        eLong = userInput.nextDouble();

       GeoLocation myGeoLocation = new GeoLocation(bLat,bLong);
       GeoLocation otherGeoLocation = new GeoLocation(eLat,eLong);
       distance = myGeoLocation.distanceFrom(otherGeoLocation);

        System.out.print("The distance is " + distance + " miles.");

    }
}