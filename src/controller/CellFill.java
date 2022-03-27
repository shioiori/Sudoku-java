package controller;

import model.Node;

import javax.swing.*;
import java.awt.event.*;

public class CellFill implements MouseListener {
    Node node;

    CheckGame checkRule = new CheckGame();
    public CellFill(Node node){
        this.node = node;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        node.getButton().addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key > 57) key -= 48;
                switch (key){
                    case 49:
                        checkRule.validate(node,1);
                        break;
                    case 50:
                        checkRule.validate(node,2);
                        break;
                    case 51:
                        checkRule.validate(node,3);
                        break;
                    case 52:
                        checkRule.validate(node,4);
                        break;
                    case 53:
                        checkRule.validate(node,5);
                        break;
                    case 54:
                        checkRule.validate(node,6);
                        break;
                    case 55:
                        checkRule.validate(node,7);
                        break;
                    case 56:
                        checkRule.validate(node,8);
                        break;
                    case 57:
                        checkRule.validate(node,9);
                        break;
                }
                if (checkRule.validateGame()){
                    JFrame jFrame = new JFrame();
                    JOptionPane.showMessageDialog(jFrame,"You win!");
                }
            }
        });
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
