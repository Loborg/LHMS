package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import userinterface.MainLoginFrame;
import userinterface.MainRegistrationFrame;

public class MainFrameController {
	
	MainRegistrationFrame regFrame = new MainRegistrationFrame();
	
	@FXML private void logout(ActionEvent event){
		MainLoginFrame.stage.show();
	}
	
	@FXML private void registrationForm(ActionEvent event) throws Exception{
		regFrame.start(MainRegistrationFrame.stage);
		//MainRegistrationFrame.stage.show();
	}

}
