package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("Exit");

        SeparatorMenuItem menuItemSeparator = new SeparatorMenuItem();
        CustomMenuItem slider = new CustomMenuItem(new Slider());

        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, menuItemSeparator, exitMenuItem, slider);



        Menu webMenu = new Menu("Web");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
        htmlMenuItem.setSelected(true);

        CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
        cssMenuItem.setSelected(true);
        webMenu.getItems().addAll(htmlMenuItem,cssMenuItem);



        Menu sqlMenuItem = new Menu("SQL");
        RadioMenuItem mySqlItem = new RadioMenuItem("MySQL");
        RadioMenuItem oracleItem = new RadioMenuItem("Oracle");

        ToggleGroup toggleGroup = new ToggleGroup();
        mySqlItem.setToggleGroup(toggleGroup);
        oracleItem.setToggleGroup(toggleGroup);

        Menu tutorialMenu = new Menu("Tutorial");
        MenuItem m1 = new MenuItem("Java");
        MenuItem m2 = new MenuItem("JavaFX");
        MenuItem m3 = new MenuItem("Swing");
        tutorialMenu.getItems().addAll(m1,m2,m3);
        sqlMenuItem.getItems().addAll(mySqlItem,oracleItem,tutorialMenu);

        menuBar.getMenus().addAll(fileMenu, webMenu,sqlMenuItem);

        BorderPane pane = new BorderPane();
        pane.setTop(menuBar);

        Scene scene = new Scene(pane,300,400);

        primaryStage.setScene(scene);
        primaryStage.show();






    }
}
