
package Test;

import java.awt.*;
import javax.swing.JFrame;

public class CanvasExample extends Canvas
{
    public void paint(Graphics g)
    {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("C:\\Users\\Kunwar\\Downloads\\bugs.jpg");
        g.drawImage(i, 10, 10, this);
    }
    
    public static void main(String[] args)
    {
        CanvasExample c = new CanvasExample();
        JFrame f = new JFrame("Canvas Example");
        f.add(c);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
