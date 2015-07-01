package classes;

import java.util.List;

import abilities.AbilityTypes;
import weapons.WeaponTypes;
import armor.ArmorTypes;

public interface ClassInterface {
	public Integer[] hitDie();
	public AbilityTypes primaryAbilityType();
	public List<AbilityTypes> savingThrowProficiencies();
	public List<ArmorTypes> armorProficiencies();
	public List<WeaponTypes> weaponProficiencies();
}
