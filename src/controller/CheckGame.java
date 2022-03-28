package controller;

import model.Node;
import view.SudokuPanel;

import javax.swing.*;
import java.awt.*;

public class CheckGame {
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
        node.getButton().setBackground(Color.WHITE);
    }

    public boolean validateGame(){
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                JButton button = SudokuPanel.cells[i][j].getButton();
                if (button.getBackground() != Color.WHITE || button.getText() == "") return false;
            }
        return true;
    }

}
