package equipment.currency;

import equipment.currency.Currency;
import serialization.Serialize;

public class CurrencyObject implements Serialize
{
	Currency currType;
	int currAmount;
	
	public CurrencyObject(Currency curr, int amount)
	{
		currType = curr;
		currAmount = amount;
	}
	
	public void add(int amount)
	{
		this.currAmount += amount; 
	}
	
	public void remove(int amount)
	{
		this.currAmount -= amount;
	}
	
	public int convertToCopper()
	{
		return this.currType.convertToCopper(this.currAmount);
	}
	
	public int convertToSilver()
	{
		return this.currType.convertToSilver(this.currAmount);
	}
	
	public int convertToElectrum()
	{
		return this.currType.convertToElectrum(this.currAmount);
	}
	
	public int convertToGold()
	{
		return this.currType.convertToGold(this.currAmount);
	}
	
	public int convertToPlatinum()
	{
		return this.currType.convertToPlatinum(this.currAmount);
	}
	
	
}
