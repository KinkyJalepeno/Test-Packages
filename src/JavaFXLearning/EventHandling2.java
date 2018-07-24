package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EventHandling2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label lb = new Label("Type of event");

        Circle c1 = new Circle(100,300,75);
        c1.setFill(Color.BLUEVIOLET);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(2);

        TextField textField = new TextField();

        BorderPane bp = new BorderPane();
        bp.setTop(lb);
        bp.setBottom(textField);
        bp.setCenter(c1);

        Scene scene = new Scene(bp,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

        //Brackets in slightly different positions - both work ok
        c1.setOnMouseEntered((event)-> lb.setText("Mouse entered circle"));

        c1.setOnMouseExited((event -> lb.setText("Mouse exited the circle")));

        textField.setOnKeyPressed((event -> System.out.println("Key pressed = " + event.getText())));
    }
}
