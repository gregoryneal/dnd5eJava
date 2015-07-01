package character;

import java.lang.Math;

public class CharacterInstance {
	
	public String notSet = "not set";
	
	//self explanatory
	private String name;
	private String classType;
	private String race;

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
	
	public CharacterInstance() {
		name = notSet;
		classType = notSet;
		race = notSet;
		
		for(int i = 0; i < Stats.length; i++)
		{
			Stats[i] = 0;
		}
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
	
	public String getRace()
	{
		if(!race.isEmpty())
			return race;
		else
			return notSet;
	}
	
	public void setRace(String value)
	{
		race = value;
	}
	
	public String getClassType()
	{
		if(!classType.isEmpty())
			return classType;
		else
			return notSet;
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
