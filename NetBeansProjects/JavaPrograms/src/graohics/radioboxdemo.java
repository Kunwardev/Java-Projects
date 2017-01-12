package graohics;

import java.awt.*;
import java.awt.event.*;

public class radioboxdemo extends Frame 
                          implements ItemListener
{
    CheckboxGroup cbg;
    Checkbox cb1,cb2,cb3;
    Color cl;
    radioboxdemo()
    {
        setLayout(null);
        
        cl= Color.RED;
        
        cbg = new CheckboxGroup();
        
        cb1 = new Checkbox("Red",true,cbg);
        cb2 = new Checkbox("Green",false,cbg);
        cb3 = new Checkbox("Blue",false,cbg);
        
        cb1.setBounds(20,50,100,30);
        cb2.setBounds(130,50,100,30);
        cb3.setBounds(240,50,100,30);
        
        add(cb1);
        add(cb2);
        add(cb3);
        
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        
        setVisible(true);
        setSize(400, 400);
        
    }

    public void paint(Graphics g)
    {
        g.setColor(cl);
        g.fillOval(50,100,100,100);
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==cb1)
        {
            cl = Color.RED;
            repaint();
        }
        else if(e.getSource()==cb2)
        {
            cl = Color.GREEN;
            repaint();
        }
        else
        {
            cl = Color.BLUE;
            repaint();
        }
    }
    
    public static void main(String args[])
    {
       radioboxdemo obj = new radioboxdemo();
    }
}
