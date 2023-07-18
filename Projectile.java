import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Math;

public class Projectile extends Rectangle
{
    static double xVelocity;
    static double yVelocity;
    static double xAcceleration = 0;
    static double yAcceleration = -.0098; // This number is based on the timer 
    

    public Projectile (int xPos, int yPos, int width, int height, double angle, double magnitude)
    {
        super (xPos, yPos, width, height);

        //DO math to get x and y compoenet 
        angle = angle * 2 * Math.PI / 360;  // Example angle in radians (45 degrees)
        xVelocity = magnitude * Math.cos(angle);
        yVelocity = magnitude * Math.sin(angle);
    }

    // public void setXVelocity(double xAcceleration)
    // {
    // }

    // public void setYVelocity(double yAcceleration)
    // {
    // }

    public void move()
    {
        xVelocity += xAcceleration;
        yVelocity += yAcceleration;
        x += xVelocity;
        y += yVelocity;
 
    }

    public void paint (Graphics g)
    {
        Graphics2D g2D = (Graphics2D)(g);
        g2D.setColor(Color.red);
        g2D.fillOval(x, y, width, height);
    }



    
}

 

