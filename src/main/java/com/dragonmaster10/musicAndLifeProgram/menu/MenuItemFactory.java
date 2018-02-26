package com.dragonmaster10.musicAndLifeProgram.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.dragonmaster10.musicAndLifeProgram.App;
import com.dragonmaster10.musicAndLifeProgram.music.MusicViewMenuItem;
import com.dragonmaster10.musicAndLifeProgram.playlist.PlaylistViewMenuItem;
import com.dragonmaster10.musicAndLifeProgram.user.UserViewMenuItem;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 26/02/2018
 * 
 * Ref: Lecture notes
 *
 ************************************************************/

public class MenuItemFactory
{
	private static Logger LOG;

	public MenuItemFactory() {
		LOG = LogManager.getLogger(MenuItemFactory.class);
	}
	
	public IExecutable getMenuItem(String className)
	{
		if ("com.dragonmaster10.musicAndLifeProgram.playlist.PlaylistViewMenuItem".contentEquals(className))
		{
			return (IExecutable) new PlaylistViewMenuItem();
		}
		if("com.dragonmaster10.musicAndLifeProgram.music.MusicViewMenuItem".equals(className))
		{
			return (IExecutable) new MusicViewMenuItem();
		}
		if("com.dragonmaster10.musicAndLifeProgram.user.UserViewMenuItem".equals(className))
		{
			return (IExecutable) new UserViewMenuItem();
		}
		
		//for each menu item take a copy of an if line above change the class it is looking for and the class to use
	
	
		//this catches deliberately undefined menu items and errors
		if("com.dragonmaster10.musicAndLifeProgram.playlist.UndefinedMenuItem".equals(className))
		{
			return(IExecutable) new UndefinedMenuItem();
		}
		else
		{
			LOG.error("undefined class requested" + className);
			return (IExecutable) new UndefinedMenuItem();
		}
	
	}//EOM

}//EOC
