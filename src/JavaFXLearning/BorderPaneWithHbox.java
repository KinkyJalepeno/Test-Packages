package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneWithHbox extends Application {



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

        BorderPane pane = new BorderPane();

        HBox hBox1 = new HBox(btn1, btn2, btn3);
        hBox1.setSpacing(20);
        hBox1.setPadding(new Insets(10));

        HBox hBox2 =  new HBox(btn4, btn5);
        hBox2.setSpacing(20);
        hBox2.setPadding(new Insets(10));

        pane.setTop(hBox1);
        pane.setBottom(hBox2);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
