package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class NodeDynamicResize extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");

        Region spacer = new Region();
        Region spacer2 = new Region();

        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox.setHgrow(spacer2, Priority.ALWAYS);

        HBox hbox = new HBox(btn1, spacer, btn2, spacer2, btn3);


        hbox.setMargin(btn1, new Insets(10));
        hbox.setMargin(btn2, new Insets(10));
        hbox.setMargin(btn3, new Insets(10));

        Scene scene = new Scene(hbox, 500,200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
