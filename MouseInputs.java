package main;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener , MouseMotionListener {

    private GamePanel gamePanel ;
    MouseInputs(GamePanel gamePanel){
        this.gamePanel=gamePanel;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("lol");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("fuck");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        gamePanel.setRectpos(e.getX() , e.getY());

    }
}
