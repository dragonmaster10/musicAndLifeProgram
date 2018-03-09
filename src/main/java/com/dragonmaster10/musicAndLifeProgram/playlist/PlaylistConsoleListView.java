package com.dragonmaster10.musicAndLifeProgram.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import com.dragonmaster10.musicAndLifeProgram.menu.ConsoleControls;
import com.dragonmaster10.musicAndLifeProgram.user.User;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class PlaylistConsoleListView {
	
	ArrayList<Playlist> userPlaylist;

	public PlaylistConsoleListView() {
		// TODO Auto-generated constructor stub
	}
	
	public void setUserPlaylist(ArrayList<Playlist> userPlaylist)
	{
		this.userPlaylist = userPlaylist;
	}
	
	public void display()
	{
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "...USER PLAYLIST VIEWER..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Playlist> iterator = this.userPlaylist.iterator();
		while (iterator.hasNext())
		{
			//this is where you choose what you want to see in your output
			Playlist aUserPlaylist = (Playlist)iterator.next();
			System.out.println("PlaylistID :"+ aUserPlaylist.getUserPlaylistId() + "		UserID: " +   aUserPlaylist.getUserId()+  
					" 		Playlist theme: " +aUserPlaylist.getUserPlaylistTheme()+ " 		Playlist Description: " + aUserPlaylist.getUserPlaylistDescription());
		}

	}



}
