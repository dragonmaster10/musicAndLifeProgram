package com.dragonmaster10.musicAndLifeProgram.user;

import java.util.ArrayList;
import java.util.Iterator;
import com.dragonmaster10.musicAndLifeProgram.menu.ConsoleControls;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class UserConsoleListView 
{
	ArrayList<User> userList;

	public UserConsoleListView() {
		// TODO Auto-generated constructor stub
	}
	
	public void setUserList(ArrayList<User> userList)
	{
		this.userList = userList;
	}
	
	public void display()
	{
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "...USER VIEWER..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<User> iterator = this.userList.iterator();
		while (iterator.hasNext())
		{
			User aUser = (User)iterator.next();
			System.out.println("Name:	" + aUser.getUserName() + "		Mob:" + aUser.getUserPhone());
		}
	}

}//EOC
