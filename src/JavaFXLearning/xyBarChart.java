package JavaFXLearning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class xyBarChart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Devices");;

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visits");

        BarChart barChart = new BarChart(xAxis, yAxis);

        // Add data
        XYChart.Series dataSet = new XYChart.Series();
        dataSet.setName("2018");

        dataSet.getData().add(new XYChart.Data<>("Desktop", 178));
        dataSet.getData().add(new XYChart.Data<>("Phone", 50));
        dataSet.getData().add(new XYChart.Data<>("Tablet", 90));

        barChart.getData().add(dataSet);

        Scene scene = new Scene(barChart, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

        // ScatterChart, LineChart and AreaChart are made in exact same way but both X & Y axis
        // are NumberAxis types.

    }
}
