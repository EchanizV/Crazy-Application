package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    	Parent rootFXML = FXMLLoader.load(getClass().getResource("Vue.fxml"));
		    	Scene sceneFXML = new Scene(rootFXML);
		    	
		    	primaryStage.setTitle("Crazy Application");
		    	
		    	primaryStage.setScene(sceneFXML);
		    	
		    	primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
