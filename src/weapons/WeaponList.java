package weapons;

import weapons.WeaponTypes;

public enum WeaponList {
	CLUB(WeaponTypes.SIMPLE_MELEE),
	DAGGER(WeaponTypes.SIMPLE_MELEE),
	GREATCLUB(WeaponTypes.SIMPLE_MELEE),
	HANDAXE(WeaponTypes.SIMPLE_MELEE),
	JAVELIN(WeaponTypes.SIMPLE_MELEE),
	LIGHT_HAMMER(WeaponTypes.SIMPLE_MELEE),
	MACE(WeaponTypes.SIMPLE_MELEE),
	QUARTERSTAFF(WeaponTypes.SIMPLE_MELEE),
	SICKLE(WeaponTypes.SIMPLE_MELEE),
	SPEAR(WeaponTypes.SIMPLE_MELEE),
	UNARMED_STRIKE(WeaponTypes.SIMPLE_MELEE),
	CROSSBOW_LIGHT(WeaponTypes.SIMPLE_RANGED),
	DART(WeaponTypes.SIMPLE_RANGED),
	SHORTBOW(WeaponTypes.SIMPLE_RANGED),
	SLING(WeaponTypes.SIMPLE_RANGED),
	BATTLEAXE(WeaponTypes.MARTIAL_MELEE),
	FLAIL(WeaponTypes.MARTIAL_MELEE),
	GLAIVE(WeaponTypes.MARTIAL_MELEE),
	GREATAXE(WeaponTypes.MARTIAL_MELEE),
	GREATSWORD(WeaponTypes.MARTIAL_MELEE),
	HALBERD(WeaponTypes.MARTIAL_MELEE),
	LANCE(WeaponTypes.MARTIAL_MELEE),
	LONGSWORD(WeaponTypes.MARTIAL_MELEE),
	MAUL(WeaponTypes.MARTIAL_MELEE),
	MORNINGSTAR(WeaponTypes.MARTIAL_MELEE),
	PIKE(WeaponTypes.MARTIAL_MELEE),
	RAPIER(WeaponTypes.MARTIAL_MELEE),
	SCIMITAR(WeaponTypes.MARTIAL_MELEE),
	SHORTSWORD(WeaponTypes.MARTIAL_MELEE),
	TRIDENT(WeaponTypes.MARTIAL_MELEE),
	WAR_PICK(WeaponTypes.MARTIAL_MELEE),
	WARHAMMER(WeaponTypes.MARTIAL_MELEE),
	WHIP(WeaponTypes.MARTIAL_MELEE),
	BLOWGUN(WeaponTypes.MARTIAL_RANGED),
	CROSSBOW_HAND(WeaponTypes.MARTIAL_RANGED),
	CROSSBOW_HEAVY(WeaponTypes.MARTIAL_RANGED),
	LONGBOW(WeaponTypes.MARTIAL_RANGED),
	NET(WeaponTypes.MARTIAL_RANGED);
	
	private final WeaponTypes value;
	
	private WeaponList(WeaponTypes value)
	{
		this.value = value;
	}
	
	public WeaponTypes getWeaponType()
	{
		return value;
	}
	
	//finesse weapons allow you to use your DEX mod instead of your STR mod for hit and damage rolls
	public boolean isFinesse(WeaponList weapon)
	{
		if(weapon == WeaponList.DAGGER | weapon == WeaponList.DART | weapon == WeaponList.RAPIER | weapon == WeaponList.SCIMITAR | weapon == WeaponList.SHORTSWORD | weapon == WeaponList.WHIP)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
