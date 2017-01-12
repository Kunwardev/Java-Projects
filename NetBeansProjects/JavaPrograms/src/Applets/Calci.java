
package Applets;

import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.*;

/*
<applet code = "Calci" width = 300 height = 300>
</applet>
*/

public class Calci extends Applet implements ActionListener
{
    String msg = "";
    Button bt1;
    TextField tf1,tf2,tf3;

    public void init()
    {
        setBackground(Color.red);
        bt1 = new Button("ADD");
        bt1.setBounds(20,50,30,30);
        tf1 = new TextField(25);
        tf1.setForeground(Color.BLUE);
        tf1.setBounds(20,100,50,30);
        tf2 = new TextField(25);
        tf2.setForeground(Color.BLUE);
        tf2.setBounds(20,140,50,30);
        tf3 = new TextField(25);
        tf3.setForeground(Color.BLUE);
        tf3.setBounds(20,180,50,30);
        add(bt1);
        add(tf1);
        add(tf2);
        add(tf3);
        bt1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c;
        if(e.getSource() == bt1)
        {
            System.out.println("Successful");
            c = a+b;
            tf3.setText(c+"");
        }
    }
    
}
