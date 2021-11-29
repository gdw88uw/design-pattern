package com.gdw888.designpattern.chainofresponsibility;

public class UserExistHandler extends Handler{
	private Database database;

	public UserExistHandler(Database database){
		this.database = database;
	}

	@Override
	public boolean handle(String username, String password) {
		if (!database.isValidPassword(username, username)){
			return false;
		}
		return handleNext(username, password);
	} 
}
