package JavaFXLearning;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {

    int count = 1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button b1 = new Button("Click Me");

        b1.setOnAction((event) -> incrementCounter());

        /*
        Old way of doing event handling

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("count = " + count);
                count ++;
            }
        });
        */

        BorderPane bp = new BorderPane();
        bp.setCenter(b1);

        Scene scene = new Scene(bp,300,300);

        primaryStage.setScene(scene);
        primaryStage.show();



    }

    private void incrementCounter() {

        System.out.println("count = " + count);
        count++;

    }
}
