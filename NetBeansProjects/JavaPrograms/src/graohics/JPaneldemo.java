package graohics;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JPaneldemo extends JFrame implements ActionListener
{
    JPanel jp;
    JTextField tf1,tf2,tf3;
    JButton bt1,bt2;
    JPaneldemo()
    {
        bt1 = new JButton("SHOW");
        bt2 = new JButton("HIDE");
        jp = new JPanel();
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);
        jp.add(tf1);
        jp.add(tf2);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        jp.add(tf3);
        jp.setBounds(20,50,200,200);
        jp.setBackground(Color.RED);
        bt1.setBounds(20,240,100,30);
        bt2.setBounds(130,240,100,30);
        add(bt1);
        add(bt2);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        add(jp);

    }
    public static void main(String[] args) {
        JPaneldemo obj = new JPaneldemo();
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == bt1)
        {
            jp.setVisible(true);
        }
        else if(e.getSource() == bt2)
        {
            jp.setVisible(false);
        }
    }
}
