package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class multiLines extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group group = new Group();
        for (int i = 0; i<800; i+=10){

            // Line (start x, Start Y, end X, end Y)
            Line line = new Line(i,0,i,800); //vertical lines
            line.setStroke(Color.LIGHTGRAY);

            Line line2 = new Line(0,i,800,i); //Horizontal lines
            line2.setStroke(Color.LIGHTGRAY);
            group.getChildren().addAll(line,line2);
        }

        Scene scene = new Scene(group,800,800);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
