package scheduler;

import java.util.*;
import java.time.*;

public class ParkingArea
{
	private ArrayList<ParkingPlace> _parkingList = new ArrayList<ParkingPlace>();
	private ArrayList<Ticket> _soldTickets = new ArrayList<Ticket>();
	private int _availCount;

	public ParkingArea(ArrayList<ParkingPlace> parkingPlace)
	{
		this._parkingList = parkingPlace;
		this._availCount = parkingPlace.size();
	}

	public final Ticket getTicket(VehicleType type)
	{
		if (_availCount == 0)
		{
			return null;
		}

		Ticket ticket = new Ticket();
		ticket.ParkingSpot = this.book(type);
		ticket.ParkingSpot.setAvailable(false);

		return ticket;
	}

	private ParkingPlace book(VehicleType type)
	{
		for (ParkingPlace item : _parkingList)
		{
			if (item.getAvailable() && item.getVehicleType() == type)
			{
				_availCount--;
				return item;
			}
		}

		return null;
	}

	public final int getTotalCount()
	{
		return _parkingList.size();
	}

	public final int getAvailableCount()
	{
		return _availCount;
	}

	public final void free(Ticket ticket, double price)
	{
		ticket.OutTime = LocalDateTime.now();
		ticket.Price = price;
		ticket.ParkingSpot.setAvailable(true);

		_soldTickets.add(ticket);
		_availCount++;
	}
}

