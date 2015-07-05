package classes;

import java.io.Serializable;

public class MulticlassRequirement implements Serializable {
	
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
