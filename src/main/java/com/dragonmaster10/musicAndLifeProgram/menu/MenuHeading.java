package com.dragonmaster10.musicAndLifeProgram.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

public class MenuHeading extends MenuWidget
{
	ArrayList<MenuWidget> menu = new ArrayList<MenuWidget>();
	
	String name;
	String description;
	int headingID;
	
	//CONSTRUCTORS
	public MenuHeading(int id, String name, String description)
	{
		this.headingID = id;
		this.name = name;
		this.description = description;
	}
	
	//METHODS
	public void add(MenuWidget menuWidget)
	{
		this.menu.add(menuWidget);
	}
	
	public void remove(MenuWidget menuWidget)
	{
		this.menu.remove(menuWidget);
	}
	
	public MenuWidget getChild(int i)
	{
		return (MenuWidget) this.menu.get(i);
	}
	
	public int getID()
	{
		return this.headingID;
	}
	
	public String getDisplayName()
	{
		return this.name;
	}
	 
	public String getDescription()
	{
		return this.description;
	}
	
	public Map< Integer, String> getExecutorList()
	{
		Map<Integer, String> menuOfExecutors = new HashMap< Integer, String >();
		
		Iterator<MenuWidget> iterator = this.menu.iterator();
		int headerNumber = this.headingID * 10;
		
		while (iterator.hasNext())
		{
			MenuWidget menuWidget = (MenuWidget)iterator.next();
			menuOfExecutors.put((headerNumber + menuWidget.getID()), menuWidget.getExecutor());
			
		}//EOW
		return menuOfExecutors;		
	}
	
	public void display()
	{
		Iterator<MenuWidget> iterator = this.menu.iterator();
		int headerNumber = this.headingID * 10;
		
		while (iterator.hasNext())
		{
			MenuWidget menuWidget = (MenuWidget)iterator.next();
			System.out.println(headerNumber + menuWidget.getID() +".  "+ menuWidget.getDisplayName());
		}//EOW
	}
	
	public void print()
	{
		System.out.println("\n-------------------");
		System.out.print("HID: " + getID());
		System.out.print(", Display: " + getDisplayName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuWidget> iterator = this.menu.iterator();
		int headerNumber = this.headingID * 10;
		
		while (iterator.hasNext())
		{
			MenuWidget menuWidget = (MenuWidget)iterator.next();
			menuWidget.print();
		}//EOW
	}//EOM
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer(String.format( "HEADING: %x %s, %s \n", getID(), getDisplayName(), getDescription() ));
	
		Iterator<MenuWidget> iterator = this.menu.iterator();
		
		while (iterator.hasNext())
		{
			MenuWidget menuWidget = (MenuWidget)iterator.next();
			sb.append(menuWidget.toString());
		}//EOW
		return sb.toString();
	}//EOM
}//EOC