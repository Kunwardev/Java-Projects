package graohics;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class progressbardemo extends JFrame
{
    JProgressBar jp ;
    progressbardemo()
    {
        jp = new JProgressBar(JProgressBar.HORIZONTAL,0,100);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        jp.setBackground(Color.YELLOW);
        jp.setForeground(Color.RED);
        jp.setBorderPainted(false);
        jp.setBounds(20,50,200,30);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(jp);
        Job obj =  new Job();
        Thread t = new Thread(obj); 
        t.start();
    }
    public static void main(String[] args) {
        progressbardemo obj = new progressbardemo();
    }
    public class Job implements Runnable
    {

        public void run() 
        {
            for (int i = 0; i <= 100; i++) {
            jp.setString("File Downloading : "+i+"%");
            jp.setValue(i);
            try
            {
                Thread.sleep(50);
            }catch(Exception ex){}
        }
        
    }
}
}
