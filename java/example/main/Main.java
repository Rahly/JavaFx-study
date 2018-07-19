package example.main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MainScreen.fxml"));
		StackPane stackPane = loader.load();
		Scene scene = new Scene(stackPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Example");
		primaryStage.show();
	}
}
