package services;

import java.util.ArrayList;

import userinterface.MainRegistrationFrame;

public class RegistrationQueris {
	
	public MainRegistrationFrame regFrame = new MainRegistrationFrame();
	
	public ArrayList<String> registrateUserIfNoTableArray, registrateUserIfTableExistArray = new ArrayList<String>();
	
	/*Ide jönnek a FXML dokument elemeiből kinyert információk alapján elkészített lekérdezések és tábla elkészítések.
	 * Az FXML elemeket még nem tudom hogy érem el ennek utána kell nézni*/
	
	public String createTableIfNotExist() {
		return "CREATE TABLE Users ("
				+ "UserID INT NOT NULL PRIMARY KEY, "
				+ "UserName VARCHAR(255), "
				+ "Password VARCHAR(255), "
				+ "Email VARCHAR(255));";
	}
		
	public String insertIntoTable(String UserID, String UserName, String Password, String Email){
		return "INSERT INTO Users VALUES ("+UserID+", \'"+UserName+"\', \'"+Password+"\', \'"+Email+"\');";
	}
	
	public String getLastUserID (){
		return "SELECT COUNT(UserID) FROM users;";
	}

}
