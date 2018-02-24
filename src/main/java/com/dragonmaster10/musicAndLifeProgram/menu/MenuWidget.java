package com.dragonmaster10.musicAndLifeProgram.menu;

import java.util.Map;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 23/02/2018
 * 
 * Ref: Lecture notes
 *
 ************************************************************/

public abstract class MenuWidget {
	
	public void add(MenuWidget menuComponent) 
	{
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuWidget menuComponent)
	{
		throw new UnsupportedOperationException();
	}
	
	public MenuWidget getChild(int i)
	{
		throw new UnsupportedOperationException();
	}
	
	public int getID()
	{
		throw new UnsupportedOperationException();
	}
	
	public String getDisplayName()
	{
		throw new UnsupportedOperationException();
	}
	
	public String getDescription()
	{
		throw new UnsupportedOperationException();
	}
	
	//is it a menu heading or a menuy item that can call a class
	public boolean isExecutable()
	{
		throw new UnsupportedOperationException();
	}
	
	public String getExecutor()
	{
		throw new UnsupportedOperationException();
	}
	
	public Map< Integer, String> getExecutorList()
	{
		throw new UnsupportedOperationException();
	}
	
	public void display()
	{
		throw new UnsupportedOperationException();
	}
	
	public void print()
	{
		throw new UnsupportedOperationException();
	}
	
}
