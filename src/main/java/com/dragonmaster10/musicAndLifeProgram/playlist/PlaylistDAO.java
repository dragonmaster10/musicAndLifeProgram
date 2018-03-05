package com.dragonmaster10.musicAndLifeProgram.playlist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragonmaster10.musicAndLifeProgram.data.IDataManager;
import com.dragonmaster10.musicAndLifeProgram.user.User;
import com.dragonmaster10.musicAndLifeProgram.user.UserDAO;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public class PlaylistDAO {
	//DATA
	private IDataManager dataManager;
		
	//this is added to every class that needs to log with one change
	//the getLogger() part should contain the name of the class its in
	//so you know the messages that came from objects of this class
	private final Logger LOG = LogManager.getLogger(PlaylistDAO.class);
		
	//CONSTRUCTORS
	public PlaylistDAO( IDataManager dataManager) 
	{
		this.dataManager = dataManager;
	}
		
	//METHODS
	public ArrayList< Playlist> getAllPlaylists()
	{
		ArrayList< Playlist> userPlaylist = new ArrayList< Playlist>();
			
		//get JDBC connection to database
		Connection connection = null;
			
		try
		{
			//get a database connection
			connection = this.dataManager.getConnectionObject();
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
				
			//run the query
			ResultSet resultSet = statement.executeQuery("select * from user_playlist");
				
			//iterate through the results create Playlist objects put in the ListArray
			while(resultSet.next())
			{
				Playlist playlist = new  Playlist (resultSet.getInt("user_playlist_id"),
													   resultSet.getInt("user_id"),
										  			   resultSet.getString("theme"),
										  			   resultSet.getString("playlist_description")
							             			  );
				//putting the playlist objects into the list but not using them yet
				userPlaylist.add(playlist);
					
				//print the results by using the toString() on Playlist
				LOG.debug("UserPlaylist object : "+ playlist);
				}
			}
		catch(SQLException e)
		{
			//if the error message is "out of memory",
			//it probably means no  database file is found
			LOG.error(e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null)
					this.dataManager.disconnect();
			}
			catch(SQLException e)
			{
				//connection close failed.
				LOG.error(e.getMessage());

			}
		}
		return userPlaylist;
			
	}//EOM
		
		public Playlist getUserPlaylist(int user_playlist_id)
		{
			throw new UnsupportedOperationException();
		}
		
		public int addUserPlaylist(Playlist aUserPlaylist)
		{
			throw new UnsupportedOperationException();
		}
		
		public void updateUserPlaylist(Playlist aUserPlaylist)
		{
			throw new UnsupportedOperationException();
		}
		
		public void deleteUserPlaylist( Playlist aUserPlaylist)
		{
			throw new UnsupportedOperationException();
		}
		
		public String printUserPlaylist( int user_playlist_id)
		{
			throw new UnsupportedOperationException();
		}


}//EOC
