/**
 * @author Jordan
 * 300219995
 */
public class Apartment extends Dwelling
{
	private int unitNo;
	private boolean elevator;
	
	public Apartment(String address, Zone pZone, double area, int bedrooms,
			double bathrooms, double monthlyRent, int unitNo, boolean elevator) 
	{
		super(unitNo+"-"+address, pZone, area, bedrooms, bathrooms, monthlyRent);
		this.unitNo = unitNo;
		this.elevator = elevator;
	}
	public int getUnitNo()
	{
		return unitNo;
	}
	
	public boolean getElevator()
	{
		return elevator;
	}
	
	public String toString()
	{
		if (this.getElevator() == true) 
		{
			return super.toString() + "Elevator access";
		}
		else
		{
			return super.toString();
		}	
	}

}
