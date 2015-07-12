package character;

import java.util.List;
import java.util.ArrayList;

import abilities.AbilityTypes;
import classes.ClassTypes;
import race.RaceTypes;
import serialization.Serialize;
import stats.Stat;

public class CharacterInstance implements Serialize
{
	private static final long serialVersionUID = 7257487834512806718L;

	private String notSet = "not set";
	
	//self explanatory
	private String name;
	private List<ClassTypes> classTypes;
	private RaceTypes race;
	private List<Stat> stats = new ArrayList<>();

	public CharacterInstance() 
	{
		name = notSet;
		classTypes.add(ClassTypes.NONE);
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
	
	public void printClasses()
	{
		for(ClassTypes c : classTypes)
		{
			System.out.println(c.toString());
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
	
	public List<ClassTypes> getClassTypes()
	{
		return classTypes;
	}
	
	public void setClassTypes(List<ClassTypes> cT)
	{
		classTypes = cT;
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
	
	public Stat getStat(AbilityTypes ability)
	{
		for(Stat s : stats)
		{
			if(s.getAbility().equals(ability))
			{
				return s;
			}
		}
		return null;
	}
}
