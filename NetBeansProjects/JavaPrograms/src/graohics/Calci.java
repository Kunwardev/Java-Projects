package graohics;

import java.awt.event.*;
import javax.swing.*;

public class Calci extends JFrame implements ActionListener
{
    JButton bj1;
    JTextField jt1,jt2,jt3;
   
    Calci()
    {
        bj1 = new JButton("+");
        bj1.setBounds(20,50,20,20);
        add(bj1);
        jt1 = new JTextField(25);
        jt2 = new JTextField(25);
        jt3 = new JTextField(25);
        jt1.setBounds(20,80,20,40);
        jt2.setBounds(70,80,20,40);
        jt3.setBounds(120,80,40,40);
        add(jt1);
        add(jt2);
        add(jt3);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        bj1.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int m = Integer.parseInt(jt1.getText());
        int n = Integer.parseInt(jt2.getText());
        int o ;
        if(e.getSource() == bj1)
        {
            o = m+n;
            jt1.setText(o+"");
        }
    }
    
    public static void main(String[] args)
    {
        Calci c = new Calci();
    }
    
}
