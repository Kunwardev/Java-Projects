package graohics;

import java.awt.Color;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FileMover extends JFrame implements ActionListener {

    JButton bt1,bt2;

    FileMover() {
        bt1 = new JButton("Split");
        bt2 = new JButton("Join");
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        bt1.setBounds(20,50, 100, 30);
        bt2.setBounds(140,50,100,30);
        add(bt1);
        add(bt2);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
    }

    class Combiner extends JFrame implements ActionListener
{
    JFileChooser chooser=new JFileChooser();
    JLabel l1;
    JButton b1,b2; 
    JTextField tf1;
    JProgressBar p=new JProgressBar();
    public Combiner()
    {
        setTitle("File Combiner");
        setLayout(null);
        tf1=new JTextField();
        l1=new JLabel("Choose a File to Join");
        b1=new JButton("Choose");
        b2=new JButton("Start");
        l1.setBounds(100,100,300,20);
        tf1.setBounds(100,140,300,20);
        b1.setBounds(440,140,100,20);
        p.setBounds(100,200,350,20);
        b2.setBounds(300,300,100,20);
        p.setStringPainted(true);
        p.setForeground(Color.blue);
        p.setBackground(Color.green);
        
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,600);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);
        add(tf1);
        add(b1);
        add(b2);
        add(p);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
         int r=chooser.showOpenDialog(this);
         if(r==chooser.APPROVE_OPTION)
         {
          File f=chooser.getSelectedFile();
          tf1.setText(f.getPath());
         }
         else
         {
          JOptionPane.showMessageDialog(this,"Select a file First.");
         }
       }     
        if(e.getSource()==b2)
        {
          Combine obj=new Combine();
          Thread t=new Thread(obj);
          t.start();
        }
    }
    public class Combine implements Runnable
    {
        FileInputStream fin;
        FileOutputStream fout;
        String s="";
        int count=0,n=1,r,count2,temp;
        byte b[]=new byte[50000010];
        int per=0;
        float c=0,temp2;
        public Combine()
        {
            for(int i=0;i<(tf1.getText()).length()-2;i++)
            {
                s=s+tf1.getText().charAt(i);
            }
            while(true)
            {
                File f=new File(s+"."+n);
                if(f.exists())
                {
                    count++;
                    n++;
                }
                else
                {
                    break;
                }
                
            }
        }
        public void run()
        {
            try
            {
                temp2=count;
                n=1;
            fout=new FileOutputStream(s);
             
             while(count>0)
             {
               File f=new File(s+"."+n);
               temp=count2=(int)f.length();
               fin=new FileInputStream(s+"."+n);
               while(count2>0)
               {
                   if(count2>50000000)
                   {
                    r=fin.read(b,0,50000000);
                    fout.write(b,0,r);
                    count2=count2-r;
                    per=(int)((c/(temp2-1)*100));
                    p.setValue(per);
                    p.setForeground(Color.blue);
                    p.setBackground(Color.green);
                    p.setStringPainted(true);
                   }
                   else
                   {
                    r=fin.read(b,0,count2);
                    fout.write(b,0,r);
                    count2=count2-r;
                    per=(int)((c/(temp2-1)*100));
                    p.setValue(per);
                    p.setForeground(Color.blue);
                    p.setBackground(Color.green);
                    p.setStringPainted(true);
                   }    
                }
                 count2=temp;
                 n++;
                 c++;
                 count--;
             }
           fin.close();
           JOptionPane.showMessageDialog(null,"Task Completed.");
           fout.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    }
    
    class Splitter extends JFrame implements ActionListener
{
    JFileChooser chooser=new JFileChooser();
    JLabel l1,l2;
    JButton b1,b2; 
    JTextField tf1,tf2;
    JProgressBar p;
    public Splitter()
    {
        setTitle("File Splitter");
        setLayout(null);
        p=new JProgressBar();
        tf1=new JTextField();
        l1=new JLabel("Choose a File to Split");
        b1=new JButton("Choose");
        b2=new JButton("Start");
        tf2=new JTextField();
        l2=new JLabel("Enter size of each part (MBs)");
        l1.setBounds(100,100,300,20);
        tf1.setBounds(100,140,300,20);
        b1.setBounds(440,140,100,20);
        l2.setBounds(100,200,300,20);
        tf2.setBounds(100,240,300,20);
        p.setBounds(100,300,350,20);
        p.setStringPainted(true);
        p.setForeground(Color.blue);
        p.setBackground(Color.green);
        b2.setBounds(300,400,100,30);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,600);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);
        add(tf1);
        add(b1);
        add(l2);
        add(tf2);
        add(b2);
        add(p);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
        int r=chooser.showOpenDialog(this);
        if(r==chooser.APPROVE_OPTION)
        {
          File f=chooser.getSelectedFile();
          tf1.setText(f.getPath());
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Select a file First.");
                    
        }
       }
    
       else if(e.getSource()==b2)
       {        
        Split obj=new Split();
        Thread t=new Thread(obj);
        t.start();
       }
    } 
    public class Split implements Runnable
    {
        FileInputStream fin;
        FileOutputStream fout;
        double size,temp2;
        int r,count,n=1,count2,temp;
        byte b[]=new byte[50000010];
        int per=0;
        double written=0;
        public Split() 
        {
          File f=new File(tf1.getText());
          temp2=size=f.length();
          count=(int)size;
        }
        
        public void run()
        { 
         try 
         {
          fin=new FileInputStream(tf1.getText());
          temp=count2=Integer.parseInt(tf2.getText())*1024*1024;
          if(count2>50000000)
          {
           while(count>0)
           {
              fout=new FileOutputStream(tf1.getText()+"."+n);
              while(count2>0)
                {
                  if(count2>50000000 && count>50000000)
                  {
                  r=fin.read(b,0,50000000);
                  count2=count2-r;
                  fout.write(b,0,r);
                  count=count-r;
                  written=written+r;
                  per=(int)((written/temp2)*100);
                  p.setValue(per);
                  p.setForeground(Color.blue);
                  p.setBackground(Color.green);
                  p.setStringPainted(true);
                  }
                  else if(count2<50000000)
                  {
                   r=fin.read(b,0,count2);
                   fout.write(b,0,r);
                   fout.flush();
                   count2=count2-count2;
                   count=count-r;
                   per=(int)((written/temp2)*100);
                   p.setValue(per);
                   p.setForeground(Color.blue);
                   p.setBackground(Color.green);
                   p.setStringPainted(true);
                  }
                  else if(count<50000000)
                  {
                   r=fin.read(b,0,count);
                   fout.write(b,0,r);
                   fout.flush();
                   count2=count2-count2;
                   count=count-r;
                   per=(int)((written/temp2)*100);
                   p.setValue(per);
                   p.setForeground(Color.blue);
                   p.setBackground(Color.green);
                   p.setStringPainted(true);
 
                  }
                } 
            count2=temp;
            n++;
            fout.close();
            }
           } 
          else
          {
           while(count>0)
            {
             fout=new FileOutputStream(tf1.getText()+"."+n);
             r=fin.read(b,0,Integer.parseInt(tf2.getText())*1024*1024);
             fout.write(b,0,r);
             fout.flush();
             count=count-r;
             n++;
             written=written+r;
             per=(int)((written/temp2)*100);
             p.setValue(per);
             p.setForeground(Color.blue);
             p.setBackground(Color.green);
             p.setStringPainted(true);
             fout.close();
            }   
          }
          p.setValue(100);
          p.setForeground(Color.blue);
          p.setBackground(Color.green);
          p.setStringPainted(true);
          fin.close();
          fout.close();
          JOptionPane.showMessageDialog(null,"Task Completed.");
          
         } 
         catch(Exception e)
         {
          e.printStackTrace();
         }
        }
    }
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            Splitter s = new Splitter();
        }
        else if(e.getSource()==bt2)
        {
            Combiner cb  = new Combiner();
        }
    }

    public static void main(String[] args) {
        FileMover obj = new FileMover();
       

    }

}
