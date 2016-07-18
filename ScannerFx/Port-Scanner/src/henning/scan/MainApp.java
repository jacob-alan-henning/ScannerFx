package henning.scan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Scan.fxml"));
        primaryStage.setTitle("ScannerFx");
        primaryStage.setScene(new Scene(root, 305,150));
        primaryStage.show();
		
	}
	public static void main(String[] args) {
        launch(args);
    }

}
