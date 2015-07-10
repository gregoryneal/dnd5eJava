package classes;

import java.io.Serializable;

public class MulticlassRequirement implements Serializable 
{

	private static final long serialVersionUID = 1630435957428011060L;
	
	private ClassTypes classReq;
	private int levelReq;

	public MulticlassRequirement(ClassTypes classType, int levelRequired) 
	{
		this.classReq = classType;
		this.levelReq = levelRequired;
	}
	
	public ClassTypes getClassType()
	{
		return this.classReq;
	}
	
	public int getLevelRequirement()
	{
		return this.levelReq;
	}

}
