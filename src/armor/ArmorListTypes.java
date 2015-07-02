package armor;

import armor.ArmorTypes;

public enum ArmorListTypes {
	PADDED			(ArmorTypes.LIGHT_ARMOR),
	LEATHER			(ArmorTypes.LIGHT_ARMOR),
	STUDDED_LEATHER	(ArmorTypes.LIGHT_ARMOR),
	HIDE			(ArmorTypes.MEDIUM_ARMOR),
	CHAIN_SHIRT		(ArmorTypes.MEDIUM_ARMOR),
	SCALE_MAIL		(ArmorTypes.MEDIUM_ARMOR),
	BREASTPLATE		(ArmorTypes.MEDIUM_ARMOR),
	HALF_PLATE		(ArmorTypes.MEDIUM_ARMOR),
	RING_MAIL		(ArmorTypes.HEAVY_ARMOR),
	CHAIN_MAIL		(ArmorTypes.HEAVY_ARMOR),
	SPLINT			(ArmorTypes.HEAVY_ARMOR),
	PLATE			(ArmorTypes.HEAVY_ARMOR),
	SHIELD			(ArmorTypes.SHIELD);
	
	final ArmorTypes armorType;
	
	private ArmorListTypes(ArmorTypes value)
	{
		this.armorType = value;
	}
	
	public ArmorTypes getArmorType()
	{
		return armorType;
	}
	
	public int baseAC()
	{
		
		if (this == PADDED || this == LEATHER)
			return 11;
		
		else if(this == STUDDED_LEATHER || this == HIDE)
			return 12;
		
		else if(this == CHAIN_SHIRT)
			return 13;
		
		else if(this == SCALE_MAIL || this == BREASTPLATE || this == RING_MAIL)
			return 14;
		
		else if(this == HALF_PLATE)
			return 15;
		
		else if(this == CHAIN_MAIL)
			return 16;
		
		else if(this == SPLINT)
			return 17;
		
		else if(this == PLATE)
			return 18;

		return 0;
	}
	
	public int strengthRequirement()
	{
		if(this == CHAIN_MAIL)
			return 13;
		else if(this == SPLINT || this == PLATE)
			return 15;
		
		return 0;
	}
	
	public boolean stealthDisadvantage()
	{
		if(this == PADDED || this == SCALE_MAIL || this == HALF_PLATE || this.getArmorType() == ArmorTypes.HEAVY_ARMOR)
			return true;
		
		return false;
	}
	
	public int acModifier()
	{
		if(this == SHIELD)
			return 2;
		
		return 0;
	}
	
	public int weight()
	{
		if(this == SHIELD)
			return 6;
		
		else if(this == PADDED)
			return 8;
		
		else if(this == LEATHER)
			return 10;		
		
		else if(this == HIDE)
			return 12;
		
		else if(this == STUDDED_LEATHER)
			return 13;
		
		else if(this == CHAIN_SHIRT || this == BREASTPLATE)
			return 20;
		
		else if(this == HALF_PLATE || this == RING_MAIL)
			return 40;
		
		else if(this == SCALE_MAIL)
			return 45;
		
		else if(this == CHAIN_MAIL)
			return 55;
		
		else if(this == SPLINT)
			return 60;
		
		else if(this == PLATE)
			return 65;
		
		return 0;
	}
}
