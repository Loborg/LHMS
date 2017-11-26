package services;

import java.io.IOException;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import userinterface.MainRegistrationFrame;

public class RegistrationService extends GridPane {
	
	SQLConnector con = new SQLConnector();
	RegistrationQueris regQueries = new RegistrationQueris();
	MainRegistrationFrame regFrame = new MainRegistrationFrame();
	
	public void executeUserRegistration(String UserID, String UserName, String Password, String Email) throws MySQLIntegrityConstraintViolationException, MySQLSyntaxErrorException, Exception {
		
		try{
		con.setDataBaseConnection("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/lhms?useSSL=false", "Loborg", "Csokika111");
		con.createStatement();
	
		con.updateDatabase(regQueries.createTableIfNotExist());
		con.updateDatabase(regQueries.insertIntoTable(UserID, UserName, Password, Email));
		
		
		} catch (Exception e) {
			if (e.getMessage().equals("Table 'users' already exists")){
				con.setQuery(regQueries.getLastUserID());
				con.next();
				UserID = con.getResult(1);
				
				Integer key = Integer.parseInt(UserID);
				key++;
				UserID = key.toString();
				con.updateDatabase(regQueries.insertIntoTable(UserID, UserName, Password, Email));
			} 
		}
	}

}
