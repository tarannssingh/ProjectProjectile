import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ground {

    static final int x = 400;
    static final int y = 400;
    static final int GROUND_WIDTH = 25;
    static final int GROUND_HEIGHT = 25;

    public Ground()
    {

    }

    public static void paint (Graphics g)
    {
        Graphics2D g2D = (Graphics2D)(g);
        g2D.setColor(Color.green);
        g2D.fillRect(x, y, GROUND_WIDTH, GROUND_HEIGHT);
    }
    






}
