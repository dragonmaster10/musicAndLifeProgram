package com.dragonmaster10.musicAndLifeProgram.user;

import com.dragonmaster10.musicAndLifeProgram.data.DataManagerSQLite;
import com.dragonmaster10.musicAndLifeProgram.menu.IExecutable;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/
public class UserViewMenuItem implements IExecutable
{
	 public	UserViewMenuItem(){}
	 public	void execute()
	 {
		 //System.out.println("I ran: "	+ UserViewMenuItem.class.getName());
	 	 //Get	the	User data
	 	 UserDAO model = new UserDAO( DataManagerSQLite.getInstance());
	 	 UserConsoleListView view =	new	UserConsoleListView();
	 	 UserController	controller = new	UserController(	view, model);
	 	 controller.display();
	 }
	

}
