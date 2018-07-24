package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieChartExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        PieChart pieChart = new PieChart();
        PieChart.Data slice1 = new PieChart.Data("Destop", 213);
        PieChart.Data slice2 = new PieChart.Data("Phone",60);
        PieChart.Data slice3 = new PieChart.Data("Tablet",36);

        pieChart.getData().addAll(slice1,slice2,slice3);
        Scene scene = new Scene(pieChart, 400,400);

        primaryStage.setScene(scene);
        primaryStage.show();




    }
}
