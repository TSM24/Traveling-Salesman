package main;

public class Game implements Runnable{
     GameWindow gameWindow;
     GamePanel gamePanel;
     final int FPS_SET = 120;
     Thread gameThread ;
     Game(){
        GamePanel gamePanel =new GamePanel();
        GameWindow gameWindow =new GameWindow();
        gamePanel.requestFocus();
        startGameLoop();

    }
    private void startGameLoop(){
         gameThread = new Thread(this);
         gameThread.start();
    }

    @Override
    public void run() {

         double timePerFrame = 1000000000.0 / FPS_SET ;
         long LastFrame = System.nanoTime();
        long now = System.nanoTime();
        int freams=0;
        long lastcheck = System.currentTimeMillis();
         while (true){
             now = System.nanoTime();
             if(now - LastFrame >= timePerFrame){

                 //gamePanel.repaint();
                 LastFrame = now;
                 freams++;
             }


             if(System.currentTimeMillis() - lastcheck >= 1000){
                 lastcheck = System.currentTimeMillis();
                 System.out.println("FPS:" +freams);
                 freams=0;
             }

         }
    }
}
