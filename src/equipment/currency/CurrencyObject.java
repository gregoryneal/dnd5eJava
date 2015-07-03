package equipment.currency;

import equipment.currency.Currency;

public class CurrencyObject 
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
		return 0;
	}
	
	public int convertToElectrum()
	{
		return 0;
	}
	
	public int convertToGold()
	{
		return 0;
	}
	
	public int convertToPlatinum()
	{
		return 0;
	}
	
	
}
