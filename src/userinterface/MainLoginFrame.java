package userinterface;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainLoginFrame extends Application {
	
	public static Stage stage = new Stage();
	public MainMainFrame mainFrame = new MainMainFrame();

	@Override
	public void start(Stage stage) throws Exception {
		
            stage = this.stage;

            Parent root = FXMLLoader.load(getClass().getResource("/fxmltemplates/loginFrame.fxml"));

            Scene scene = new Scene(root);

            stage.setScene(scene);
            //stage.setOnCloseRequest(e->e.consume()); //Ez ugyan az mint az eventHandleres csak Lambda operátorral

            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                event.consume();
                }
            });
		
		mainFrame.start(MainMainFrame.stage);
		stage.setAlwaysOnTop(true);
		stage.setResizable(false);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}
