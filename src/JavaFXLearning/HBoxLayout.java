package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");

        HBox hbox = new HBox(btn1, btn2, btn3);
        hbox.setSpacing(50);
        hbox.setPadding(new Insets(10, 10, 10, 50));

        /*
        I can also use hbox.setMargin(btn1, new Insets(10, 10, 10, 50));
         */

        Scene scene = new Scene(hbox, 500,200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
