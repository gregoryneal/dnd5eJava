package character;

import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

import abilities.AbilityTypes;
import classes.ClassTypes;
import race.RaceTypes;
import serialization.Serialize;
import stats.Stat;

public class CharacterInstance implements Serialize
{
	
	private String notSet = "not set";
	
	//self explanatory
	private String name;
	private ClassTypes classType;
	private RaceTypes race;
	private List<Stat> stats = new ArrayList<>();

	public CharacterInstance() 
	{
		name = notSet;
		classType = ClassTypes.NONE;
		race = RaceTypes.NONE;
		initializeStats();
	}
	
	private void initializeStats()
	{
		int i = 0;
		
		for(AbilityTypes stat : AbilityTypes.values())
		{			
			if(!stat.toString().equalsIgnoreCase("none"))
			{				
				this.stats.add(new Stat(AbilityTypes.values()[i],0));
			}
			
			i++;
		}
	}
	
	public void printStats()
	{
		for(Stat stat : stats)
		{
			System.out.println(stat.toString());
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
	
	public void setStat(AbilityTypes ability, int lvl)
	{
		for(int i = 0; i < stats.size(); i++)
		{
			if(stats.get(i).getAbility() == ability)
			{
				stats.get(i).setLevel(lvl);
			}
		}
	}
}
