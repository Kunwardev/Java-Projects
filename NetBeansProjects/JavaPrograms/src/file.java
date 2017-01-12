
import javax.swing.*;

public class file extends JFrame
{
    JFileChooser fp;
    file()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        fp = new JFileChooser("c:\\");
        fp.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        add(fp);
    }
    public static void main(String[] args)
    {
        file f = new file();
    }
    
}
