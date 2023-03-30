package main;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;


public class GamePanel  extends JPanel {

    Image image ;
    float xDelta=100 , yDelta =100;
    private int freams=0 ;
    private long lastcheck=0;
    public MouseInputs mouseInputs;
     GamePanel(){
         image =new ImageIcon("player_sprites.png").getImage();
         this.setPreferredSize(new Dimension(1200,800));
         mouseInputs = new MouseInputs(this);
        //addKeyListener(keyboard);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }



    public void setRectpos(int x , int y){
         this.xDelta = x ;
         this.yDelta = y ;

    }

    public void paint(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,(int) xDelta,(int) yDelta,400,400,null);
        repaint();

    }

}
