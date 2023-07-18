// The imports that will be used.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class ProjectPanel extends JPanel implements Runnable, ActionListener {
    
    // These are the general dimensions for what will be on screen;
    static final int PROJECT_WIDTH = 1500;
    static final int PROJECT_HEIGHT = (int)(PROJECT_WIDTH * (5.0/9));
    static final Dimension SCREEN_SIZE = new Dimension(PROJECT_WIDTH, PROJECT_HEIGHT);
  
  
    static final int FLOOR_WIDTH = PROJECT_WIDTH;
    static final int FLOOR_HEIGHT = 40;




    static final int PROJECTILE_DIAMETER = 10; 
    static final double PROJECTILE_SPEED = 10.0;
    static final double PROJECTILE_ANGLE = 45.0;

        
 
//Note to self - LOOK MORE INTO
    // This will be the time interval in which the the dotted path of the projectile will be made.
    static final int DELAY = 60;


    Projectile projectile;

    Thread gameThread;
    Image image;
    Graphics graphics;

    public ProjectPanel()
    {
        newProjectile();
        // This is the basic setup for the panel.
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(Color.white);
        this.setFocusable(true);

//  Note to self - Make this into a mouseListenr
        //        this.addKeyListener(new MyKeyListener());
        startProjectile();

        gameThread = new Thread(this);
        gameThread.start();
    }


    public void startProjectile()
    {
        
    }

    public void newProjectile()
    {
        projectile = new Projectile( 30,  30,  PROJECTILE_DIAMETER,  PROJECTILE_DIAMETER,  10,  45.0);
       // draw (projectile);
    }

    public void newGround()
    {
        
    }



    
    public void paint(Graphics g)
        {
        // This is responsible for making the overlay on the panel.
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);
    }
    public void draw(Graphics g)
    {
        // This is where all of the objects will be drawn.
    }
























    // This is a nested class
    //NOTE TO SELF - Planning to see if it is usable with mouse listenr

    public class AL extends mouseListener
    {

    }





    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


     // This is responsable for the frame rate of the game
    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");

    }


}

/* 

    

    public void paintComponent(Graphics g)
    {
        //through overiding, we want to make sure we retain the basic strucutre
        super.paintComponent(g);
        //and then we add this as to add our own spin to the GUI
        draw(g);
    }



    public void move()
    {
        // This is where all of the objects will move.
        
    }

    public void checkCollision()
    {
        // This is responsable for checking any collsions we may want to check.
    }
 
    */