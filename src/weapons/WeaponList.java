package weapons;

import weapons.WeaponTypes;
import damage.DamageTypes;
import dice.Dice;

public enum WeaponList {
	//WeaponList	(WeaponTypes,       		isLight,	isFinesse,	isThrown, 	isTwoHanded,	isVersatile, 	usesAmmo,	isLoading, 	isHeavy, 	isReach, 	isSpecial,	versatileDie,	damageDie,		damageType,					weight)
	CLUB			(WeaponTypes.SIMPLE_MELEE, 	true,    	false,    	false,   	false,       	false,       	false,      false,    	false,   	false,   	false,		Dice.NULL,		new Dice(1,4),	DamageTypes.BLUDGEONING,	2),
	DAGGER			(WeaponTypes.SIMPLE_MELEE, 	true, 	 	true,  		true,  		false,			false,			false,		false, 		false, 		false,		false,		Dice.NULL,		new Dice(1,4), 	DamageTypes.PIERCING,		1),
	GREATCLUB		(WeaponTypes.SIMPLE_MELEE,	false,		false,		false,		true,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,8),	DamageTypes.BLUDGEONING,	10),
	HANDAXE			(WeaponTypes.SIMPLE_MELEE,	true,		false,		true,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,6),	DamageTypes.SLASHING,		2),
	JAVELIN			(WeaponTypes.SIMPLE_MELEE,	false,		false,		true,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,6), 	DamageTypes.PIERCING,		2),
	LIGHT_HAMMER	(WeaponTypes.SIMPLE_MELEE,	true,		false,		true,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,4), 	DamageTypes.BLUDGEONING,	2),
	MACE			(WeaponTypes.SIMPLE_MELEE,	false,		false,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,6),	DamageTypes.BLUDGEONING,	4),
	QUARTERSTAFF	(WeaponTypes.SIMPLE_MELEE,	false,		false,		false,		false,			true,			false,		false,		false,		false,		false,		new Dice(1,8),	new Dice(1,6), 	DamageTypes.BLUDGEONING,	4),
	SICKLE			(WeaponTypes.SIMPLE_MELEE,	true,		false,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,4),	DamageTypes.SLASHING,		2),
	SPEAR			(WeaponTypes.SIMPLE_MELEE,	false,		false,		true,		false,			true,			false,		false,		false,		false,		false,		new Dice(1,8),	new Dice(1,6),	DamageTypes.BLUDGEONING,	3),
	UNARMED_STRIKE	(WeaponTypes.SIMPLE_MELEE,	false,		false,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,1),	DamageTypes.BLUDGEONING,	0),
	CROSSBOW_LIGHT	(WeaponTypes.SIMPLE_RANGED,	false,		false,		false,		true,			false,			true,		true,		false,		false,		false,		Dice.NULL,		new Dice(1,8),	DamageTypes.PIERCING,		5),
	DART			(WeaponTypes.SIMPLE_RANGED,	false,		true,		true,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,4),	DamageTypes.PIERCING,		.25),
	SHORTBOW		(WeaponTypes.SIMPLE_RANGED,	false,		false,		false,		true,			false,			true,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,6),	DamageTypes.PIERCING,		2),
	SLING			(WeaponTypes.SIMPLE_RANGED,	false,		false,		false,		false,			false,			true,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,4),	DamageTypes.BLUDGEONING,	0),
	BATTLEAXE		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			true,			false,		false,		false,		false,		false,		new Dice(1,10),	new Dice(1,8), 	DamageTypes.SLASHING,		4),
	FLAIL			(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,8),	DamageTypes.BLUDGEONING,	2),
	GLAIVE			(WeaponTypes.MARTIAL_MELEE, false,		false,		false,		true,			false,			false,		false,		true,		true,		false,		Dice.NULL,		new Dice(1,10),	DamageTypes.SLASHING,	 	6),
	GREATAXE		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		true,			false,			false,		false,		true,		false,		false,		Dice.NULL,		new Dice(1,12),	DamageTypes.SLASHING,		7),
	GREATSWORD		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		true,			false,			false,		false,		true,		false,		false,		Dice.NULL,		new Dice(2,6),	DamageTypes.SLASHING,		6),
	HALBERD			(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		true,			false,			false,		false,		true,		true,		false,		Dice.NULL,		new Dice(1,10),	DamageTypes.SLASHING,		6),
	LANCE			(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			false,			false,		false,		false,		true,		true,		Dice.NULL,		new Dice(1,12),	DamageTypes.PIERCING,		6),
	LONGSWORD		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			true,			false,		false,		false,		false,		false,		new Dice(1,10), new Dice(1,8), 	DamageTypes.SLASHING,		3),
	MAUL			(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		true,			false,			false,		false,		true,		false,		false,		Dice.NULL,		new Dice(2,6),	DamageTypes.BLUDGEONING,	10),
	MORNINGSTAR		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,8), 	DamageTypes.PIERCING,		4),
	PIKE			(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		true,			false,			false,		false,		true,		true,		false,		Dice.NULL,		new Dice(1,10),	DamageTypes.PIERCING,		18),
	RAPIER			(WeaponTypes.MARTIAL_MELEE,	false,		true,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,8),	DamageTypes.PIERCING,		2),
	SCIMITAR		(WeaponTypes.MARTIAL_MELEE,	true,		true,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,6), 	DamageTypes.SLASHING,		3),
	SHORTSWORD		(WeaponTypes.MARTIAL_MELEE,	true,		true,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,6),	DamageTypes.PIERCING,		2),
	TRIDENT			(WeaponTypes.MARTIAL_MELEE,	false,		false,		true,		false,			true,			false,		false,		false,		false,		false,		new Dice(1,8), 	new Dice(1,6), 	DamageTypes.PIERCING,		4),
	WAR_PICK		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			false,			false,		false,		false,		false,		false,		Dice.NULL,		new Dice(1,8),	DamageTypes.PIERCING,		2),
	WARHAMMER		(WeaponTypes.MARTIAL_MELEE,	false,		false,		false,		false,			true,			false,		false,		false,		false,		false,		new Dice(1,10),	new Dice(1,8),	DamageTypes.BLUDGEONING,	2),
	WHIP			(WeaponTypes.MARTIAL_MELEE, false,		true,		false,		false,			false,			false,		false,		false,		true,		false,		Dice.NULL,		new Dice(1,4),	DamageTypes.SLASHING,		3),
	BLOWGUN			(WeaponTypes.MARTIAL_RANGED,false,		false,		false,		false,			false,			true,		true,		false,		false,		false,		Dice.NULL,		new Dice(1,1),	DamageTypes.PIERCING,		1),
	CROSSBOW_HAND	(WeaponTypes.MARTIAL_RANGED,true,		false,		false,		false,			false,			true,		true,		false,		false,		false,		Dice.NULL,		new Dice(1,6),	DamageTypes.PIERCING,		3),
	CROSSBOW_HEAVY	(WeaponTypes.MARTIAL_RANGED,false,		false,		false,		true,			false,			true,		true,		true,		false,		false,		Dice.NULL,		new Dice(1,10),	DamageTypes.PIERCING,		18),
	LONGBOW			(WeaponTypes.MARTIAL_RANGED,false,		false,		false,		true,			false,			true,		false,		true,		false,		false,		Dice.NULL,		new Dice(1,8),	DamageTypes.PIERCING,		2),
	NET				(WeaponTypes.MARTIAL_RANGED,false,		false,		true,		false,			false,			false,		false,		false,		false,		true,		Dice.NULL,		Dice.NULL,		DamageTypes.NONE,			3);
	
	private final WeaponTypes wt;
	private final DamageTypes dt;
	private final boolean isLight;
	private final boolean isFinesse;
	private final boolean isThrown;
	private final boolean isTwoHanded;
	private final boolean isVersatile;
	private final boolean usesAmmo;
	private final boolean isLoading;
	private final boolean isHeavy;
	private final boolean isReach;
	private final boolean isSpecial;
	private final Dice damageDie;
	private final Dice versatileDie;
	private final double weight;
	
	private WeaponList(WeaponTypes value, boolean light, boolean finesse, boolean thrown, boolean twoHanded, boolean versatile, boolean ammo, boolean loading, boolean heavy, boolean reach, boolean special, Dice vDie, Dice dDie, DamageTypes damType, double w)
	{
		this.wt = value;
		this.dt = damType;
		this.isLight = light;
		this.isFinesse = finesse;
		this.isThrown = thrown;
		this.isTwoHanded = twoHanded;
		this.isVersatile = versatile;
		this.versatileDie = vDie;
		this.damageDie = dDie;
		this.usesAmmo = ammo;
		this.isLoading = loading;
		this.isHeavy = heavy;
		this.isReach = reach;
		this.isSpecial = special;
		this.weight = w;
	}
	
	public Dice damageDie()
	{
		return this.damageDie;
	}
	
	public Dice versatileDie()
	{
		return this.versatileDie;
	}
	
	public boolean usesAmmo()
	{
		return this.usesAmmo;
	}
	
	public boolean isLoading()
	{
		return this.isLoading;
	}
	
	public boolean isHeavy()
	{
		return this.isHeavy;
	}
	
	public boolean isReach()
	{
		return this.isReach;
	}
	
	public boolean isSpecial()
	{
		return this.isSpecial;
	}
	
	public double weight()
	{
		return this.weight;
	}
	
	public WeaponTypes getWeaponType()
	{
		return wt;
	}
	
	//finesse weapons allow you to use your DEX mod instead of your STR mod for hit and damage rolls
	public boolean isFinesse()
	{
		return this.isFinesse;
	}
	
	public String properties()
	{
		return "";
	}
	
	public boolean isLight()
	{
		
		return this.isLight;
	}
	
	public boolean isThrown()
	{
		
		return this.isThrown;
	}
	
	public boolean isTwoHanded()
	{		
		return this.isTwoHanded;
	}
	
	public boolean isVersatile()
	{
		return this.isVersatile;
	}
	
	public DamageTypes damageType()
	{
		return this.dt;
	}
	
}
