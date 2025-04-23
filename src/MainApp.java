import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

    public class MainApp extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("wordApp.fxml"));
            AnchorPane root = loader.load();

            // Set the scene and stage
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Tweetable Text Checker");
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }


}
