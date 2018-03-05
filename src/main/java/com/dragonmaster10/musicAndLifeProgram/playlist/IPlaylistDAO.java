package com.dragonmaster10.musicAndLifeProgram.playlist;	
	
import java.util.ArrayList;
import com.dragonmaster10.musicAndLifeProgram.user.User;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/
	public interface IPlaylistDAO {

	
	
		public ArrayList<Playlist> getAllPlaylists();
		public Playlist getUserPlaylist( int user_playlist_id);
		public int addUserPlaylist( Playlist aUserPlaylist);
		public void updateUserPlaylist( Playlist aUserPlaylist);
		public void deleteUserPlaylist( Playlist aUserPlaylist);
		public String printUserPlaylist( int user_playlist_id);

	}
