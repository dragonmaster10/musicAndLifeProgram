package com.dragonmaster10.musicAndLifeProgram.music;

import com.dragonmaster10.musicAndLifeProgram.data.DataManagerSQLite;
import com.dragonmaster10.musicAndLifeProgram.menu.IExecutable;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 26/02/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class MusicViewMenuItem implements IExecutable
{
	

	public MusicViewMenuItem() {
		// TODO Auto-generated constructor stub
	}
	
	public void execute() 
	{
		
		//System.out.println("I ran: "	+ MusicViewMenuItem.class....);
	    //Get	the	User data
	    MusicDAO model = new MusicDAO( DataManagerSQLite.getInstance());
	    MusicConsoleListView view =	new	MusicConsoleListView();
	    MusicController	controller = new MusicController( view, model);
	    controller.display();
	}

}
