package com.dragonmaster10.musicAndLifeProgram.menu;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ************************************************************/

public class ConsoleControls 
{
	//console colours may not work in windows
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	//background
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	//High Intensity
	public static final String ANSI_BLACK_BRIGHT = "\u001B[90m"; 
	public static final String ANSI_RED_BRIGHT = "\u001B[91m";
	public static final String ANSI_GREEN_BRIGHT = "\u001B[92m";
	public static final String ANSI_YELLOW_BRIGHT = "\u001B[93m";
	public static final String ANSI_BLUE_BRIGHT = "\u001B[94m";
	public static final String ANSI_PURPLE_BRIGHT = "\u001B[95m";
	public static final String ANSI_CYAN_BRIGHT = "\u001B[96m";
	public static final String ANSI_WHITE_BRIGHT = "\u001B[97m";
	
	public ConsoleControls() {}
	
	public static void clearConsole()
	{
		try
		{
			final String os = System.getProperty("os.name");
			if(os.contains("Windows"))
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			else
			{
				//Runtime.getRuntime().exec("clear");
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//EOM
	
}//EOC
