/**
 * @author Jordan 300219995
 */
public class Dwelling extends Property implements AnnualCost
{

	protected int bedrooms;
	protected double bathrooms;
	protected double monthlyRent;
	protected boolean rented;

	public Dwelling( String address, Zone pZone, double area, int bedrooms,
			double bathrooms, double monthlyRent )
	{
		super(address, pZone, area);
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.monthlyRent = monthlyRent;
	}

	public int getBedrooms()
	{
		return bedrooms;
	}

	public void setBedrooms( int bedrooms )
	{
		this.bedrooms = bedrooms;
	}

	public double getBathrooms()
	{
		return bathrooms;
	}

	public void setBathrooms( Double bathrooms )
	{
		this.bathrooms = bathrooms;
	}

	public boolean getRented()
	{
		return rented;
	}

	public void setRented( boolean rented )
	{
		this.rented = rented;
	}

	public double getMonthlyRent()
	{
		return monthlyRent;
	}

	public void setMonthlyRent( double monthlyRent )
	{
		this.monthlyRent = monthlyRent;
	}

	public Double annualCost( Property x )
	{
		return 12 * this.monthlyRent;
	}

	public String toString()
	{
		return super.toString() + this.getBedrooms() + " Bedrooms\n"
				+ this.getBathrooms() + " Bathrooms\n" + "Rent: $"
				+ this.getMonthlyRent() + "/month\n" + "$"
				+ this.annualCost(null) + " Annually" + "\n";
	}

}
