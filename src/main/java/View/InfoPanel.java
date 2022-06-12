package View;

import Model.Civilization;
import Model.Tile;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class InfoPanel {
    public static Stage stage;
    public static Scene gameMenuScene;
    public Scene infoPanelScene;
    public static URL infoPanelURL;
    public static ArrayList<Tile> tiles;
    public static ArrayList<Civilization> civilizations;
    public static Civilization currentCivilization;

    public void start () throws IOException {
        BorderPane borderPane = FXMLLoader.load(infoPanelURL);
        infoPanelScene = new Scene(borderPane);
        stage.setScene(infoPanelScene);
        stage.show();
    }

    public void backClicked(MouseEvent mouseEvent) {
        stage.setScene(gameMenuScene);
    }

    public void exampleClicked(MouseEvent mouseEvent) throws IOException {
        ExamplePage.infoPanelScene = infoPanelScene;
        ExamplePage.stage = stage;
        new ExamplePage().start();
    }

    public void unitPanelClicked(MouseEvent mouseEvent) throws IOException {
        GeneralUnitPanel.infoPanelScene = infoPanelScene;
        GeneralUnitPanel.stage = stage;
        new GeneralUnitPanel().start();
    }

    public void victoryImprovementClicked(MouseEvent mouseEvent) throws IOException {
        VictoryImprovement.infoPanelScene = infoPanelScene;
        VictoryImprovement.stage = stage;
        new VictoryImprovement().start();
    }
}
