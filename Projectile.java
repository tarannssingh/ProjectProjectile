// The imports that will be used.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Projectile extends Rectangle {
    
    // These will be the constructor and general varaibles that will be use.
    double mySpeed;
    double myAngle;
    double myTravel;
    double xCompSpeed;
    double yCompSpeed;
    
    public Projectile (int xPos, int yPos, int width, int height, double speed, double angle)
    {
        super(xPos, yPos, width, height);
        mySpeed = speed;
        myAngle = angle;
    }

    public void translateSpeed()
    {
        
    }
}
