package scheduler;

public class Vehicle
{
	private VehicleType _vehicleType = VehicleType.values()[0];
	public final VehicleType getVehicleType()
	{
		return this._vehicleType;
	}

	private String _number;
	public final String getNumber()
	{
		return this._number;
	}

	public String OwnerName;

	public Vehicle(String number, VehicleType type)
	{
		this._number = number;
		this._vehicleType = type;
	}
}

enum Status
{
	None,
	In,
	Out;
}

enum VehicleType
{
	Small,
	Medium,
	Large;
}
