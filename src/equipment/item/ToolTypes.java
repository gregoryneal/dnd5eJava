package equipment.item;

public enum ToolTypes 
{
	NONE("Nothing to see here.");
	
	private String description = "";
	
	private ToolTypes(String des)
	{
		this.setDescription(des);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
