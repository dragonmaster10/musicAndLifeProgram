package com.dragonmaster10.musicAndLifeProgram.playlist;

import java.util.Scanner;

import com.dragonmaster10.musicAndLifeProgram.user.UserConsoleListView;
import com.dragonmaster10.musicAndLifeProgram.user.UserDAO;
/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public class PlaylistController {
	private	PlaylistConsoleListView	view;
	private	PlaylistDAO	model;
	Scanner	input =	new	Scanner(System.in);
	
	public PlaylistController(PlaylistConsoleListView view, PlaylistDAO	model)	
	{
		this.view = view;
		this.model = model;
	}
	public void	display()	
	 {
		view.setUserPlaylist(model.getAllPlaylists());
		view.display();
		System.out.println(" \n	Press enter to return to the main menu");
		this.input.nextLine();
		
	 }

}
