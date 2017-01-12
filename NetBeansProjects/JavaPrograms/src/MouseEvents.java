
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Key" width=300 height=400>
</applet>
*/
public class Key extends Applet
implements KeyListener
{
	int X=20,Y=30;
	String msg="KeyEvents--->";
	public void init()
	{
		addKeyListener(this);
		requestFocus();
		setBackground(Color.green);
		setForeground(Color.blue);
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("KeyDown");
		int key=k.getKeyCode();
		switch(key) 
		{
			case KeyEvent.VK_UP:
				showStatus("Move to Up");
				break;
			case KeyEvent.VK_DOWN:
				showStatus("Move to Down");
				break;
			case KeyEvent.VK_LEFT:
				showStatus("Move to Left");
				break;
			case KeyEvent.VK_RIGHT:
				showStatus("Move to Right");
				break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent k)
	{
		msg+=k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}