package classes;

import java.util.List;

import weapons.WeaponTypes;
import classes.ClassTypes;
import abilities.AbilityTypes;
import abilities.SkillTypes;
import armor.ArmorTypes;
import dice.Dice;
import equipment.item.ToolTypes;

public interface ClassInterface
{
	public ClassTypes getClassType();
	public List<ToolTypes> toolProficiencies();
	public List<SkillTypes> skillProficiencies();
	public int baseHPAtFirstLevel();
	public AbilityTypes hpAtFirstLevelAbilityModifier();
	public Dice hitDie();
	public List<AbilityTypes> primaryAbilityType();
	public List<AbilityTypes> savingThrowProficiencies();
	public List<ArmorTypes> armorProficiencies();
	public List<WeaponTypes> weaponProficiencies();
	public String toString();
	public String description();
	public int proficiencyBonus(int level);
	public List<Object> multiclassRequirements();
}
