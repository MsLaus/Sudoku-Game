package SudokuGame.ProblemDomaine;

import java.io.IOException;

public interface IStorage {

    void updateGameData(SudokuGame gameData) throws IOException;
    SudokuGame getGameData() throws IOException;

}
