package ui;

import java.util.List;
import dice.*;

public class Main
{

	public static void main(String[] args)
	{
		new Main().MainMethod();
	}
	
	public void MainMethod()
	{
		Dice d = new Dice(10,20);
		List<Integer> rolls = d.roll();
		
		for(int i = 0; i < d.numberOfRolls; i++)
		{
			System.out.println("Roll " + (i+1) + ": " + rolls.get(i+1));
		}
	}
}
