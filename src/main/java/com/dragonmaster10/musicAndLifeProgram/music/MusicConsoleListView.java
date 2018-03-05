package com.dragonmaster10.musicAndLifeProgram.music;

import java.util.ArrayList;
import java.util.Iterator;

import com.dragonmaster10.musicAndLifeProgram.menu.ConsoleControls;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class MusicConsoleListView 
{	
	ArrayList<Music> musicList;

	//CONSTRUCTOR
	public MusicConsoleListView() {
		// TODO Auto-generated constructor stub
	}
	
	//METHODS
	public void setMusicList(ArrayList<Music> musicList)
	{
		this.musicList = musicList;
	}
	
	public void display()
	{
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "...MUSIC VIEWER..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Music> iterator = this.musicList.iterator();
		while (iterator.hasNext())
		{
			Music aMusic = (Music)iterator.next();
			//System.out.println("Name:	" + aUser.getUserName() + "		Mob:" + aUser.getUserPhone());
			System.out.println("Music ID: " + aMusic.getMusicId());
		}
	}

}//EOC
