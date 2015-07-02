package languages;

import languages.LanguageScriptTypes;

public enum LanguageTypes {
	COMMON		(LanguageScriptTypes.COMMON),
	DWARVISH	(LanguageScriptTypes.DWARVISH),
	ELVISH		(LanguageScriptTypes.ELVISH),
	GIANT		(LanguageScriptTypes.DWARVISH),
	GNOMISH		(LanguageScriptTypes.DWARVISH),
	GOBLIN		(LanguageScriptTypes.DWARVISH),
	HALFLING	(LanguageScriptTypes.COMMON),
	ORC			(LanguageScriptTypes.DWARVISH),
	ABYSSAL		(LanguageScriptTypes.INFERNAL),
	CELESTIAL	(LanguageScriptTypes.CELESTIAL),
	DRACONIC	(LanguageScriptTypes.DRACONIC),
	DEEP_SPEECH	(LanguageScriptTypes.NONE),
	INFERNAL	(LanguageScriptTypes.INFERNAL),
	PRIMORDIAL	(LanguageScriptTypes.DWARVISH),
	SYLVAN		(LanguageScriptTypes.ELVISH);
	
	
	final LanguageScriptTypes value;
	
	private LanguageTypes(LanguageScriptTypes lst)
	{
		this.value = lst;
	}
	
	public LanguageScriptTypes getScript()
	{
		return value;
	}
}
