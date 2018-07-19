package example.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuController {

	private MainController mainController;

	@FXML
	public void openApplication() {

		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AppController appController = loader.getController();
		appController.setMainController(mainController);
		mainController.setScreen(pane);
	}

	@FXML
	public void openOptions() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OptionsController optionController = loader.getController();
		optionController.setMainController(mainController);
		mainController.setScreen(pane);
	}

	@FXML
	public void exit() {
		Platform.exit();
	}

	public void setMainController(MainController mainController) {

		this.mainController = mainController;
	}
}
