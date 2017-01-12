package graohics;

import java.awt.*;
import java.awt.event.*;

public class Checkboxdemo extends Frame implements ItemListener
{
    Label tf1,tf2;
    Checkbox cb1,cb2;
    Checkboxdemo()
    {
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        tf1 = new Label("Hello");
        tf2= new Label("World");
        tf1.setBounds(20,50,100,30);
        tf2.setBounds(130,50,100,30);
        cb1 = new Checkbox("Red");
        cb2 = new Checkbox("Green");
        cb1.setBounds(20,110,40,30);
        cb2.setBounds(100,110,50,30);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        add(tf1);
        add(tf2);
        add(cb1);
        add(cb2);
    }
    public static void main(String[] args) {
        Checkboxdemo obj =new Checkboxdemo();
    }

   
    public void itemStateChanged(ItemEvent e) {
        if(e.getItemSelectable()== cb1)
        {

            tf1.setText("Red Selected");
        }
        else
        {
            tf2.setText("Green Selected");
        }
    }
}
