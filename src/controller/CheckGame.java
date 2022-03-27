package controller;

import model.Data;
import model.Node;
import view.SudokuPanel;

import java.awt.*;

public class CheckGame {
    public int emptyNode = 0;
    public int fillNode = 0;

    public CheckGame(){
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j)
                if (Data.defaultBoard[i][j] == 0) emptyNode++;
    }

    public void validate(Node node, int value){
        node.setValue(value);
        int row = node.getX();
        int col = node.getY();
        for (int i = 0; i < 9; ++i)
            if (i != col && SudokuPanel.cells[row][i].getValue() == value) {
                node.getButton().setBackground(Color.PINK);
                return;
            }
        for (int i = 0; i < 9; ++i)
            if (i != row && SudokuPanel.cells[i][col].getValue() == value) {
                node.getButton().setBackground(Color.PINK);
                return;
            }
        int dr = row / 3 * 3, dc = col / 3 * 3;
        for (int i = dr; i < dr + 3; ++i)
            for (int j = dc; j < dc + 3; ++j)
                if (i != row && j != col && SudokuPanel.cells[i][j].getValue() == value) {
                    node.getButton().setBackground(Color.PINK);
                    return;
                }
        fillNode++;
        node.getButton().setBackground(Color.WHITE);
    }

    public boolean validateGame(){
        if (emptyNode == fillNode) return true;
        return false;
    }

}
