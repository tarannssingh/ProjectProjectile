import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class ProjPanel extends JPanel implements ActionListener{


    
    //Projectile Stats
    static final int PROJ_X = 401;
    static final int PROJ_Y = 401;
    static final int PROJ_DIAMETER = 25;
    static final int PROJ_SPEED= 10;
    static final int PROJ_ANGLE = 45;
    Projectile proj;

    //Ground Stats    
    Ground ground;
    static final int GROUND_X = 0;
    static final int GROUND_Y = MainFrame.FRAME_HEIGHT - (int)(MainFrame.FRAME_HEIGHT/ 6.0) 
;
    static final int GROUND_WIDTH = MainFrame.FRAME_WIDTH;
    static final int GROUND_HEIGHT = (int)(MainFrame.FRAME_HEIGHT/ 6.0);
    
    Timer timer;


    public ProjPanel()
    {
        Border border = BorderFactory.createLineBorder(Color.black, 8, false);


        // This sets up the base of where the Projectile will be projected.
        this.setBackground(new Color(0x87CEEA));
        // setPreferredSize
        
        this.setBounds(0, (int)(MainFrame.FRAME_HEIGHT/ 6.0), MainFrame.FRAME_WIDTH, (int) ((MainFrame.FRAME_HEIGHT * 5/6.0)) - 25);
        this.setLayout(null); // Note to self - after learning about layout managers change if needed..
        this.setBorder(border);


        proj = new Projectile(PROJ_X, PROJ_Y, PROJ_DIAMETER, PROJ_DIAMETER, PROJ_ANGLE, PROJ_SPEED);
        ground = new Ground(GROUND_X, GROUND_Y, GROUND_WIDTH, GROUND_HEIGHT);

        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g)
    {
        // This just runs paint for the orgional painted things 
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        // can replace with a rectangle
        ground.paint(g2D);
        proj.paint(g2D);
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        if (proj.intersects(ground))
        {
            Projectile.xAcceleration = 0;
            Projectile.yAcceleration = 0;
            Projectile.xVelocity = 0;
            Projectile.yVelocity = 0; 
        } 
        proj.move();
           
        repaint();
    }


    
}
