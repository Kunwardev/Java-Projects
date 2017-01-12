
package Sudo;
import java.awt.Color;
import java.util.Random;
import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;

public class FinalSudo extends JFrame 
{
    Random r = new Random();
    int rand = r.nextInt(3);
    //funcheck fc = new funcheck();
    panel p;
    JButton bnew,bsub;
    JTextField[][] jt ;
    FinalSudo()
    {
        setSize(650,400);
        setLayout(null);
        setVisible(true);
        panel p = new panel(rand);
        p.setBounds(0, 0, 650, 400);
        add(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        
  
    public static void main(String[] args)
    {
        FinalSudo s = new FinalSudo();
    }
}

class panel extends JPanel implements ActionListener,FocusListener
{
    Matrixrepeatrows mrr = new Matrixrepeatrows();
    Matrixrepeatcolumns mrc = new Matrixrepeatcolumns();
    Sudokumat su = new Sudokumat();
    JLabel stopwatch;
    Timer theChronometer;
    long watchStart, watchEnd;
    JTextField [][] jt;
    JButton bnew,bsub;
    panel(int c)
    {
        setLayout(null);
        jt = new JTextField[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                jt[i][j] = new JTextField(5);
                jt[i][j].setBounds(20+i*30,50+j*30,30,30);
                jt[i][j].setVisible(true);
                jt[i][j].addFocusListener(this);
                add(jt[i][j]);
            }
        }
        stopwatch = new JLabel("Click on New Button to start");
        stopwatch.setBounds(350,10,240,30);
           theChronometer =
        new Timer(1000,new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			int seconds = (int)(System.currentTimeMillis()-watchStart)/1000;
        			int days = seconds / 86400;
					int hours = (seconds / 3600) - (days * 24);
					int min = (seconds / 60) - (days * 1440) - (hours * 60);
					int sec = seconds % 60;
        			String s = new String(""+hours+" hours "+min+ " min "+sec+" sec");
        	        stopwatch.setText(s);
        		}
        });
        add(stopwatch);
        bnew = new JButton("New");
        bnew.setBounds(390,110,130,40);
        add(bnew);
        bnew.addActionListener(this);
        bsub = new JButton("Submit");
        bsub.setEnabled(false);
        bsub.setBounds(390,170,130,40);
        add(bsub);
        bsub.addActionListener(this);
    }

    public void reboot(JTextField [][] qw)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                qw[i][j].setHorizontalAlignment(JTextField.CENTER);
                qw[i][j].setText("");
                qw[i][j].setEditable(true);
            }
        }
    }
    
    public void new_Su(int x)
    {
        switch(x)
        {
            
            case 1:
                reboot(jt);
                jt[0][3].setEditable(false);jt[0][3].setText(2+"");
                jt[0][5].setEditable(false);jt[0][5].setText(9+"");
                jt[1][2].setEditable(false);jt[1][2].setText(7+"");
                jt[1][6].setEditable(false);jt[1][6].setText(1+"");
                jt[4][5].setEditable(false);jt[4][5].setText(2+"");
                jt[2][2].setEditable(false);jt[2][2].setText(6+"");
                jt[2][4].setEditable(false);jt[2][4].setText(7+"");
                jt[2][8].setEditable(false);jt[2][8].setText(4+"");
                jt[3][0].setEditable(false);jt[3][0].setText(3+"");
                jt[3][1].setEditable(false);jt[3][1].setText(9+"");
                jt[3][2].setEditable(false);jt[3][2].setText(8+"");
                jt[3][8].setEditable(false);jt[3][8].setText(6+"");
                jt[5][0].setEditable(false);jt[5][0].setText(5+"");
                jt[5][6].setEditable(false);jt[5][6].setText(3+"");
                jt[5][7].setEditable(false);jt[5][7].setText(1+"");
                jt[5][8].setEditable(false);jt[5][8].setText(8+"");
                jt[6][0].setEditable(false);jt[6][0].setText(1+"");
                jt[6][4].setEditable(false);jt[6][4].setText(6+"");
                jt[6][6].setEditable(false);jt[6][6].setText(5+"");
                jt[7][2].setEditable(false);jt[7][2].setText(3+"");
                jt[7][5].setEditable(false);jt[7][5].setText(7+"");
                jt[7][6].setEditable(false);jt[7][6].setText(1+"");
                jt[8][3].setEditable(false);jt[8][3].setText(5+"");
                jt[8][5].setEditable(false);jt[8][5].setText(8+"");
                repaint();
                break;
            case 2:
                reboot(jt);
                jt[1][1].setEditable(false);jt[1][1].setText(2+"");
                jt[0][1].setEditable(false);jt[0][1].setText(4+"");
                jt[0][3].setEditable(false);jt[0][3].setText(6+"");
                jt[0][5].setEditable(false);jt[0][5].setText(8+"");
                jt[0][7].setEditable(false);jt[0][7].setText(3+"");
                jt[1][2].setEditable(false);jt[1][2].setText(8+"");
                jt[1][4].setEditable(false);jt[1][4].setText(4+"");
                jt[1][8].setEditable(false);jt[1][8].setText(5+"");
                jt[2][2].setEditable(false);jt[2][2].setText(1+"");
                jt[2][3].setEditable(false);jt[2][3].setText(9+"");
                jt[2][5].setEditable(false);jt[2][5].setText(5+"");
                jt[3][0].setEditable(false);jt[3][0].setText(5+"");
                jt[3][3].setEditable(false);jt[3][3].setText(1+"");
                jt[3][4].setEditable(false);jt[3][4].setText(8+"");
                jt[3][6].setEditable(false);jt[3][6].setText(3+"");
                jt[3][8].setEditable(false);jt[3][8].setText(9+"");
                jt[4][0].setEditable(false);jt[4][0].setText(1+"");
                jt[4][2].setEditable(false);jt[4][2].setText(3+"");
                jt[4][6].setEditable(false);jt[4][6].setText(5+"");
                jt[4][7].setEditable(false);jt[4][7].setText(4+"");
                jt[5][0].setEditable(false);jt[5][0].setText(4+"");
                jt[5][2].setEditable(false);jt[5][2].setText(2+"");
                jt[5][4].setEditable(false);jt[5][4].setText(5+"");
                jt[5][5].setEditable(false);jt[5][5].setText(9+"");
                jt[5][7].setEditable(false);jt[5][7].setText(6+"");
                jt[6][3].setEditable(false);jt[6][3].setText(5+"");
                jt[6][5].setEditable(false);jt[6][5].setText(6+"");
                jt[6][6].setEditable(false);jt[6][6].setText(8+"");
                jt[7][0].setEditable(false);jt[7][0].setText(8+"");
                jt[7][4].setEditable(false);jt[7][4].setText(9+"");
                jt[7][6].setEditable(false);jt[7][6].setText(6+"");
                jt[7][7].setEditable(false);jt[7][7].setText(5+"");
                jt[8][1].setEditable(false);jt[8][1].setText(5+"");
                jt[8][3].setEditable(false);jt[8][3].setText(8+"");
                jt[8][5].setEditable(false);jt[8][5].setText(2+"");
                jt[8][7].setEditable(false);jt[8][7].setText(1+"");
                repaint();
                break;
            case 3:
                reboot(jt);
                jt[0][2].setEditable(false);jt[0][2].setText(9+"");
                jt[0][5].setEditable(false);jt[0][5].setText(1+"");
                jt[0][6].setEditable(false);jt[0][6].setText(4+"");
                jt[0][7].setEditable(false);jt[0][7].setText(2+"");
                jt[0][8].setEditable(false);jt[0][8].setText(8+"");
                jt[1][0].setEditable(false);jt[1][0].setText(4+"");
                jt[1][1].setEditable(false);jt[1][1].setText(8+"");
                jt[1][2].setEditable(false);jt[1][2].setText(3+"");
                jt[1][7].setEditable(false);jt[1][7].setText(7+"");
                jt[2][0].setEditable(false);jt[2][0].setText(1+"");
                jt[2][1].setEditable(false);jt[2][1].setText(2+"");
                jt[2][3].setEditable(false);jt[2][3].setText(5+"");
                jt[2][8].setEditable(false);jt[2][8].setText(9+"");
                jt[3][8].setEditable(false);jt[3][8].setText(4+"");
                jt[4][0].setEditable(false);jt[4][0].setText(3+"");
                jt[4][1].setEditable(false);jt[4][1].setText(7+"");
                jt[4][3].setEditable(false);jt[4][3].setText(4+"");
                jt[4][4].setEditable(false);jt[4][4].setText(8+"");
                jt[4][5].setEditable(false);jt[4][5].setText(9+"");
                jt[4][7].setEditable(false);jt[4][7].setText(1+"");
                jt[4][8].setEditable(false);jt[4][8].setText(5+"");
                jt[5][0].setEditable(false);jt[5][0].setText(2+"");
                jt[6][0].setEditable(false);jt[6][0].setText(2+"");
                jt[6][5].setEditable(false);jt[6][5].setText(7+"");
                jt[6][7].setEditable(false);jt[6][7].setText(4+"");
                jt[6][8].setEditable(false);jt[6][8].setText(3+"");
                jt[7][1].setEditable(false);jt[7][1].setText(9+"");
                jt[7][6].setEditable(false);jt[7][6].setText(6+"");
                jt[7][7].setEditable(false);jt[7][7].setText(5+"");
                jt[7][8].setEditable(false);jt[7][8].setText(2+"");
                jt[8][0].setEditable(false);jt[8][0].setText(5+"");
                jt[8][1].setEditable(false);jt[8][1].setText(3+"");
                jt[8][2].setEditable(false);jt[8][2].setText(1+"");
                jt[8][3].setEditable(false);jt[8][3].setText(2+"");
                jt[8][6].setEditable(false);jt[8][6].setText(8+"");
                repaint();
                break;
            case 4:
                reboot(jt);
                jt[0][6].setEditable(false);jt[0][6].setText(4+"");
                jt[0][8].setEditable(false);jt[0][8].setText(8+"");
                jt[1][2].setEditable(false);jt[1][2].setText(2+"");
                jt[1][6].setEditable(false);jt[1][6].setText(5+"");
                jt[2][7].setEditable(false);jt[2][7].setText(9+"");
                jt[3][7].setEditable(false);jt[3][7].setText(7+"");
                jt[3][8].setEditable(false);jt[3][8].setText(2+"");
                jt[4][1].setEditable(false);jt[4][1].setText(7+"");
                jt[4][5].setEditable(false);jt[4][5].setText(1+"");
                jt[5][5].setEditable(false);jt[5][5].setText(4+"");
                jt[7][1].setEditable(false);jt[7][1].setText(5+"");
                jt[7][3].setEditable(false);jt[7][3].setText(1+"");
                jt[8][2].setEditable(false);jt[8][2].setText(6+"");
                jt[8][3].setEditable(false);jt[8][3].setText(4+"");
                jt[8][6].setEditable(false);jt[8][6].setText(2+"");
                repaint();
                break;
            case 5:
                reboot(jt);
                jt[0][0].setEditable(false);jt[0][0].setText(9+"");
                jt[0][2].setEditable(false);jt[0][2].setText(2+"");
                jt[0][4].setEditable(false);jt[0][4].setText(5+"");
                jt[0][7].setEditable(false);jt[0][7].setText(1+"");
                jt[0][8].setEditable(false);jt[0][8].setText(6+"");
                jt[1][4].setEditable(false);jt[1][4].setText(1+"");
                jt[1][5].setEditable(false);jt[1][5].setText(6+"");
                jt[1][7].setEditable(false);jt[1][7].setText(3+"");
                jt[2][0].setEditable(false);jt[2][0].setText(4+"");
                jt[2][2].setEditable(false);jt[2][2].setText(1+"");
                jt[3][3].setEditable(false);jt[3][3].setText(8+"");
                jt[3][6].setEditable(false);jt[3][6].setText(6+"");
                jt[4][2].setEditable(false);jt[4][2].setText(3+"");
                jt[5][4].setEditable(false);jt[5][4].setText(4+"");
                jt[6][3].setEditable(false);jt[6][3].setText(6+"");
                jt[6][6].setEditable(false);jt[6][6].setText(3+"");
                jt[7][1].setEditable(false);jt[7][1].setText(7+"");
                jt[7][6].setEditable(false);jt[7][6].setText(1+"");
                jt[7][8].setEditable(false);jt[7][8].setText(9+"");
                jt[8][5].setEditable(false);jt[8][5].setText(4+"");
                repaint();
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
        Random r = new Random();
        int rand = 1 + r.nextInt(5);
        if(e.getSource() == bsub)
        {
          boolean a = mrr.checkrows(jt);
//          if(a == false)
//          {
//              JOptionPane.showMessageDialog(this, "Not Right");
//          }
//          else
//              JOptionPane.showMessageDialog(this, "True");
          boolean b = mrc.checkcolumns(jt);
//           if(b == false)
//          {
//              JOptionPane.showMessageDialog(this, "Not Right");
//          }
//          else
//              JOptionPane.showMessageDialog(this, "True");
          
          boolean c = su.sudoCheck(jt);
//          if(c == false)
//              JOptionPane.showMessageDialog(this,"Wrong");
//          else
//              JOptionPane.showMessageDialog(this,"Right");
          a = a&b&c;
          if(a == false)
          {
              JOptionPane.showMessageDialog(this, "There are some errors in your solution\nFind those errors and then submit it");
          }
          else
          {
            stopwatch.setText(watchStart+"");
            theChronometer.stop();
              JOptionPane.showMessageDialog(this, "Congratulations, You have completed the game in "+watchStart +" time");
        }
        }
          if(e.getSource() == bnew)
          {
              bsub.setEnabled(true);
              new_Su(rand);
              watchStart = System.currentTimeMillis();
        	   theChronometer.start();
                   stopwatch.setText(watchStart+"");
          }
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        e.getComponent().setBackground(Color.yellow);
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        e.getComponent().setBackground(Color.WHITE);
    }
}
