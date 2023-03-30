package main;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    GamePanel gamePanel;
     GameWindow(){

        gamePanel = new GamePanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(gamePanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

}
