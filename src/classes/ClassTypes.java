package classes;

import java.util.ArrayList;
import java.util.List;

public enum ClassTypes {
	NONE(MulticlassRequirement.NULL,MulticlassRequirement.NULL,""),
	BARBARIAN(MulticlassRequirement.STR,MulticlassRequirement.NULL,""),
	BARD(MulticlassRequirement.CHA,MulticlassRequirement.NULL,""),
	CLERIC(MulticlassRequirement.WIS,MulticlassRequirement.NULL,""),
	DRUID(MulticlassRequirement.WIS,MulticlassRequirement.NULL,""),
	FIGHTER(MulticlassRequirement.STR,MulticlassRequirement.DEX,"OR"),
	MONK(MulticlassRequirement.DEX,MulticlassRequirement.WIS,"AND"),
	PALADIN(MulticlassRequirement.STR,MulticlassRequirement.CHA,"AND"),
	RANGER(MulticlassRequirement.DEX,MulticlassRequirement.WIS,"AND"),
	ROGUE(MulticlassRequirement.DEX,MulticlassRequirement.NULL,""),
	SORCERER(MulticlassRequirement.CHA,MulticlassRequirement.NULL,""),
	WARLOCK(MulticlassRequirement.CHA,MulticlassRequirement.NULL,""),
	WIZARD(MulticlassRequirement.INT,MulticlassRequirement.NULL,"");
	
	@Override
	public String toString()
	{
		String str = this.name();
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
	
	public final List<Object> multiclassRequirements = new ArrayList<>();
	
	private ClassTypes(MulticlassRequirement multiclassReq1, MulticlassRequirement multiclassReq2, String andOR)
	{
		this.multiclassRequirements.add(multiclassReq1);
		
		//they only need one skill at a certain lvl
		if(!(multiclassReq2.equals(MulticlassRequirement.NULL) && andOR.equals("")))
		{
			this.multiclassRequirements.add(multiclassReq2);
			this.multiclassRequirements.add(andOR);
		}
	}
}
