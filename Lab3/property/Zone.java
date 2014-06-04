/**
 * @author Jordan 300219995
 */
public class Zone
{
	private String category;
	private int code;
	private String description;

	public Zone()
	{
	}

	public Zone( String cat, int c, String desc )
	{
		category = cat;
		code = c;
		description = desc;
	}

	public String getDescription()
	{
		return description;
	}

	public String getCategory()
	{
		return category;
	}

	public int getCode()
	{
		return code;
	}

	public String toString()
	{
		return category + code;
	}
}