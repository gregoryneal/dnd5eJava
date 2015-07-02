package dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice 
{
	
	private int numberOfRolls;
	private int numberOfSides;

	//initializes a 1d20 die
	public Dice() 
	{
		numberOfRolls = 1;
		numberOfSides = 20;
	}
	
	public Dice(int numRolls, int numSides)
	{
		numberOfRolls = numRolls;
		numberOfSides = numSides;
	}
	
	
	public List<Integer> rollDice(Dice toRoll)
	{
		//toRoll.numberOfRolls entries:
		//0     : sum of all rolls
		//1 - N : each dice roll in order
		List<Integer> dieList = new ArrayList<Integer>();
		dieList.add(0);
		
		int currRoll = 0;
		int sum = 0;
		
		for(int i = 0; i < toRoll.numberOfRolls; i++)
		{
			currRoll = randomInteger(toRoll.numberOfSides);
			dieList.add(currRoll);
			sum += currRoll;
		}
		
		dieList.set(0,sum);
		
		return dieList;
	}
	
	private int randomInteger(int max)
	{
		Random rando = new Random();
		
		int randNum = rando.nextInt(max) + 1;
		return randNum;
	}

}
