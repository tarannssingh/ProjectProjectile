// The imports that will be used.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class ProjectFrame extends JFrame {
    
    public ProjectFrame()
    {
        // Here, we set will set up the Frame.
        ProjectPanel panel = new ProjectPanel();
        this.add(panel);
        this.setTitle("Project Projectile");
        this.setResizable(true);
        this.setBackground(Color.blue);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
