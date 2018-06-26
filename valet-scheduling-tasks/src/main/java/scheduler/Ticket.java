package scheduler;

import java.time.LocalDateTime;
import java.util.Random;

public class Ticket
{
	private String _receiptNumber;
	public final String getReceiptNo()
	{
		return _receiptNumber;
	}
	public double Price;

	private LocalDateTime _inTime = LocalDateTime.MIN;
	public final LocalDateTime getInTime()
	{
		return _inTime;
	}

	public LocalDateTime OutTime = LocalDateTime.MIN;
	public ParkingPlace ParkingSpot;

	public Ticket()
	{
		this._receiptNumber = String.valueOf((new Random()).nextInt(10000));
		this._inTime = LocalDateTime.now();
	}
}

