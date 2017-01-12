package Class;

import java.awt.*;
import javax.swing.*;
/*
<applet code = "JTableDemo" width = 100 height = 100>
</applet>
*/

public class JTableDemo extends JApplet
{
    public void init()
    {
        try{
            SwingUtilities.invokeAndWait(new Runnable(){
            public void run()
            {
                makeGUI();
            }
            });
            
        }catch(Exception e){}
    }
    private void makeGUI()
    {
        String col[] = {"Name", "Class","Section"};
        Object data[][] = {{"K","1","A"},
                            {"L","2","B"},
                            {"m","6","B"},
                            {"n","5","C"},
                            {"L","2","B"},
                            {"m","6","B"},
                            {"n","5","C"},
                            {"L","2","B"},
                            {"m","6","B"},
                            {"n","5","C"},
                            {"v","3","B"},
        };
        JTable jt = new JTable(data, col);
        JScrollPane jsp = new JScrollPane(jt);
        add(jsp);
    }
}
