package scheduler;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MyScheduler
{
	public void showStatus()
	{
		ArrayList<ParkingPlace> parkingPlace = new ArrayList<ParkingPlace>();
		parkingPlace.add(new ParkingPlace("1", VehicleType.Small));
		parkingPlace.add(new ParkingPlace("1", VehicleType.Small));
		parkingPlace.add(new ParkingPlace("1", VehicleType.Medium));
		parkingPlace.add(new ParkingPlace("1", VehicleType.Medium));
		parkingPlace.add(new ParkingPlace("1", VehicleType.Large));
		parkingPlace.add(new ParkingPlace("1", VehicleType.Large));
		ParkingArea parking = new ParkingArea(parkingPlace);

		System.out.println("Total Space available: " + parking.getTotalCount());
		System.out.println("Total Free Space available: " + parking.getAvailableCount());

		final String[] proper_noun = {"Fred", "Jane", "Marvin", "Daniel", "Fabian", "Werner", "Rene", "David"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
	    
		Vehicle vehicle = new Vehicle("AZ AA109", VehicleType.Medium);
		Customer customer = new Customer(proper_noun[index], vehicle);
		customer.entry(parking);

		System.out.println("Total Space available: " + parking.getTotalCount());
		System.out.println("Total Free Space available: " + parking.getAvailableCount() +"\n");

		System.out.println("Who is next ??");
		customer.exit(parking, 12.00);

		System.out.println("Total Space available: " + parking.getTotalCount());
		System.out.println("Total Free Space available: " + parking.getAvailableCount());
	}
}
