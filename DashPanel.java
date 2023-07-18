// Imports
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class DashPanel extends JPanel{
    

    public DashPanel()
    {
    

        Border border = BorderFactory.createLineBorder(Color.black, 4, false);

        // This sets up the base of the Control Panel
        this.setBackground(Color.gray);
        this.setBounds(0, 0, MainFrame.FRAME_WIDTH, (int)(MainFrame.FRAME_HEIGHT/ 6.0));
        this.setLayout(null); // Note to self - after learning about layout managers change if needed.
        this.setBorder(border);
    }
}
