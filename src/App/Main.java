package App;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Views/telaPricipal.fxml"));
        primaryStage.setTitle("Hello World");

        primaryStage.setScene(new Scene(root, 1300, 600));

        primaryStage.show();






    }


    public static void main(String[] args) {
        launch(args);
    }
}
