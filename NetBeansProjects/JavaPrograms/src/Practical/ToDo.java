
package Practical;

import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/*
<applet code = "Form" width = 600 height = 400>
</applet>
*/

public class ToDo extends Applet implements ActionListener,ItemListener
{
    JTextField jt1,jt2;
    JButton bj1;
   // CheckBox rj1,rj2;
    
    
    public void init()
    {
        jt1 = new JTextField(25);
        jt2 = new JTextField(25);
        bj1 = new JButton("Submit");
        jt1.setBounds(20,50,100,30);
        jt1.setText("Enter Name");
       
        add(jt1);
    }

    public void actionPerformed(ActionEvent e)
    {
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
