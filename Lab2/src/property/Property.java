/**
 * @author Jordan
 * 300219995
 */
public class Property 
{
	private int idCounter = 10000001;
	protected String propertyId;
	protected String address;
	protected Zone pZone;
	protected double area;
	
	public Property(String address, Zone pZone, double area)
	{
		this.address = address;
		this.pZone = pZone;
		this.area = area;
		
	}
	
	public String getAddress()
	{
		return address;
	}
	public Zone getZone()
	{
		return pZone;
	}
	public Double getArea()
	{
		return area;
	}
	public void setZone(Zone pZone)
	{
		this.pZone = pZone;
	}
	public String getPropertyId()
	{
		propertyId = pZone.getCategory() + idCounter;
		return propertyId;
	}
	
	public String toString()
	{
		
		return "Property " + this.getPropertyId() + "-"+ this.getClass().getSimpleName().charAt(0) + "\n" + this.getAddress() + "(" + this.getArea() + "sq.ft., Zone: " 
				 + this.getZone() + ")\n" ;
	}
}
