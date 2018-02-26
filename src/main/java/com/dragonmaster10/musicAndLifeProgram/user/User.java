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
	private int userId;
	private String userName;
	private String userEmail;
	private String userRole;
	private String userToken;
	private int userStatus;
	private String userLastUpdate;
	
	public User(int userId, String userName, String userEmail, String userRole, String userToken, int userStatus, String userLastUpdate) 
	{
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userRole = userRole;
		this.userToken = userToken;
		this.userStatus = userStatus;
		this.userLastUpdate = userLastUpdate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserLastUpdate() {
		return userLastUpdate;
	}

	public void setUserLastUpdate(String userLastUpdate) {
		this.userLastUpdate = userLastUpdate;
	} 
	
	//METHODS
	public String toString()
	{
		return String.format(
				"User [userId=%s, userName=%s, userEmail=%s, userRole=%s, userToken=%s, userStatus=%s, userLastUpdate=%s]",
				userId, userName, userEmail, userRole, userToken, userStatus, userLastUpdate);
	}

	public void display() 
	{
		// TODO Auto-generated method stub		
	}
	
}//EOC
