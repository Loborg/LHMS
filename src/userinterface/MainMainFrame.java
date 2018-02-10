package userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMainFrame extends Application {
	
	public Scene scene;

	public static Stage stage = new Stage();
	@Override
	public void start(Stage stage) {
		
		stage = this.stage;
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/fxmltemplates/mainFrame.fxml"));
			
			scene = new Scene(root, 1024, 768);
			
			stage.setMaximized(false);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
