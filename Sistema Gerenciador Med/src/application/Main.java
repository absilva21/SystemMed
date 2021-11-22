package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.MainModel;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	static Stage aux;
	static Stage atm;
	static MainModel main;
	@Override
	public void start(Stage primaryStage) {
	
		Stage a = new Stage();
		MainModel m = new MainModel();
		main = m;
		atm = a;
		aux = primaryStage;
		try {
			AnchorPane sec = (AnchorPane)FXMLLoader.load(getClass().getResource("ATM.fxml"));
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			Scene secScene = new Scene(sec,800,600);
			a.setScene(secScene);
			a.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
