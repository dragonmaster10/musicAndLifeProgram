package com.dragonmaster10.musicAndLifeProgram.data;

import java.sql.Connection;
import java.sql.SQLException;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public interface IDataManager 
{
	public Connection getConnectionObject() throws SQLException;
	public void disconnect() throws SQLException;
}//EOC
