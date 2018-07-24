package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Rectangles extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Rectangle r1 = new Rectangle(100,140);  // can specify x,y pos (xpos, ypos, w, h)
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.GREEN);

        Rectangle r2 = new Rectangle(100,140);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.BURLYWOOD);

        r2.setArcWidth(25);
        r2.setArcHeight(25);

        HBox hBox = new HBox(r1,r2);
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hBox, 400,200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Dave");
        primaryStage.show();



    }
}
