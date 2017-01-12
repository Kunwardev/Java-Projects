package Applets;

import java.awt.event.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code = "Banner" width = 200 height = 300>
<align = BOTTOM>
</applet>
*/


public class Banner extends Applet implements Runnable
{
    String msg = " Moving Banner ";
    Thread t = null;
    public void init()
    {
        setBackground(Color.red);
        setForeground(Color.BLUE);
    }
    public void start()
    {
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        for(;;)
        {
            try{
                repaint();
            Thread.sleep(250);
            char c = msg.charAt(0);
            msg = msg.substring(1,msg.length());
            msg+=c;
            }catch(Exception e){}
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,10,30);
    }
   public void actionPerformed(ActionEvent e)
    {
    }
    
}
