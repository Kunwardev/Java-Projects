package graohics;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
{    
    TextField tf1,tf2,tf3;
    Button bt1,bt2,bt3,bt4;
    Calculator()
    {
        tf1 = new TextField(25);
        tf2 = new TextField(25);
        tf3 = new TextField(25);
        bt1 = new Button("+");
        bt2 = new Button("-");
        bt3 = new Button("*");
        bt4 = new Button("/");
        tf1.setBounds(20,50,40,20);
        tf2.setBounds(70,50,40,20);
        tf3.setBounds(120,50,40,20);
        tf3.setEnabled(false);
        add(tf1);
        add(tf2);
        add(tf3);
        bt1.setBounds(40,90,20,20);
        bt2.setBounds(70,90,20,20);
        bt3.setBounds(100,90,20,20);
        bt4.setBounds(130,90,20,20);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
   
    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(tf1.getText());
        int m = Integer.parseInt(tf2.getText());
        int o;
        if(e.getSource()==bt1)
        {
            o = m+n;
            tf3.setText(o+"");
        }
        if(e.getSource()==bt2)
        {
            o = n-m;
            tf3.setText(o+"");
        }
        if(e.getSource()==bt3)
        {
            o = m*n;
            tf3.setText(o+"");
        }
        if(e.getSource()==bt4)
        {
            o = n/m;
            tf3.setText(o+"");
        }
    }
}
