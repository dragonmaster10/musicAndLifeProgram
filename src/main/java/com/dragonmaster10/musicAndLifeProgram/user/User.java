package com.dragonmaster10.musicAndLifeProgram.user;

/**********************************************************
 * *
 * 
 * @author dragonmaster10
 * Date: 24/02/2018
 * 
 * Ref: Lecture notes
 *
 *********************************************************/

public class User 
{
	//DATA
	
	//declare objects
	private int user_id;
	private String name;
	private int phone;
	
	public User(int user_id, String name, int phone) 
	{
		this.user_id = user_id;
		this.name = name;
		this.phone = phone;
	}

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return name;
	}

	public void setUserName(String name) {
		this.name = name;
	}
	
	public int getUserPhone() {
		return phone;
	}

	public void setUserPhone(int phone) {
		this.phone = phone;
	}
	
	
	//METHODS
	public String toString()
	{
		return String.format(
				"User [user_id=%s, name=%s, phone=%s]",
				user_id, name, phone);
	}

}//EOC