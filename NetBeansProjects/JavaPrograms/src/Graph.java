import java.awt.*;
import java.awt.event.*;

public class Graph extends Frame implements ActionListener 
{
    Button b1;
    Button b2;
    TextField t1;
    Graph(){
    setVisible(true);
    setLayout(null);
    setSize(400,400);
    b1 = new Button("Button 1");
    b2 = new Button("Button 2");
    t1 = new TextField(25);
    
    t1.setBounds(20, 50, 90, 30);
    b1.setBounds(20, 90, 60, 40);
    b2.setBounds(90, 90, 60, 40);
    add(t1);
    add(b1);
    add(b2);
    
     addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
        {
            dispose();
        }
        });
     b1.addActionListener(this);
     b2.addActionListener(this);
     
    
     public void actionPerformed(ActionEvent e)
     {
         if(e.getSource() == b1)
         {
             t1.setText("Hello java");
         }
         if(e.getSource() == b2)
         {
             t1.setText("Hello World");
         }

     }
     public static void main(String[] args) {
        Graph obj = new Graph();
    }
}
}
