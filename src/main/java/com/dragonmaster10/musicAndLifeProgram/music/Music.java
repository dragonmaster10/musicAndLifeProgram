package com.dragonmaster10.musicAndLifeProgram.music;



/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class Music 
{	
	//declare objects
	private int music_id;
	private int user_playlist_id;
	private String song_name;
	private String song_description;
	private String artist_name;
	private int year_published;
	private String song_url_link;
	
	//CONSTRUCTORS
	public Music(int music_id, int user_playlist_id, String song_name, String song_description, String artist_name, int year_published, String song_url_link) 
	{
		this.music_id = music_id;
		this.user_playlist_id = user_playlist_id;
		this.song_name = song_name;
		this.song_description = song_description;
		this.artist_name = artist_name;
		this.year_published = year_published;
		this.song_url_link = song_url_link;
	}

	//METHODS- Gets & Sets
	public int getMusicId() {
		return music_id;
	}

	public void setMusicId(int music_id) {
		this.music_id = music_id;
	}
	
	public int getUserPlaylistId() {
		return user_playlist_id;
	}
	
	public void setUserPlaylistId(int user_playlist_id) {
		this.user_playlist_id = user_playlist_id;
	}

	public String getSongName() {
		return song_name;
	}

	public void setSongName(String song_name) {
		this.song_name = song_name;
	}

	public String getSongDescription() {
		return song_description;
	}
	
	public void setSongDescription(String song_description) {
		this.song_description = song_description;
	}
	
	public String getArtistName() {
		return artist_name;
	}

	public void setArtistName(String artist_name) {
		this.artist_name = artist_name;
	}
	
	public int getYearPublished() {
		return year_published;
	}
	
	public void setYearPublished(int year_published) {
		this.year_published = year_published;
	}
	
	public String getSongURLLink() {
		return song_url_link;
	}
	public void setSongURLLink(String song_url_link) {
		this.song_url_link = song_url_link;
	}	
	
	//METHODS
	public String toString()
	{
		return String.format(
				"Music [music_id=%s, user_playlist_id=%s, song_name=%s, song_description=%s, artist_name=%s, year_published=%s, song_url_link=%s]",
				music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link);
	}//EOM
}//EOC
