// The imports that will be used.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
javax.swing.Timer;


public class MainFrame extends JFrame implements ActionListener{

    static final int FRAME_WIDTH = 1200;
    static final int FRAME_HEIGHT = (int)((5.0/9) * FRAME_WIDTH);
    
    //Projectile Stats
    static final int PROJ_X = 400;
    static final int PROJ_Y = 400;
    static final int PROJ_DIAMETER = 25;
    static final int PROJ_SPEED= 10;
    static final int PROJ_ANGLE = 45;
    Projectile proj;

    //Ground Stats    
    Ground ground;
    static final int GROUND_X = 400;
    static final int GROUND_Y = 400;
    static final int GROUND_WIDTH = 25;
    static final int GROUND_HEIGHT = 25;


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
        proj = new Projectile(PROJ_X, PROJ_Y, PROJ_DIAMETER, PROJ_DIAMETER, PROJ_ANGLE, PROJ_SPEED);
        ground = new Ground(GROUND_X, GROUND_Y, GROUND_WIDTH, GROUND_HEIGHT);


        timer = new Timer(10, this);
        timer.start();



        this.setVisible(true);
    }

    public void paint(Graphics g)
    {
        // This just runs paint for the orgional painted things 
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        // can replace with a rectangle
        proj.paint(g2D);
        ground.paint(g2D);
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