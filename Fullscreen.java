import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Fullscreen extends StartGame{

    private BarChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;

    public static void display(String title) {

        Stage window1 = new Stage();
        window1.initModality(Modality.APPLICATION_MODAL);

        window1.setTitle(title);
        window1.setFullScreen(true);

        Button Building = new Button("Building");
        Building.setPrefSize(100, 20);

        Button End_Turn = new Button("End Turn");
        End_Turn.setPrefSize(100,20);

        Button Armory = new Button("Armory");
        Armory.setPrefSize(100, 20);



        HBox root = new HBox(20);

        root.getChildren().addAll(Building, Armory, End_Turn);

        root.setAlignment(Pos.BOTTOM_LEFT);

        Scene scene = new Scene(root);

        window1.setScene(scene);
        window1.show();
    }
}
