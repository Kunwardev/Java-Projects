package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "ToggleButton" width = 10 height = 80>
</applet>
*/

public class ToggleButton extends JApplet
{
    JLabel lb;
    JToggleButton tb;
    public void init()
    {
        try{
            SwingUtilities.invokeAndWait(new Runnable(){
            public void run()
            {makeGUI();
            }
            });
            
        }catch(Exception e){}
    }
    private void makeGUI()
    {
        setLayout(new FlowLayout());
        lb = new JLabel("Button is OFF");
        tb = new JToggleButton("ON/OFF");
        tb.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ie)
            {
                if(tb.isSelected())
                {
                    lb.setText("Button is ON");
                }
                else
                    lb.setText("Button is OFF");
            }
        });
        add(lb);
        add(tb);
    }
}
