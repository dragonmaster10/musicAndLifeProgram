package com.dragonmaster10.musicAndLifeProgram;

import java.util.Date;
import java.util.Scanner;

/**
 * @author: dragonmaster10
 * Date: 22/02/2018
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	//To view the arguments being entered
    	seeCommandlineInput(args);
    	
    	//to instantiate App class based in the parameters entered at the commandline 
    	actionCommandlineInput(args);
    	
    	//DATA
    	//define attributes
    	private Scanner someInput;
    	private Date today;
    	
    	//Constructors
    	public App()
    	{
    		this.someInput = new Scanner(System.in);
    		
    		//do something here
    		System.out.println(" \n Soon ... stuff will happen here");
    		
    		//pause before exit (this is only useful if an error occurs)
    		System.out.println(" \n Press enter to ecit the program");
    		this.someInput.nextLine();
    		
    		//close the program without error
    		System.exit(0);
    	}
    	
    	//Methods used by main() or debug methods - note they are static methods
    	/**
    	* action the arguments presented at the command line
    	* instantiate the App class based on the arguments passed
    	*/
    	private static void actionCommandlineInput(String args[])
    	{
    		//no special instantiation yet as don't pass args to it
    		App anApp = new App();
    	}
    	/**
    	* View the arguments presented at the commandline
    	* This is for debug and demo purposes
    	*/
    	private static void seeCommandlineInput(String args[])
    	{
    		if(args.length ==0)
    		{
    			System.out.println("There were no commandline arguments passed!");
    		}
    		else
    		{
    			//display the command line entered
    			for(int i=0; i<args.lengthh; i++)
    			{
    				System.out.println(args[i]);
    			}
    		}
    	}
    	}
}//EOC
