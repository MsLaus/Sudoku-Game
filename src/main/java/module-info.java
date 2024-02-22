module com.example.sudokugame {
    requires javafx.controls;
    requires javafx.fxml;


    opens SudokuGame to javafx.fxml;
    exports SudokuGame;
    exports SudokuGame.ProblemDomaine;
    opens SudokuGame.ProblemDomaine to javafx.fxml;
}