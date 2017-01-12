
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Frame;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class NewClass extends Frame
{
    Label lb;
    BufferedImage img;
    ScrollPane sp;
    NewClass() throws IOException
    {
        lb = new Label();
        sp = new ScrollPane();
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        add(lb);
        sp.setBounds(20,50,150,50);
        lb.setText();
        add(sp);
        sp.add(lb);
        img = ImageIO.read(new File("F:\\andried video tutorials\\0.jpg"));
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing()
            {
                dispose();
            }
});
    }
    
    public static void main(String[] args)throws IOException
    {
        NewClass obj = new NewClass();
    }
    
}
