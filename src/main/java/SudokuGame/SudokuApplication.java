package SudokuGame;

import SudokuGame.UserInterface.IUserInterfaceContract;
import SudokuGame.UserInterface.UserInterfaceImpl;
import SudokuGame.buildLogic.SudokuBuildLogic;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {

    private IUserInterfaceContract.View uiImpl;
    @Override
    public void start(Stage stage) throws IOException {

        uiImpl = new UserInterfaceImpl(stage);
        try {
            SudokuBuildLogic.build(uiImpl);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}