package character;

import character.CharacterInstance;
import classes.*;

public class PlayerClassMediator
{
	ClassTypes playerClass = null;
	CharacterInstance playerInstance = null;
	
	public PlayerClassMediator(CharacterInstance player, ClassTypes classType)
	{
		playerInstance = player;
		playerClass = classType;
		mediate();
	}
	
	private void mediate()
	{
		playerInstance.setClassType(playerClass);
	}

}
