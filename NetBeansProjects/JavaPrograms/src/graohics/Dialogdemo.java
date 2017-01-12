package graohics;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Dialogdemo extends JFrame implements ActionListener,FocusListener
{
    JButton bt1,bt2,bt3;
    Dialogdemo()
    {
        setVisible(true);
        setLayout(null);
        setSize(400,400);
        bt1 = new JButton("Information");
        bt2 = new JButton("Confirmation");
        bt3 = new JButton("Input");
        bt1.setBounds(20, 50, 200, 30);
        bt2.setBounds(20, 100, 200, 30);
        bt3.setBounds(20, 150, 200, 30);
        add(bt1);
        add(bt2);
        add(bt3);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt1.addFocusListener(this);
        bt2.addFocusListener(this);
        bt3.addFocusListener(this);
    }
    public static void main(String[] args) {
        Dialogdemo obj =new Dialogdemo();
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==bt1)
        {
            JOptionPane.showMessageDialog(this, "Hello This is Information Dialog Box");
        }
        else if(e.getSource()==bt2)
        {
            int n = JOptionPane.showConfirmDialog(this, "Is your name Dev ","What is Your name ? ", JOptionPane.YES_NO_CANCEL_OPTION);
            if(n == JOptionPane.YES_OPTION)
            {
                System.out.println("Yes Pressed");
            }
            else if(n == JOptionPane.NO_OPTION)
            {
                System.out.println("No Pressed");
            }
            else
            {
                System.out.println("Cancel Pressed");
            }
        }
        else
        {
            String name = JOptionPane.showInputDialog("Enter Your name");
            System.out.println("Name Input : "+name);
        }

    }

    public void focusGained(FocusEvent e) 
    {
        if(e.getSource()==bt1)
        {
            bt1.setBackground(Color.CYAN);
        }
        if(e.getSource()==bt2)
        {
            bt2.setBackground(Color.CYAN);
        }
        if(e.getSource()==bt3)
        {
            bt3.setBackground(Color.CYAN);
        }
    }

    public void focusLost(FocusEvent e) {
        if(e.getSource()==bt1)
        {
            bt1.setBackground(Color.RED);
        }
        if(e.getSource()==bt2)
        {
            bt2.setBackground(Color.RED);
        }
        if(e.getSource()==bt3)
        {
            bt3.setBackground(Color.RED);
        }
    }
}
