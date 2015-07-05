package abilities;

public enum AbilityTypes
{
	NONE,
	STRENGTH,
	DEXTERITY,
	CONSTITUTION,
	INTELLIGENCE,
	WISDOM,
	CHARISMA;
	
	@Override
	public String toString()
	{
		String str = this.name();
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
}
