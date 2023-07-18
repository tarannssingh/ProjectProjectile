// The imports that will be used.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    static final int FRAME_WIDTH = 1200;
    static final int FRAME_HEIGHT = (int)((5.0/9) * FRAME_WIDTH);

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
        


        this.setVisible(true);
    }

}