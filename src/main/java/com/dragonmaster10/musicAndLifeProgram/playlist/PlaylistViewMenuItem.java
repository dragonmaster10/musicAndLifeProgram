package com.dragonmaster10.musicAndLifeProgram.playlist;

import java.util.Scanner;
import com.dragonmaster10.musicAndLifeProgram.menu.ConsoleControls;
import com.dragonmaster10.musicAndLifeProgram.menu.IExecutable;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class PlaylistViewMenuItem implements IExecutable
{
	Scanner input = new Scanner(System.in);

	public PlaylistViewMenuItem() {
		// TODO Auto-generated constructor stub
	}
	
	public void execute()
	{
		System.out.println(ConsoleControls.ANSI_YELLOW_BRIGHT + "...PLAYLIST VIEWER..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n" + PlaylistViewMenuItem.class.getName() + " has no MVC implementation.");
		System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
	}//EOM

}//EOC
