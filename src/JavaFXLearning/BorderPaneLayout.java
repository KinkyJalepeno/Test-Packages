package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class BorderPaneLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("File");
        Button btn2 = new Button("Menu");
        Button btn3 = new Button("New");
        Button btn4 = new Button("Save");
        Button btn5 = new Button("Exit");

        HBox hBox = new HBox(btn1);
        hBox.setAlignment(Pos.CENTER);
        btn1.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(btn1, Priority.ALWAYS);

        BorderPane pane = new BorderPane();

        pane.setTop(hBox);

        pane.setCenter(btn2);
        pane.setBottom(btn3);
        pane.setLeft(btn4);
        pane.setRight(btn5);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
