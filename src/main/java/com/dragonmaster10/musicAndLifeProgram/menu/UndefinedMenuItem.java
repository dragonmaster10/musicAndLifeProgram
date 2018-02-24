package com.dragonmaster10.musicAndLifeProgram.menu;

import java.util.Scanner;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * References: Lecture notes
 *
 ************************************************************/

public class UndefinedMenuItem implements IExecutable
{
	Scanner input = new Scanner(System.in);
	public UndefinedMenuItem() {}
	
	public void execute() 
	{
		System.out.println("The class " + UndefinedMenuItem.class.getName() + " is a placeholder menu item.");
		System.out.println("\n Press enter to return to the main menu");
		this.input.nextLine();
	}

}//EOC
