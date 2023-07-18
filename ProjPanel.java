import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ProjPanel extends JPanel implements ActionListener{

    public ProjPanel()
    {
        Border border = BorderFactory.createLineBorder(Color.black, 8, false);


        // This sets up the base of where the Projectile will be projected.
        this.setBackground(new Color(0x87CEEA));
        // setPreferredSize
        
        this.setBounds(0, (int)(MainFrame.FRAME_HEIGHT/ 6.0), MainFrame.FRAME_WIDTH, (int) ((MainFrame.FRAME_HEIGHT * 5/6.0)) - 25);
        this.setLayout(null); // Note to self - after learning about layout managers change if needed..
        this.setBorder(border);

    }

    public void paint (Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.red);
        Projectile.paint(g2D);
    

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


    
}
