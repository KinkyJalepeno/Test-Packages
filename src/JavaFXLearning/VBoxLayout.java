package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("The Button 3");

        VBox vBox = new VBox(20, btn1, btn2, btn3);
        vBox.setPadding(new Insets(20));
        /*
        Can also do the below
        vBox.getChildren().addAll(btn1, btn2, btn3);
        */
        vBox.setAlignment(Pos.CENTER); //Centres buttons in the scene
        btn1.setMaxWidth(Double.MAX_VALUE); //Next 3 lines makes buttons same width despite text inside
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);

        Scene scene = new Scene(vBox, 250, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Dave is a Hunk");
        primaryStage.show();

    }
}
