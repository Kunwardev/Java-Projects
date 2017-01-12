import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame
{
    TextField tf1;
    Button bt1;
    Button bt2;
    
    Gui()
    {
        setVisible(true);
        setSize(400,400);
        setLayout(null);
        tf1 = new TextField(25);
        bt1 = new Button ("Java");
        bt2 = new Button ("Android");
        tf1.setBounds(20, 50, 300, 40);
        bt1.setBounds(20, 100, 100, 40);
        bt2.setBounds(200, 100, 100, 40);
        add(tf1);
        add(bt1);
        add(bt2);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
        {
            dispose();
        }}); 
        
        bt1.addActionListener(new ActionListener(){
        
            
            public void actionPerformed(ActionEvent e)
            {
                tf1.setText("Hello Java "+Math.random());
            }
        });
        bt2.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                tf1.setText("Hello Android "+Math.random());
            }
        });
        
    }
    
    public static void main(String[] args) {
        //draw obj = new draw();
       //Graph on = new Graph();
      Gui obj = new Gui();
    }
}
