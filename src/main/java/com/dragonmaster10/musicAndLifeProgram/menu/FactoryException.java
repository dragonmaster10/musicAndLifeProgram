package com.dragonmaster10.musicAndLifeProgram.menu;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class FactoryException extends Exception 
{
	//public FactoryException() {}
	
	//generate an exception	and	send a context specific	message
	//public FactoryException( String.s)
	//{
	//	super(s);
	//}
	
	//generate an exception	with the message from another exception i.e. ClassNotFoundException
	public FactoryException(Exception e)
	{
		super(e.toString());
	}
	
}//EOC
