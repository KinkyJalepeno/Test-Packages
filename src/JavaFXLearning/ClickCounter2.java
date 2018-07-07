package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("Click Me");

        Label label = new Label();
        label.setText("You have not clicked the button !");

        // controls need a layout pane (bordepane)
        BorderPane bp = new BorderPane();

        // add controls to border pane
        bp.setTop(label); // label set to top
        bp.setCenter(btn); // btn set to centre

        // instantiate scene
        Scene scene = new Scene(bp, 250, 150);
        primaryStage.setScene(scene); // add scene to primary stage
        primaryStage.show();

    }
}
