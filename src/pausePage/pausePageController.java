package pausePage;

import application.App;
import game.Game;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class pausePageController implements Initializable {
    private static boolean isVisible = false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static boolean visibility() {
        return isVisible;
    }

    public static void hide() {
        isVisible = false;
    }

    public static void show() {
        isVisible = true;
    }

    public void playPressed(MouseEvent mouseEvent){
        hide();
    }

    public void restartPressed(MouseEvent mouseEvent){
        hide();
        Game newGame = App.getInstance().createNewGame();
        try {
            newGame.start(App.getStage());
        } catch (Exception e) {}
    }

    public void backPressed(MouseEvent mouseEvent){
        hide();
        try {
            App.getStage().setHeight(703);
            App.getStage().setWidth(665);
            App.getInstance().start(App.getStage());
        } catch (Exception e) {}

    }
    public void saveBtnPressed(MouseEvent mouseEvent){
        App.getInstance().saveCurrentGame();
        backPressed(mouseEvent);
    }
}
