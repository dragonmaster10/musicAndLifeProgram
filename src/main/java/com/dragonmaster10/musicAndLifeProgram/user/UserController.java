package com.dragonmaster10.musicAndLifeProgram.user;

import java.util.Scanner;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public class UserController 
{
	private	UserConsoleListView	view;
	private	UserDAO	model;
	Scanner	input =	new	Scanner(System.in);
	
	public UserController(UserConsoleListView view, UserDAO	model)	
	{
		this.view = view;
		this.model = model;
	}
	public void	display()	
	 {
		view.setUserList(model.getAllUsers());
		view.display();
		System.out.println(" \n	Press enter	return to the main menu");
		this.input.nextLine();
	 }	

}