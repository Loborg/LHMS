package userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainRegistrationFrame extends Application {
	
	public static Stage stage = new Stage();
	public Parent root;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		this.stage = stage;
		
		root = FXMLLoader.load(getClass().getResource("../fxmltemplates/registrationFrame.fxml"));
		
		Scene scene = new Scene(root);
		
		stage.setResizable(false);
		stage.setAlwaysOnTop(true);
		stage.setScene(scene);
		stage.show();
	}
}
