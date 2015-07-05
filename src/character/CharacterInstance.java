package character;

import java.lang.Math;

import classes.ClassTypes;
import race.RaceTypes;
import serialization.Serialize;

public class CharacterInstance implements Serialize
{
	
	public String notSet = "not set";
	
	//self explanatory
	private String name;
	private ClassTypes classType;
	private RaceTypes race;

	/*character stats array:
	 * 0 - STR
	 * 1 - DEX
	 * 2 - CON
	 * 3 - INT
	 * 4 - WIS
	 * 5 - CHA
	 */
	private Integer[] Stats;
	
	/*character stat modifiers
	 * 0 - STR MOD
	 * 1 - DEX MOD
	 * 2 - CON MOD
	 * 3 - INT MOD
	 * 4 - WIS MOD
	 * 5 - CHA MOD
	 */
	private Integer[] StatModifiers;
	
	public CharacterInstance() 
	{
		name = notSet;
		classType = ClassTypes.NONE;
		race = RaceTypes.NONE;
	}
	
	public String getName()
	{
		if(!name.isEmpty())
			return name;
		else
			return notSet;
	}
	
	public void setName(String value)
	{
		name = value;
	}
	
	public RaceTypes getRace()
	{
		return race;
	}
	
	public void setRace(RaceTypes human)
	{
		race = human;
	}
	
	public ClassTypes getClassType()
	{
		return classType;
	}
	
	public void setClassType(ClassTypes cT)
	{
		classType = cT;
	}

	public int getStats(int index) {
		return Stats[index];
	}

	public void setStats(int index, int value) {
		Stats[index] = value;
		setStatModifier(index,(int)Math.floor((value-10)/2));
	}

	public int getStatModifier(int index) {
		return StatModifiers[index];
	}

	private void setStatModifier(int index, int value) {
		StatModifiers[index] = value;
	}
}
