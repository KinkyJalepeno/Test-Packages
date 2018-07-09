package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label email = new Label("EMail");
        Label passWord = new Label("Password");

        TextField textField1 = new TextField();
        PasswordField passwordField = new PasswordField();

        Button btn1 = new Button("Submit");
        Button btn2 = new Button("Clear");

        GridPane pane = new GridPane();
        pane.setMinSize(300,150);
        //pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(15));
        pane.setHgap(15);
        pane.setVgap(15);

        pane.add(email, 0 ,0);
        pane.add(textField1, 1,0);

        pane.add(passWord, 0,1);
        pane.add(passwordField, 1, 1);

        pane.add(btn1, 0,2);
        pane.add(btn2, 1,2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
