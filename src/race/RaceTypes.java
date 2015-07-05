package race;

public enum RaceTypes {
	NONE,
	HILL_DWARF,
	MOUNTAIN_DWARF,
	HIGH_ELF,
	WOOD_ELF,
	DARK_ELF,
	LIGHTFOOT_HALFLING,
	STOUT_HALFLING,
	HUMAN,
	DRAGONBORN,
	FOREST_GNOME,
	ROCK_GNOME,
	HALF_ELF,
	HALF_ORC,
	TIEFLING;
	
	@Override
	public String toString()
	{
		String str = this.name();
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
}
