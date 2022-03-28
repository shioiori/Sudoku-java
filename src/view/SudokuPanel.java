package view;

import controller.CellFill;
import model.Data;
import model.Node;

import javax.swing.*;
import java.awt.*;

public class SudokuPanel extends JPanel{
    final static int CELL_SIZE = 30;
    public static Node[][] cells = new Node[9][9];
    public SudokuPanel(JFrame sudokuFrame){
        for (int i=0; i<9; ++i)
            for (int j=0; j<9; ++j){
                cells[i][j] = new Node(i,j,0);
                //System.out.println(cells[i][j].getX() + " " + cells[i][j].getY());
                cells[i][j].getButton().setSize(new Dimension(CELL_SIZE, CELL_SIZE));
                cells[i][j].getButton().setBackground(Color.WHITE);
                if (Data.defaultBoard[i][j] != 0) {
                    cells[i][j].setValue(Data.defaultBoard[i][j]);
                    cells[i][j].getButton().setEnabled(false);
                }
            else cells[i][j].getButton().addMouseListener(new CellFill(cells[i][j]));
            sudokuFrame.add(cells[i][j].getButton());
        }
        sudokuFrame.setLayout(new GridLayout(10,10));
    }
}
