package Practical;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Form extends JApplet {
  private JTextField t = new JTextField(15);
  private JTextField t1 = new JTextField(15);
  private ButtonGroup g = new ButtonGroup();
  private Checkbox cb1,cb2;
  private JRadioButton
    rb1 = new JRadioButton("Male", false),
    rb2 = new JRadioButton("Female", false),
    rb3 = new JRadioButton("TransGender", false);
  private ActionListener al = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if(((JRadioButton)e.getSource()).getText() == "Male")
        {
            t.setText("Name is "+t1.getText()+" and you are a "+
        ((JRadioButton)e.getSource()).getText()+"and color is Red");            
        }
        if(((JRadioButton)e.getSource()).getText() == "Female")
        {
            t.setText("Name is "+t1.getText()+" and you are a "+
        ((JRadioButton)e.getSource()).getText()+"and color is Red");            
        }
        if(((JRadioButton)e.getSource()).getText() == "TransGender")
        {
            t.setText("Name is "+t1.getText()+" and you are a "+
        ((JRadioButton)e.getSource()).getText()+"and color is Red");            
        }
      
    }
  };
  public void init() {
    rb1.addActionListener(al);
    rb2.addActionListener(al);
    rb3.addActionListener(al);
    cb1 = new Checkbox("Red");
    cb2 = new Checkbox("Blue");
    g.add(rb1); g.add(rb2); g.add(rb3);
    add(cb1);
    add(cb2);
    t.setEditable(false);
    t1.setEditable(true);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(t);
    cp.add(t1);
    cp.add(rb1);
    cp.add(rb2);
    cp.add(rb3);
  }
 }