package JavaFXLearning;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();

        Label dobLabel = new Label("Date of Birth");
        DatePicker datePicker = new DatePicker();

        Label genderLabel = new Label("Gender");
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("Male");
        RadioButton femaleRadio = new RadioButton("female");
        maleRadio.setToggleGroup(genderGroup);
        femaleRadio.setToggleGroup(genderGroup);

        Label technologies = new Label("Platforms Known");
        CheckBox java = new CheckBox("Java");
        CheckBox dotNet = new CheckBox(".Net");

        Label educationLabel = new Label("Degree Gained");
        ListView educationList = new ListView<>();

        educationList.getItems().add("Engineering");
        educationList.getItems().add("MCA");
        educationList.getItems().add("MCB");
        educationList.getItems().add("Eating chicken wings");

        Label locationLabel = new Label("Location");
        ChoiceBox locationChoiceBox = new ChoiceBox();
        locationChoiceBox.getItems().addAll("USA", "UK", "China", "Russia");
        locationChoiceBox.setValue("USA");

        Button registerButton = new Button("Register");


        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500,500);
        gridPane.setPadding(new Insets(10,10,15,15));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(nameLabel,0,0);
        gridPane.add(nameField,1,0);

        gridPane.add(dobLabel,0,1);
        gridPane.add(datePicker,1,1);

        gridPane.add(genderLabel,0,2);
        gridPane.add(maleRadio,1,2);
        gridPane.add(femaleRadio,2,2);

        gridPane.add(technologies,0,3);
        gridPane.add(java,1,3);
        gridPane.add(dotNet,2,3);

        gridPane.add(educationLabel,0,4);
        gridPane.add(educationList,1,4);

        gridPane.add(locationLabel,0,5);
        gridPane.add(locationChoiceBox,1,5);

        gridPane.add(registerButton,2,6);


        Scene scene = new Scene(gridPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration Form");
        primaryStage.show();

    }
}
