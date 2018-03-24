import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartGame extends Application {

    Stage ChooseMode;
    Scene scene_ChooseMode, scene_LoadScreen, scene_certain;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        ChooseMode = primaryStage;

        // roots for each scene
        VBox root = new VBox(10);
        VBox load_screen_root = new VBox(10);
        VBox start_screen_root = new VBox(10);

        // Buttons for selection scene
        Button start_game = new Button("Start");
        start_game.setPrefSize(100, 20);

        Button load_game = new Button("Load");
        load_game.setPrefSize(100, 20);

        Button quit_game = new Button("Quit");
        quit_game.setPrefSize(100, 20);


        // Button for load scene
        Button Load_Game = new Button("Load Game");
        Load_Game.setPrefSize(100, 20);

        Button Return = new Button("Return");
        Return.setPrefSize(100, 20);
        // label for load scene
        Label load_label = new Label("Load game or return to main menu");

        // Buttons for if you're certain if you want to start the game
        Button yes_certain = new Button("Yes");
        yes_certain.setPrefSize(100, 20);

        Button no_certain = new Button("No");
        no_certain.setPrefSize(100, 20);
        //label for certain scene
        Label certain_label = new Label("Are you certain you want to start the game?");

        // scenes
        scene_ChooseMode = new Scene(root, 300, 200);
        scene_LoadScreen = new Scene(load_screen_root, 300, 200);
        scene_certain = new Scene(start_screen_root, 300, 200);

        // Top borderpane for scene selection
        BorderPane border = new BorderPane();
        HBox hbox = addHBox();
        border.setTop(hbox);

        // Root for main scene
        root.getChildren().addAll(border, start_game, load_game, quit_game);
        root.setAlignment(Pos.CENTER);

        // Root for load scene
        load_screen_root.getChildren().addAll(load_label, Load_Game, Return);
        load_screen_root.setAlignment(Pos.CENTER);

        // Root for certain scene
        start_screen_root.getChildren().addAll(certain_label, yes_certain, no_certain);
        start_screen_root.setAlignment(Pos.CENTER);

        //event keys on load screen
        Return.setOnAction(event ->
            ChooseMode.setScene(scene_ChooseMode)
        );

        //event keys on selection screen
        load_game.setOnAction(event ->
            ChooseMode.setScene(scene_LoadScreen)
        );

        start_game.setOnAction(event ->
            ChooseMode.setScene(scene_certain)
        );

        quit_game.setOnAction(event ->
            ChooseMode.close()
        );

        // eventkeys for certain scene
        yes_certain.setOnAction(event ->
            Fullscreen.display("Kingdoms of War")
        );
        no_certain.setOnAction(event ->
            ChooseMode.setScene(scene_ChooseMode)
        );

        ChooseMode.setScene(scene_ChooseMode);
        ChooseMode.setTitle("Kingdoms of War");
        ChooseMode.show();
    }
    private HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #336699;");

        Label hbox_label = new Label("Welcome to Kingdoms of War!");

        hbox.getChildren().addAll(hbox_label);
        hbox.setAlignment(Pos.CENTER);

        return hbox;
    }
}
