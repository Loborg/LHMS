package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import userinterface.MainLoginFrame;
import userinterface.MainMainFrame;

public class LoginFrameController {
	
	public MainMainFrame mainFrame = new MainMainFrame();
	
	@FXML private void loginButton(ActionEvent event) throws Exception{
		MainLoginFrame.stage.hide();
	}
	
	@FXML private void exitButton(ActionEvent event){
		Platform.exit();
	}
}
