import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ground extends Rectangle{

    public Ground(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }

    public void paint (Graphics g)
    {
        Graphics2D g2D = (Graphics2D)(g);
        g2D.setColor(Color.green);
        g2D.fillRect(x, y, width, height);
    }
    






}
