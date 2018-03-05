package com.dragonmaster10.musicAndLifeProgram.playlist;


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

public class PlaylistViewMenuItem implements IExecutable
{
	public PlaylistViewMenuItem() {
		// TODO Auto-generated constructor stub
	}
	
	public void execute()
	{
		//get the Playlist data
		PlaylistDAO model = new PlaylistDAO( DataManagerSQLite.getInstance());
		PlaylistConsoleListView view =	new	PlaylistConsoleListView();
	    PlaylistController	controller = new PlaylistController( view, model);
	 	controller.display();
		
		//System.out.println(ConsoleControls.ANSI_YELLOW_BRIGHT + "...PLAYLIST VIEWER..." + ConsoleControls.ANSI_RESET);
		//System.out.println("\n" + PlaylistViewMenuItem.class.getName() + " has no MVC implementation.");
		//System.out.println(" \n Press enter return to the main menu");
		//this.input.nextLine();
	}//EOM

}//EOC
