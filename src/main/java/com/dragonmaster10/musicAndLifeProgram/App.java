package com.dragonmaster10.musicAndLifeProgram;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import com.dragonmaster10.musicAndLifeProgram.data.DataManagerSQLite;
import com.dragonmaster10.musicAndLifeProgram.menu.MenuBuilder;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/***************************************************************
 * Name: dragonmaster10
 * Date: 22/02/2018
 *
 ******************************************************************/

public class App 
{
    public static void main( String[] args )
    {
    	//To view the arguments being entered
    	seeCommandlineInput(args);
    	
    	//to instantiate App class based in the parameters entered at the commandline 
    	actionCommandlineInput(args);
    }
    	
    	//DATA
    	//define attributes
    	private Scanner someInput;
    	private Date today;
    	private static Logger LOG;
    	private static String VERSION = "0.5";
    	
    	//The URL and name of the SQLite database
   	    //TODO:	Remove database	location and name hard coding and pass in as a parameter in	the	next version
    	private String databaseFile = "jdbc:sqlite:database/oreallyoreilly.db";
    	
    	//Constructors
    	public App(Level logLevel)
    	{
    		//associate logging with this class so know the messages that came from objects of this class
    		LOG = LogManager.getLogger(App.class);
    		Configurator.setLevel(LOG.getName(), logLevel);
    		
    		//Check the log level requesteed
    		LOG.info("Commandline requested log level:" +logLevel);
    		LOG.info("Application started with log level debug:" + LOG.isDebugEnabled());
    		
    		//test the logging
    		//testLogOutput();
    		
    		this.someInput = new Scanner(System.in);
    		
    		//do something here :Display the list of users from the database
    		//showListOfUsers();
    		//System.out.println(" \n Soon ... stuff will happen here");
    		
    		//set the database file to use
    		DataManagerSQLite.getInstance().setDataFile(this.databaseFile);
    		
    		MenuBuilder theMenu = new MenuBuilder();
    		//theMenu.print();
    		//LOG.debug(theMenu.display());
    		theMenu.getMenu().display();
    		
    		
    		//pause before exit (this is only useful if an error occurs)
    		System.out.println(" \n Press enter to exit the program");
    		this.someInput.nextLine();
    		
    		//close the program without error
    		System.exit(0);
    	}
    	
    	public App()
   	    {
   	 		this( Level.INFO );
   	    }
    	
    	//Methods used by main() or debug methods - note they are static methods
    	
    	// action the arguments presented at the command line
    	// instantiate the App class based on the arguments passed
    	
    	private static void actionCommandlineInput(String args[])
    	{		
    		try
    		{
   
    			final OptionParser optionParser = new OptionParser();
    			
    			//define the allowed arguments
    			optionParser.acceptsAll(Arrays.asList("v", "verbose"), "Set logging level to DEBUG to see all levels of log messages").forHelp();
    			optionParser.acceptsAll(Arrays.asList("h", "help"), "Display help/usage information").forHelp();
    			optionParser.acceptsAll(Arrays.asList("r", "version"), "Display progresion information").forHelp();
    			
    			final OptionSet options = optionParser.parse(args);
    			
    			if (options.has("help"))
    			{
    				System.out.println("This program takes an SQL database with a table as displays the users.");
    				System.out.println("It is privided as an example for teaching programming.");
    				printUsage(optionParser);
    				System.exit(0);
    			}
    			
    			if (options.has("version"))
    			{
    				System.out.println("music and life program: " + VERSION);
    				System.exit(0);
    			}
    			
    			//valid input so start the program with the name of the database file to use
    			if (options.has("verbose"))
    			{
    				Level logLevel = Level.DEBUG;
    				System.out.println("RUN WITH: logging level requested: " + logLevel);
    				App anApp = new App(logLevel);
    			}
    			else
    			{
    				System.out.println("RUN WITH: logging level requested:" + Level.INFO);
    				App anApp = new App();
    			}
    		}
    		catch (OptionException argsEx)
    		{
    			System.out.println("ERROR: Arguments\\parameter is not valid. " +argsEx);
    			
    		}
    		
    	}// EOM
    	 	
    	/*
    	* View the arguments presented at the commandline
    	* This is for debug and demo purposes
    	*/
    	private static void seeCommandlineInput( String args[])
    	{
    		if(args.length == 0)
    		{
    			System.out.println("There were no commandline arguments passed!");
    		}
    		else
    		{
    			//display the command line entered
    			for(int i=0; i<args.length; i++)
    			{
    				System.out.println(args[i]);
    			}
    		}
    	}//EOM 
    	
    	/*
	 	*	Write	help	message	to	standard	output	using
	 	*	the	provided	instance	of	{@code	OptionParser}.
	 	*/
	 	private static void printUsage(final OptionParser parser)
	 	{
	 		try
	 		{
	 			parser.printHelpOn(System.out);		
	 		}
	 		catch (IOException ioEx)
	 		{
	 			//	System.out.println("ERROR:	Unable	to	print	usage	-	"	+	ioEx);
	 			LOG.error("ERROR: Unable to	print usage	- "	+ ioEx);
	 		}
	 	}//EOM
	 	
	 	
    	
    	//Test the log4j2 logging
    	
    	private static void testLogOutput()
    	{
    		LOG.debug("Log test: Test printed on debug");
    		LOG.info("Log test: Test printed on info");
    		LOG.warn("Log test: Test printed on warn");
    		LOG.error("Log test: Test printed on error");
    		LOG.fatal("Log test: Test printed on fatal");
    		
    		LOG.info("Appending string: {}.", "Application log test message -Hi");
    		
    	}//EOM
    	
}//EOC
