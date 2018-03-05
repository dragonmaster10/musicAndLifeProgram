package com.dragonmaster10.musicAndLifeProgram.music;

import java.util.Scanner;
/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public class MusicController {
	
	private	MusicConsoleListView view;
	private	MusicDAO model;
	Scanner	input =	new	Scanner(System.in);
	
	public MusicController(MusicConsoleListView view, MusicDAO	model)	
	{
		this.view = view;
		this.model = model;
	}
	public void	display()	
	 {
		view.setMusicList(model.getAllMusic());
		view.display();
		System.out.println(" \n	Press enter to return to the main menu");
		this.input.nextLine();
	 }

}
