package com.dragonmaster10.musicAndLifeProgram.music;

import java.util.ArrayList;
/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 05/03/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public interface IMusicDAO
{
	public ArrayList<Music> getAllMusic();
	public Music getMusic( int music_id);
	public int addMusic(Music aMusic);
	public void updateMusic(Music aMusic);
	public void deleteMusic( Music aMusic);
	public String printMusic( int music_id);

}
