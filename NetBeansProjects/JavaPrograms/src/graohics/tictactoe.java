package graohics;

import java.awt.*;
import java.awt.event.*;

public class tictactoe extends Frame implements ActionListener
{
    int count =0;
     String x = "X";
        String y = "O";
        String z = "";
    
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    TextField tf1;
    tictactoe()
    {
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        bt1 = new Button("");
        bt2 = new Button("");
        bt3 = new Button("");
        bt4 = new Button("");
        bt5 = new Button("");
        bt6 = new Button("");
        bt7 = new Button("");
        bt8 = new Button("");
        bt9 = new Button("");
        bt10 = new Button("Play Again");
      
        bt1.setBounds(20,50,30,30);
        //bt1.setBackground(Color.red);
        bt2.setBounds(20,80,30,30);
        bt3.setBounds(20,110,30,30);
        bt4.setBounds(50,50,30,30);
        bt5.setBounds(50,80,30,30);
        bt6.setBounds(50,110,30,30);
        bt7.setBounds(80,50,30,30);
        bt8.setBounds(80,80,30,30);
        bt9.setBounds(80,110,30,30);
        bt10.setBounds(160,180,100,30);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        add(bt10);
        
        tf1 = new TextField(25);
        tf1.setBounds(150,150,200,30);
        add(tf1);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        tictactoe obj = new tictactoe();
    }
    
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==bt1)
        {
            rec(x);
            bt1.setLabel(x);
            bt1.setEnabled(false);count++;
            win();
        }
        if(e.getSource()==bt2)
        {
            rec(x);
            bt2.setLabel(x);
            bt2.setEnabled(false);count++;
win();
        }
        if(e.getSource()==bt3)
        {
            rec(x);
            bt3.setLabel(x);
            bt3.setEnabled(false);count++;
     win();   }
        if(e.getSource()==bt4)
        {
            rec(x);
            bt4.setLabel(x);
            bt4.setEnabled(false);count++;
win();}
        if(e.getSource()==bt5)
        {
            rec(x);
            bt5.setLabel(x);
            bt5.setEnabled(false);count++;
win();
        }
        if(e.getSource()==bt6)
        {
            rec(x);
            bt6.setLabel(x);
            bt6.setEnabled(false);count++;
      win();  }
        if(e.getSource()==bt7)
        {
            rec(x);
            bt7.setLabel(x);
            bt7.setEnabled(false);count++;
      win();  }
        if(e.getSource()==bt8)
        {
            rec(x);
            bt8.setLabel(x);
            bt8.setEnabled(false);count++;
      win();  }
        if(e.getSource()==bt9)
        {
            rec(x);
            bt9.setLabel(x);
            bt9.setEnabled(false);count++;
      win(); 
    }
        if(e.getSource()==bt10)
        {
            tictactoe obj = new tictactoe();
        }
        if(count==9)
        {    win();
            if(!tf1.getText().equals("Success"))
            tf1.setText("Draw");
            tf1.setEditable(false);
        }
    }
    
    public void rec(String q)
    {
        switch(q)
        {
            case "X":
                x = "O";
               break;
            case "O":
                x = "X";
                break;
        }
    }
    
    public void win()
    {
        if(bt1.getLabel()=="X"&&bt2.getLabel()=="X"&&bt3.getLabel()=="X"
                ||bt1.getLabel()=="X"&&bt5.getLabel()=="X"&&bt9.getLabel()=="X"||
                bt1.getLabel()=="X"&&bt4.getLabel()=="X"&&bt7.getLabel()=="X")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
        if(bt3.getLabel()=="X"&&bt6.getLabel()=="X"&&bt9.getLabel()=="X"
                ||bt3.getLabel()=="X"&&bt5.getLabel()=="X"&&bt7.getLabel()=="X")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
        if(bt2.getLabel()=="X"&&bt5.getLabel()=="X"&&bt8.getLabel()=="X")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
        if(bt4.getLabel()=="X"&&bt5.getLabel()=="X"&&bt6.getLabel()=="X")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
    
         if(bt1.getLabel()=="O"&&bt2.getLabel()=="O"&&bt3.getLabel()=="O"
                ||bt1.getLabel()=="O"&&bt5.getLabel()=="O"&&bt9.getLabel()=="O"||
                bt1.getLabel()=="O"&&bt4.getLabel()=="O"&&bt7.getLabel()=="O")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
        if(bt3.getLabel()=="O"&&bt6.getLabel()=="O"&&bt9.getLabel()=="O"
                ||bt3.getLabel()=="O"&&bt5.getLabel()=="O"&&bt7.getLabel()=="O")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
        if(bt2.getLabel()=="O"&&bt5.getLabel()=="O"&&bt8.getLabel()=="O")
        {
            tf1.setText("Success");
            tf1.setEditable(false);
        }
        if(bt4.getLabel()=="O"&&bt5.getLabel()=="O"&&bt6.getLabel()=="O")
        {tf1.setText("Success");
            tf1.setEditable(false);}
        
    }
}
