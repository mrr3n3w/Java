/**
 * @author Jordan
 * 300219995
 */
public class House extends Dwelling {


	private double yardArea;
	private String houseType;
	
	public House(String address, Zone pZone, double area, int bedrooms, double bathrooms, double monthlyRent, double yardArea, String houseType) 
	{
		super(address, pZone, area, bedrooms, bathrooms, monthlyRent);
		this.yardArea = yardArea;
		this.houseType = houseType;
	
	}
	
	public double getYardArea()
	{
		return yardArea;
	}
	
	public String getHouseType()
	{
		return houseType;
	}
	
	public String toString()
	{
		return super.toString() + this.getYardArea() + "sq.ft. yard"; //\nType: " + this.getHouseType();
	}

}

