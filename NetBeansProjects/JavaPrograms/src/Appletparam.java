import java.awt.*;
import java.applet.*;
import java.net.*;
/*
<applet code="ParamDemo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2>
<param name=accountEnabled value=true>
</applet>
*/
public class Appletparam extends Applet{
String fontName;
int fontSize;
float leading;
boolean active;
// Initialize the string to be displayed.
public void init()
{
    setBackground(Color.red);
    setForeground(Color.white);
}

public void start() {
String param;
fontName = getParameter("fontName");
if(fontName == null)
fontName = "Not Found";
param = getParameter("fontSize");
try {
if(param != null) // if not found
fontSize = Integer.parseInt(param);
else
    fontSize = 0;
}catch(Exception e){}
param = getParameter("leading");
try{
    if(param != null)
        leading = Float.valueOf(param);
    else
        leading = 0;
}catch (Exception e){}
param = getParameter("accountEnabled");
        if(param!= null)
            active = Boolean.valueOf(param);
}
public void paint(Graphics g)
{
    g.drawString("fontName = "+fontName, 0,10);
    g.drawString("fontSize = "+fontSize, 0,20);
    g.drawString("leading = "+leading, 0,30);
    g.drawString("Account Enabled = "+active, 0,40);
    URL url = getCodeBase();
    String msg = url.toString();
    g.drawString(msg,0, 50);
    URL u = getDocumentBase();
    msg = u.toString();
    g.drawString(msg,0, 70);
}
}