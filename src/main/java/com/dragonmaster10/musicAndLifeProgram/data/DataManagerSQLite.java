package com.dragonmaster10.musicAndLifeProgram.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragonmaster10.musicAndLifeProgram.user.UserDAO;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public class DataManagerSQLite implements IDataManager
{
	//DATA
	private final Logger LOG = LogManager.getLogger(DataManagerSQLite.class);
	private static DataManagerSQLite oneInstance = new DataManagerSQLite();
	private String databaseFile = null;
	private Connection connection = null;
	
	//CONSTRUCTORS
	private DataManagerSQLite() {}
	public static DataManagerSQLite getInstance()
	{
		return oneInstance;
	}
	
	//METHODS
	public void setDataFile(String databaseFile)
	{
		this.databaseFile = databaseFile;
	}
	
	public Connection getConnectionObject() throws SQLException
	{
		if(this.databaseFile != null)
		{
			this.connection = DriverManager.getConnection(this.databaseFile);
			LOG.debug("Database connection established");
		}
		else
		{
			connection = null;
		}
		return connection;
	}
	
	public void disconnect() throws SQLException
	{
		connection.close();
		LOG.debug("Database connection established");
	}

}//EOC
