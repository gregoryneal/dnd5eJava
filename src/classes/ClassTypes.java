package classes;

public enum ClassTypes {
	NONE,
	BARBARIAN,
	BARD,
	CLERIC,
	DRUID,
	FIGHTER,
	MONK,
	PALADIN,
	RANGER,
	ROGUE,
	SORCERER,
	WARLOCK,
	WIZARD;
	
	@Override
	public String toString()
	{
		String str = this.name();
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
}
