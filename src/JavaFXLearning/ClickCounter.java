package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {

    private int count = 0;
    private Label label = new Label("Count: " + count);


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button b1 = new Button("Click Me");

        // This is where you detect a button press and call a method
        b1.setOnAction((event) -> incrementCounter());

        BorderPane bp = new BorderPane();
        bp.setCenter(b1);
        bp.setBottom(label);

        Scene scene = new Scene(bp,300,300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void incrementCounter() {

        count++;
        label.setText("Count:" + count);

    }
}
