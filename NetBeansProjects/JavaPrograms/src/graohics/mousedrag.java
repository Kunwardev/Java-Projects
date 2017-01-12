package graohics;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class mousedrag extends Frame implements MouseMotionListener,MouseListener
{
    ArrayList<Point>al = new ArrayList<>();
    mousedrag()
    {
        addMouseMotionListener(this);
        addMouseListener(this);
        setVisible(true);
        setSize(400,400);
    }
    public static void main(String[] args) {
        mousedrag obj = new mousedrag();
    }

    int x1,x2,y1,y2;

    public void mouseDragged(MouseEvent e) 
    {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
        al.add(new Point(x2,y2));
    }

    public void mouseMoved(MouseEvent e) 
    {
       
    }
    
    public void paint(Graphics g)
    {
        for(int i=0;i<al.size()-1;i++){
            if((al.get(i).x==0&&al.get(i).y==0)||al.get(i+1).x==0&&al.get(i+1).y==0)
                continue;
        g.drawLine(al.get(i).x,al.get(i).y,al.get(i+1).x,al.get(i+1).y);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent e) {
        al.add(new Point(0, 0));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
