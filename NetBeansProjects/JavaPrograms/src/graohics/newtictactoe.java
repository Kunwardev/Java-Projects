package graohics;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.*;
import java.awt.event.*;

public class newtictactoe extends JFrame implements ActionListener
{
    String x ="X";
    JApplet ja;
    JLabel tf1,tf2,tf3,tf4;
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    String a = JOptionPane.showInputDialog(this,"Enter your name: ");
    String b = JOptionPane.showInputDialog(this,"Enter your name: ");
      
    newtictactoe()
    {
        int counta=0,countb=0;
        tf1 = new JLabel(a);
        //tf2 = new JLabel("");
        tf3 = new JLabel("Score of " +a+": "+counta);
        tf4 = new JLabel("Score of " +b+": "+countb);
        tf3.setBounds(300,50,100,30);
        tf4.setBounds(300,100,100,30);
        //tf1.setForeground(Color.RED);
        //tf2.setForeground(Color.BLUE);
        tf1.setBounds(20,300,100,30);
//        tf2.setBounds(20,350,100,30);
        //tf1.setEnabled(false);
        //tf2.setEnabled(false);
        bt1= new JButton("");
        bt2= new JButton("");
        bt3= new JButton("");
        bt4= new JButton("");
        bt5= new JButton("");
        bt6= new JButton("");
        bt7= new JButton("");
        bt8= new JButton("");
        bt9= new JButton("");
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        ja = new JApplet();
        ja.add(bt1);
        ja.add(bt2);
        ja.add(bt3);
        ja.add(bt4);
        ja.add(bt5);
        ja.add(bt6);
        ja.add(bt7);
        ja.add(bt8);
        ja.add(bt9);
        ja.setLayout(new GridLayout(3, 3));
        ja.setVisible(true);
        ja.setBounds(20,50,200,200);
        add(ja);
        add(tf1);
        //add(tf2);
        add(tf3);
        add(tf4);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args)
    {
       newtictactoe ob = new newtictactoe();
       
    }
int count =0;
    public void actionPerformed(ActionEvent e)
    {
       
        if(e.getSource()==bt1)
        {
             turn();
            bt1.setText(x);
            click();
            bt1.setEnabled(false);
        count ++;
        check();
        }
        if(e.getSource()==bt2)
        {
                 turn();
            bt2.setText(x);
            click();
            bt2.setEnabled(false);
       count ++;
       check();
        }
        if(e.getSource()==bt3)
        {
            turn();
            bt3.setText(x);
            click();
            bt3.setEnabled(false);
        count ++;
        check();
        }
        if(e.getSource()==bt4)
        {
               turn();
            bt4.setText(x);
            click();
            bt4.setEnabled(false);
        count ++;
        check();
        }
        if(e.getSource()==bt5)
        {
            turn();
            bt5.setText(x);
            click();
            bt5.setEnabled(false);
        count ++;
        check();
        }
        if(e.getSource()==bt6)
        {
            turn();
            bt6.setText(x);
            click();
            bt6.setEnabled(false);
        count ++;
        check();
        }
        if(e.getSource()==bt7)
        {
             turn();
            bt7.setText(x);
            click();
            bt7.setEnabled(false);
        count ++;
        check();
        }
        if(e.getSource()==bt8)
        {
             turn();
            bt8.setText(x);
            click();
            bt8.setEnabled(false);
        count ++; 
        check();
        }
        if(e.getSource()==bt9)
        {
            turn();
            bt9.setText(x);
            click();
            bt9.setEnabled(false);
        count ++;    
        check();
        }
        
    }
    
    public void check()
    {
        if(count == 9)
        {
            int p = JOptionPane.showConfirmDialog(this,"Want to Play Again ");
        }
        if(p==JOptionPane.YES_OPTION)
        {
            
        }
    }
    
    int turn = 0;
    public void turn()
    {
        if(turn ==0)
        {
            tf1.setText(b);
            turn = 1;
            //tf2.setText("");
        }
        else
        {
            tf1.setText(a);
            turn =0;
            //tf1.setText("");
        }
    }
    public void click()
    {
        if(x == "X")
        {
            x = "O";
        }
        else
            x = "X";
    }
}
