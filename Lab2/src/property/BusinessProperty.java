/**
 * @author Jordan
 * 300219995
 */
public class BusinessProperty extends Property
{
	private int unitNo;
	private String businessType;
	private double leaseRate = 0.0;
	
	public BusinessProperty(String address, Zone pZone, double area, int unitNo, String businessType) 
	{
		super(address, pZone, area);
		this.unitNo = unitNo;
		this.businessType = businessType;
	}

	public int getUnitNo()
	{
		return unitNo;
	}
	
	public String getBusinessType()
	{
		return businessType;
	}
	
	public void setBusinessType(String businessType)
	{
		this.businessType = businessType;
	}
	
	public Double getLeaseRate()
	{
		return leaseRate;
	}
	
	public void setLeaseRate(Double leaseRate)
	{
		this.leaseRate = leaseRate;
	}
	
	public String toString()
	{
		return  super.toString() + "Type: "+this.getBusinessType();
	}
}
