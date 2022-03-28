package model;

import controller.CheckGame;
import view.SudokuPanel;

import javax.swing.*;

public class Data {
    public static int [][] defaultBoard =  new int[][]{
            {0, 0, 0, 0, 5, 0, 1, 0, 7},
            {9, 0, 0, 0, 8, 6, 3, 4, 0},
            {4, 2, 7, 0, 0, 9, 0, 6, 8},
            {0, 0, 8, 2, 6, 0, 0, 0, 0},
            {7, 6, 4, 0, 3, 0, 2, 0, 9},
            {0, 3, 2, 0, 0, 4, 6, 8, 0},
            {8, 7, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 5, 1},
            {2, 0, 0, 0, 0, 8, 4, 7, 3}
    };
}
