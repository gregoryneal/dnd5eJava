package character;

import java.util.List;

import abilities.AbilityTypes;
import character.CharacterInstance;
import classes.*;

public class PlayerClassMediator
{
	List<ClassTypes> playerClasses = null;
	CharacterInstance playerInstance = null;
	int allowableMulticlassingClasses = 2;
	
	public PlayerClassMediator(CharacterInstance player, List<ClassTypes> classType)
	{
		playerInstance = player;
		playerClasses = classType;
	}
	
	//used only for single classing
	private void updateClasses()
	{
		playerInstance.setClassTypes(playerClasses);
	}
	
	//used for multiclassing
	public void addClass(ClassTypes classToAdd)
	{		
		List<Object> mR = classToAdd.multiclassRequirements;
		int mRLen = mR.size();
		
		MulticlassRequirement mR1 = (MulticlassRequirement)mR.get(0);
		MulticlassRequirement mR2 = null;
		
		AbilityTypes stat1 = mR1.getClassType();
		AbilityTypes stat2 = AbilityTypes.NONE;
		
		String andOR = new String();
		
		int statLvl1 = mR1.getLevelRequirement();
		int statLvl2 = 0;
		
		if(mRLen == 1)
		{
			if(statLvl1 <= playerInstance.getStat(stat1).getAbilityLevel())
			{
				if(playerClasses.size() <= allowableMulticlassingClasses)
				{
					playerClasses.add(classToAdd);
				}
				else
				{
					//error, can't add anymore classes
				}
			}
		}
		else if(mRLen > 1 && mRLen <= 3)
		{
			mR2 = (MulticlassRequirement)mR.get(1);
			statLvl2 = mR2.getLevelRequirement();
			stat2 = mR2.getClassType();
			andOR = (String)mR.get(2);
			
			if(andOR.equals("OR"))
			{
				if((statLvl1 <= playerInstance.getStat(stat1).getAbilityLevel()) || (statLvl2 <= playerInstance.getStat(stat2).getAbilityLevel()))
				{
					if(playerClasses.size() <= allowableMulticlassingClasses)
					{
						playerClasses.add(classToAdd);
						updateClasses();
					}
					else
					{
						//error, can't add anymore classes
					}
				}
			}
			else if(andOR.equals("AND"))
			{
				if((statLvl1 <= playerInstance.getStat(stat1).getAbilityLevel()) && (statLvl2 <= playerInstance.getStat(stat2).getAbilityLevel()))
				{
					if(playerClasses.size() <= allowableMulticlassingClasses)
					{
						playerClasses.add(classToAdd);
						updateClasses();
					}
					else
					{
						//error, can't add anymore classes
					}
				}
			}
		}
	}
}
