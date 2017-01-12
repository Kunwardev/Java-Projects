import java.awt.*;
import java.awt.event.*;

public class draw extends Frame implements ActionListener
{
    
    Button bt1;
    Color cl;
    draw()
    {
        cl = Color.RED;
        bt1 = new Button ("1");
         bt1.setBounds(250, 250, 40, 30);
         add(bt1);
         setLayout(null);
         bt1.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
        { 
            dispose();
        }});
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        public void paint (Graphics g)
        {
            g.setColor(cl);
            g.fillOval(20, 50, 200, 300);
        }
                 public void actionPerformed(ActionEvent e)
         {
             cl = Color.BLUE;
             repaint();
         }

    public static void main(String[] args) {
        draw obj = new draw();
    }
       
}
}