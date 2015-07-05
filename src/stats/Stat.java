package stats;

import abilities.AbilityTypes;
import serialization.Serialize;

public class Stat implements Serialize
{
	
	private AbilityTypes ability;
	private int value;

	public Stat()
	{
		ability = AbilityTypes.NONE;
		value = 0;
	}
	
	public Stat(AbilityTypes abilityType, int abilityLevel)
	{
		ability = abilityType;
		value = abilityLevel;
	}
	
	public AbilityTypes getAbility()
	{
		return ability;
	}
	
	public int getAbilityLevel()
	{
		return value;
	}

}
