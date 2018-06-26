package scheduler;

public class ParkingPlace
{
	public ParkingPlace(String number, VehicleType type)
	{
		this._number = number;
		this._vehicleType = type;
	}

	private String _number;
	public final String getNumber()
	{
		return this._number;
	}

	private VehicleType _vehicleType;
	public final VehicleType getVehicleType()
	{
		return this._vehicleType;
	}

	private boolean _avail = true;
	public final boolean getAvailable()
	{
		return this._avail;
	}
	public final void setAvailable(boolean value)
	{
		this._avail = value;
	}
}

