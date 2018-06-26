package scheduler;

public class Customer
{
	private String _name;
	private Ticket _ticket;
	private Vehicle _vehicle;

	public Customer(String name, Vehicle vehicle)
	{
		this._name = name;
		this._vehicle = vehicle;
	}

	public final void entry(ParkingArea parking)
	{
		Ticket ticket = parking.getTicket(this._vehicle.getVehicleType());
		if (ticket == null)
		{
			System.out.println("No Parking Available.");
			return;
		}

		this._ticket = ticket;
		System.out.printf("%1$s enterd the parking area" + "\r\n", this._name);
	}

	public final void exit(ParkingArea parking, double price)
	{
		parking.free(this._ticket, price);
		System.out.printf("%1$s exited from the parking area" + "\r\n", this._name);
	}
}
