package view;

import controller.CheckGame;

import javax.swing.*;

public class SudokuFrame {
    JFrame sudokuBoard;
    final static int WIDTH = 550, HEIGHT = 550;
    public SudokuFrame(){
        sudokuBoard = new JFrame("Sudoku");
        sudokuBoard.setSize(WIDTH, HEIGHT);
        sudokuBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sudokuBoard.setResizable(true);
        sudokuBoard.setLocationRelativeTo(null);
        SudokuPanel sudokuPanel = new SudokuPanel(sudokuBoard);
        sudokuBoard.add(sudokuPanel);
        sudokuBoard.setVisible(true);
    }
}
