// The imports that will be used.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;



public class MainFrame extends JFrame implements ActionListener{

    static final int FRAME_WIDTH = 1200;
    static final int FRAME_HEIGHT = (int)((5.0/9) * FRAME_WIDTH);
    
    //Projectile Stats
    static final int PROJ_DIAMETER = 25;
    static final int PROJ_VELOCITY = 10;
    static final int PROJ_ANGLE = 45;
    static final int 

    Timer timer;
    
    public MainFrame()
    {
        // Set up the frame, as well as the panels
        DashPanel dashboard = new DashPanel();
        ProjPanel projPanel = new ProjPanel();


        this.setTitle("Project Projectile");
        this.getContentPane().setBackground(new Color(0x87CEEA));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        // For now this allows us to manuall put the panels. 
        this.setLayout(null); // Note to self - after learning about layout managers change if needed.


        this.add(dashboard);
        this.add(projPanel);
        Projectile proj = new Projectile(PROJ_DIAMETER, PROJ_DIAMETER, )
        timer = new Timer(10, this);
        timer.start();



        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (projectile )
        {
            xVelocity *= -1;
        }    
        x += xVelocity;
        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0)
        {
            yVelocity *= -1;
        }    
        y += yVelocity;
        repaint();
    }
}