package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.RegistrationQueris;
import services.RegistrationService;
import services.teszt;

public class RegistrationFrameController {
	
	RegistrationService regService = new RegistrationService();
	RegistrationQueris regQueries = new RegistrationQueris();
	
	@FXML private TextField userName, email;
	@FXML private PasswordField password;
	private String UserID = "1";
	
	@FXML private void regSaveButton(ActionEvent event) throws Exception{
		regService.executeUserRegistration(UserID, userName.getText(), password.getText(), email.getText());
	}

}
