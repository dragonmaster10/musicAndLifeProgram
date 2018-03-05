package com.dragonmaster10.musicAndLifeProgram.user;

import java.util.ArrayList;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 ***************************************************/

public interface IUserDAO 
{
	public ArrayList<User> getAllUsers();
	public User getUser( int user_id);
	public int addUser( User aUser);
	public void updateUser( User aUser);
	public void deleteUser( User aUser);
	public String printUser( int user_id);

}//EOC
