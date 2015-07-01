package race;

import java.util.HashMap;
import java.util.List;

import abilities.*;
import weapons.*;
import languages.*;

public interface RacialTraitInterface 
{
	public int speed();
	
	//the key (AbilityTypes) is the ability that is increased by the mapped value (Integer) amount
	public HashMap<AbilityTypes, Integer> abilityScoreIncreases();
	
	//a list of weapons the player is proficient with
	public List<WeaponList> weaponProficiencies();
	
	//a list of skills the player is proficient in
	public List<SkillTypes> skillProficiencies();
	
	//a list of languages the player knows
	public List<LanguageTypes> languagesKnown();
	
	//the first string is the name of the trait, the second is the description of the trait.
	public HashMap<String,String> otherTraits();
}
