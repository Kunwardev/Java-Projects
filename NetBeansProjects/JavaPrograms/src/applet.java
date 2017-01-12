import java.applet.Applet;
import java.awt.Graphics;

public class applet extends Applet
{
    public void init(){
    repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello World", 50, 25);
    }
}
