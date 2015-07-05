package classes;

import java.util.ArrayList;
import java.util.List;

import weapons.WeaponTypes;
import abilities.AbilityTypes;
import abilities.SkillTypes;
import armor.ArmorTypes;
import dice.Dice;
import equipment.ToolTypes;
import serialization.Serialize;

public class Barbarian implements ClassInterface, Serialize
{
	
	List<SkillTypes> st = new ArrayList<>();

	public Barbarian() 
	{
		
	}

	@Override
	public List<ToolTypes> toolProficiencies() {
		List<ToolTypes> tt = new ArrayList<>();
		tt.add(ToolTypes.NONE);
		return tt;
	}

	@Override
	public List<SkillTypes> skillProficiencies() {
		if(!st.isEmpty())
			return st;
		else
			//error, empty list
		return null;
	}
	
	public void setSkillProficiencies(SkillTypes skill)
	{
		if(st.size() < 2)
		{
			st.add(skill);
		}
		else
		{
			//print out error, can't choose anymore skills.
		}
	}

	@Override
	public int baseHPAtFirstLevel()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public AbilityTypes hpAtFirstLevelAbilityModifier() 
	{
		// TODO Auto-generated method stub
		return AbilityTypes.CONSTITUTION;
	}

	@Override
	public Dice hitDie() {
		// TODO Auto-generated method stub
		return new Dice(1,12);
	}

	@Override
	public List<AbilityTypes> primaryAbilityType() 
	{
		List<AbilityTypes> pat = new ArrayList<>();
		pat.add(AbilityTypes.STRENGTH);
		return pat;
	}

	@Override
	public List<AbilityTypes> savingThrowProficiencies() 
	{
		List<AbilityTypes> stp = new ArrayList<>();
		stp.add(AbilityTypes.STRENGTH);
		stp.add(AbilityTypes.CONSTITUTION);
		return stp;
	}

	@Override
	public List<ArmorTypes> armorProficiencies() 
	{	
		List<ArmorTypes> ap = new ArrayList<>();
		ap.add(ArmorTypes.LIGHT_ARMOR);
		ap.add(ArmorTypes.MEDIUM_ARMOR);
		ap.add(ArmorTypes.SHIELD);
		return ap;
	}

	@Override
	public List<WeaponTypes> weaponProficiencies()
	{
		List<WeaponTypes> wp = new ArrayList<>();
		wp.add(WeaponTypes.SIMPLE_MELEE);
		wp.add(WeaponTypes.MARTIAL_MELEE);
		wp.add(WeaponTypes.SIMPLE_RANGED);
		wp.add(WeaponTypes.MARTIAL_RANGED);
		return null;
	}

	@Override
	public String description() 
	{
		return "A fierce warrior of primitive background who can enter a battle rage";
	}
	
	public List<Object> multiclassRequirements()
	{
		//mr.get(0) is the number of classes that are required, call it n.
		//mr.get(1) is the first class, mr.get(2) is the first classes int requirement.
		//etc up to mr.get(n) and mr.get(n+1)
		List<Object> mr = new ArrayList<Object>();
		mr.add(1);
		mr.add(AbilityTypes.STRENGTH);
		mr.add(new Integer(13));
		
		return null;
	}

	@Override
	public int proficiencyBonus(int level)
	{
		if(level <= 4)
			return 2;
		else if(level <= 8)
			return 3;
		else if(level <= 12)
			return 4;
		else if(level <= 16)
			return 5;
		else
			return 6;
	}

}
