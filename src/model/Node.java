package model;

import javax.swing.*;
import java.awt.*;

public class Node {
    int x, y, value;
    JButton button;
    public Node(){
        button = new JButton();
        button.setFocusPainted(false);
        value = 0;
    }

    public Node(int x, int y, int value){
        super();
        this.x = x;
        this.y = y;
        this.value = value;
        button = new JButton();
        button.setFocusPainted(false);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setValue(int value) {
        this.value = value;
        button.setText(Integer.toString(value));
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public boolean isEmpty(){
        if (value == 0) return true;
        return false;
    }
}
