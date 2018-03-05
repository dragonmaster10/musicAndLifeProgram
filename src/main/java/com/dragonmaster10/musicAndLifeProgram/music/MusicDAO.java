package com.dragonmaster10.musicAndLifeProgram.music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dragonmaster10.musicAndLifeProgram.data.IDataManager;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public class MusicDAO implements IMusicDAO {
	//DATA
	private IDataManager dataManager;
		
	//this is added to every class that needs to log with one change
	//the getLogger() part should contain the name of the class its in
	//so you know the messages that came from objects of this class
	private final Logger LOG = LogManager.getLogger(MusicDAO.class);
		
	//CONSTRUCTORS
	public MusicDAO( IDataManager dataManager) 
	{
		this.dataManager = dataManager;
	}
		
	//METHODS
	public ArrayList<Music> getAllMusic()
	{
		ArrayList<Music> musicList = new ArrayList<Music>();
			
		//get JDBC connection to database
		Connection connection = null;	
		try
		{
			//get a database connection
			connection = this.dataManager.getConnectionObject();
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); //set timeout to 30 sec
				
			//run the query
			ResultSet resultSet = statement.executeQuery("select * from music");
				
			//iterate through the results create Music objects put in the ListArray
			while(resultSet.next())
			{
				Music music = new Music( resultSet.getInt("music_id"),
									  resultSet.getInt("user_playlist_id"),
						              resultSet.getString("song_name"),
						              resultSet.getString("song_description"),
						              resultSet.getString("artist_name"),
						              resultSet.getInt("year_published"),
						              resultSet.getString("song_url_link")		              
						             );
				//putting the Music objects into the list but not using them yet
				musicList.add(music);
					
				//print the results by using the toString() on Music
				LOG.debug("Music object : "+ music.toString());
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
		return musicList;
			
	}//EOM
		
	public Music getMusic(int music_id)
		{
			throw new UnsupportedOperationException();
		}
		
		public int addMusic(Music aMusic)
		{
			throw new UnsupportedOperationException();
		}
		
		public void updateMusic(Music aMusic)
		{
			throw new UnsupportedOperationException();
		}
		
		public void deleteMusic( Music aMusic)
		{
			throw new UnsupportedOperationException();
		}
		
		public String printMusic( int music_id)
		{
			throw new UnsupportedOperationException();
		}


}
