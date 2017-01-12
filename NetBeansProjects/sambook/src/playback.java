import javax.swing.*;
import java.awt.*;

public class playback extends JFrame
{
    public playback()
    {
        setLook();
        FlowLayout n = new FlowLayout();
        setLayout(n);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        JButton play = new JButton("Play");
        JButton pause = new JButton("Pause");
        JButton stop = new JButton("Stop");
        add(stop);
        add(play);
        add(pause);
        JLabel page = new JLabel("Web Page Address: ",JLabel.RIGHT);
        JTextField tf = new JTextField(20);
        add(page);
        add(tf);
        setVisible(true);
    }
    private void setLook()
    {
        try{UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch(Exception e){}
    }
    public static void main(String[] args)
    {
        playback a = new playback();
    }
}