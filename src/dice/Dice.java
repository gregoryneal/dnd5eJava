package dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice 
{
	
	private int numberOfRolls;
	private int numberOfSides;
	
	public static Dice NULL = new Dice(1,0);

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
	
	//rolls this Dice instance
	public List<Integer> roll()
	{
		//toRoll.numberOfRolls entries:
		//0     : sum of all rolls
		//1 - N : each dice roll in order
		List<Integer> dieList = new ArrayList<Integer>();
		dieList.add(0);
		
		int currRoll = 0;
		int sum = 0;
		
		for(int i = 0; i < this.numberOfRolls; i++)
		{
			currRoll = randomInteger(this.numberOfSides);
			dieList.add(currRoll);
			sum += currRoll;
		}
		
		dieList.set(0,sum);
		
		return dieList;
	}
	
	//rolls another Dice instance without instantiating a new one outside of this class
	public List<Integer> roll(Dice toRoll)
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
	
	public int rollAdvantage()
	{
		int roll1 = roll().get(0);
		int roll2 = roll().get(0);
		
		if(roll1 > roll2)
		{
			return roll1;
		}
		
		else
		{
			return roll2;
		}
	}
	
	public int rollDisadvantage()
	{
		int roll1 = roll(new Dice()).get(0);
		int roll2 = roll(new Dice()).get(0);
		
		if(roll1 < roll2)
		{
			return roll1;
		}
		
		else
		{
			return roll2;
		}
	}
	
	public String toString()
	{
		String str = String.valueOf(this.numberOfRolls) + "d" + String.valueOf(this.numberOfSides);
		return str;
	}
	
	private int randomInteger(int max)
	{
		Random rando = new Random();
		
		int randNum = rando.nextInt(max) + 1;
		return randNum;
	}

}
