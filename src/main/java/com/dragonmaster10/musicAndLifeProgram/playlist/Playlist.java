package com.dragonmaster10.musicAndLifeProgram.playlist;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class Playlist {
	
	//DATA
	
		//declare objects
		private int user_playlist_id;
		private int user_id;
		private String theme;
		private String playlist_description;

		public Playlist(int user_playlist_id, int user_id, String theme, String playlist_description ) 
		{
			this.user_playlist_id = user_playlist_id;
			this.user_id = user_id;
			this.theme = theme;
			this.playlist_description = playlist_description;
		}
			
			public int getUserPlaylistId() {
				return user_playlist_id;
			}

			public void setUserPlaylistId(int user_playlist_id) {
				this.user_playlist_id = user_playlist_id;
			}
			
			public int getUserId() {
				return user_id;
			}

			public void setUserId(int user_id) {
				this.user_id = user_id;
			}
			
			public String getUserPlaylistTheme() {
				return theme;
			}

			public void setUserPlaylistTheme(String theme) {
				this.theme = theme;
			}
			
			public String getUserPlaylistDescription() {
				return playlist_description;
			}

			public void setUserPlaylistDescription(String playlist_description) {
				this.playlist_description = playlist_description;
			}

			
			//METHODS
			public String toString()
			{
				return String.format(
						"Playlist [user_playlist_id=%s, user_id=%s, theme=%s, playlist_description=%s]",
						 user_playlist_id, user_id, theme, playlist_description);
			}

	}//EOC
