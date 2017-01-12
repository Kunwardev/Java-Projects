package graohics;

import java.awt.*;
import java.awt.event.*;

public class mouselistenerdemo extends Frame implements MouseListener
{    
    Button bt;
    Label lb;
    mouselistenerdemo()
    {
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        bt = new Button("0");
        bt.setBounds(50,50,200,200);
        lb = new Label("---------------------");
        lb.setBounds(50,270,200,30);
        add(bt);
        add(lb);
        bt.addMouseListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    public static void main(String args[])
    {
        mouselistenerdemo obj = new mouselistenerdemo();
    }

        public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1)
                {
                    int n = Integer.parseInt(bt.getLabel());
                    n++;
                    bt.setLabel(n+"");
                }
        }

    public void mousePressed(MouseEvent e) {
                lb.setText("Mouse Button Pressed");
        }

    public void mouseReleased(MouseEvent e) {
                lb.setText("Mouse Button Released");
        }

    public void mouseEntered(MouseEvent e) {
                bt.setBackground(Color.CYAN);
        }

    public void mouseExited(MouseEvent e) {
                bt.setBackground(Color.MAGENTA);
        }
}
