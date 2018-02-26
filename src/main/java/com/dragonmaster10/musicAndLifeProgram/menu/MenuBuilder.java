package com.dragonmaster10.musicAndLifeProgram.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ************************************************************/

public class MenuBuilder
{
	Menu aMenu;
	
	//CONSTRUCTORS
	public MenuBuilder()
	{
		buildMenu();
	}
	
	//METHODS
	private void buildMenu()
	{
		//The Menu
		this.aMenu = new Menu("Music and Life", "Appreciate the music of others through their life experiences");
		
		//Headings
		MenuHeading playHeading = new MenuHeading(1, "Review", "Music and Life playlist review");
		MenuHeading maintainHeading = new MenuHeading (2, "Maintenance", "Add users, playlists and music");
		MenuHeading adminHeading = new MenuHeading (3, "Administration", "Music and Life program administration options");
		
		//Add headings to the menu
		aMenu.add(playHeading);
		aMenu.add(maintainHeading);
		aMenu.add(adminHeading);
		
		//play menu 
		playHeading.add(new MenuItem(1, "List Playlists", "List the playlists available in the system", "com.dragonmaster10.musicAndLifeProgram.playlist.PlaylistViewMenuItem" ));
		playHeading.add(new MenuItem(2,"List Music", "List the music available in the system", "com.dragonmaster10.musicAndLifeProgram.music.MusicViewMenuItem"));
		playHeading.add(new MenuItem(3, "List Users", "List the users in the system", "com.dragonmaster10.musicAndLifeProgram.user.UserViewMenuItem"));
		
		//maintain menu
		maintainHeading.add(new MenuItem(1, "Add User", "Add a user", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		maintainHeading.add(new MenuItem(2, "Add Music", "Add music", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		maintainHeading.add(new MenuItem(3, "Add Playlist", "Add a playlist", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		maintainHeading.add(new MenuItem(4, "Edit Music", "Edit music", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		maintainHeading.add(new MenuItem(5, "Edit Playlist", "Edit a playlist", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		
		//admin menu
		adminHeading.add(new MenuItem(1, "Remove a User", "Remove a user", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		adminHeading.add(new MenuItem(2, "Remove Music", "Remove music", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));
		adminHeading.add(new MenuItem(3, "Remove a Playlist", "Remove a playsist", "com.dragonmaster10.musicAndLifeProgram.menu.UndefinedMenuItem"));		
	}//EOM
	
	public Menu getMenu()
	{
		return this.aMenu;
	}
	
	public void print()
	{
		this.aMenu.print();
	}
	
	public String display()
	{
		return this.aMenu.toString();
	}
	

	
}//EOC
