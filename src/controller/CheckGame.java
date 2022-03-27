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
        fillNode++;
        node.getButton().setBackground(Color.WHITE);
    }

    public boolean validateGame(){
        if (emptyNode == fillNode) return true;
        return false;
    }

}
