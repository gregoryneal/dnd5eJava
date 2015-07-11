package classes;

import java.io.Serializable;

import abilities.AbilityTypes;

public class MulticlassRequirement implements Serializable 
{

	private static final long serialVersionUID = 1630435957428011060L;
	
	private AbilityTypes classReq;
	private int levelReq;
	
	public static MulticlassRequirement NULL = new MulticlassRequirement(AbilityTypes.NONE,0);
	public static MulticlassRequirement STR = new MulticlassRequirement(AbilityTypes.STRENGTH,13);
	public static MulticlassRequirement DEX = new MulticlassRequirement(AbilityTypes.DEXTERITY,13);
	public static MulticlassRequirement CON = new MulticlassRequirement(AbilityTypes.CONSTITUTION,13);
	public static MulticlassRequirement INT = new MulticlassRequirement(AbilityTypes.INTELLIGENCE,13);
	public static MulticlassRequirement WIS = new MulticlassRequirement(AbilityTypes.WISDOM,13);
	public static MulticlassRequirement CHA = new MulticlassRequirement(AbilityTypes.CHARISMA,13);

	public MulticlassRequirement(AbilityTypes classToCheck, int requiredLevel) 
	{
		this.classReq = classToCheck;
		this.levelReq = requiredLevel;
	}
	
	public AbilityTypes getClassType()
	{
		return this.classReq;
	}
	
	public int getLevelRequirement()
	{
		return this.levelReq;
	}

}
