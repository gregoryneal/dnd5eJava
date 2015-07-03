package equipment.currency;

public enum Currency {
	COPPER(1),
	SILVER(10),
	ELECTRUM(50),
	GOLD(100),
	PLATINUM(1000);
	
	private final int rank;
	
	private Currency(int value)
	{
		this.rank = value;
	}
	
	//is curr1 less expensive than curr2?
	public boolean isLessThan(Currency otherCurr)
	{
		return (this.rank < otherCurr.rank);
	}
	
	//how many times does this currency go into otherCurr?
	public double conversion(Currency otherCurr)
	{
		return (otherCurr.rank/(double)this.rank);
	}
	
	//converts this amount to it's amount in copper
	public int convertToCopper(int amount)
	{
		return (this.rank*amount);
	}
	
	//converts this amount to it's amount in silver
	public int convertToSilver(int amount)
	{
		if(this == SILVER)
		{
			return amount;
		}
		
		else if(this.isLessThan(SILVER))
		{
			int copperAmt = this.convertToCopper(amount);
			return (copperAmt/SILVER.rank);
		}
		
		else
		{
			return 0;
		}
	}
	
	//converts this amount to it's amount in electrum
	public int convertToElectrum(int amount)
	{
		if(this == ELECTRUM)
		{
			return amount;
		}
		
		else if(this.isLessThan(ELECTRUM))
		{
			int copperAmt = this.convertToCopper(amount);
			return (copperAmt/ELECTRUM.rank);
		}
		
		else
		{
			System.out.println(this.toString() + " is greater than electrum");
			return 0;
		}
	}
	
	//converts this amount to it's amount in gold
	public int convertToGold(int amount)
	{
		if(this == GOLD)
		{
			return amount;
		}
		
		else if(this.isLessThan(GOLD))
		{
			int copperAmt = this.convertToCopper(amount);
			return (copperAmt/GOLD.rank);
		}
		
		else
		{
			return 0;
		}
	}
	
	//converts this amount to it's amount in platinum
	public int convertToPlatinum(int amount)
	{
		if(this == PLATINUM)
		{
			return amount;
		}
		
		else if(this.isLessThan(PLATINUM))
		{
			int copperAmt = this.convertToCopper(amount);
			return (copperAmt/PLATINUM.rank);
		}
		
		else
		{
			return 0;
		}
	}
}
