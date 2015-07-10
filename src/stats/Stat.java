package stats;

import abilities.AbilityTypes;
import serialization.Serialize;

public class Stat implements Serialize
{
	private static final long serialVersionUID = 4105120964032349631L;
	
	private AbilityTypes ability;
	private int abilityLvl;
	private int abilityMod;

	public Stat()
	{
		ability = AbilityTypes.NONE;
		abilityLvl = 0;
		updateModifier();
	}
	
	public Stat(AbilityTypes abilityType, int abilityLevel)
	{
		ability = abilityType;
		abilityLvl = abilityLevel;
		updateModifier();
	}
	
	public AbilityTypes getAbility()
	{
		return ability;
	}
	
	public int getAbilityLevel()
	{
		return abilityLvl;
	}
	
	public int getModifier()
	{
		return abilityMod;
	}
	
	public void levelUp()
	{
		abilityLvl++;
		updateModifier();
	}
	
	public void addLevels(int amt)
	{
		abilityLvl += amt;
		updateModifier();
	}
	
	public void setLevel(int lvl)
	{
		abilityLvl = lvl;
		updateModifier();
	}
	
	private void updateModifier()
	{
		abilityMod = (int)Math.floor((abilityLvl-10)/2);
	}

	@Override
	public String toString()
	{
		return (ability.toString() + ": " + abilityLvl + ", " + abilityMod);
	}

}
