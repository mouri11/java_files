import java.io.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="Sample" width=300 height=50></applet>
 */
public class Sample extends Applet
{
        String msg;
	//set foreground and background colors
	public void init()
	{
	    setBackground(Color.cyan);
	    setForeground(Color.red);
	    msg="Inside init() ==";
	}

	//Initialize string to be displayed
	public void start()
	{
	    msg+="Inside start() ==";
	}

	//Display msg in applet window
	public void paint(Graphics g)
	{
	    //msg+=" Inside paint().";
	    g.drawString(msg,10,30);
	}
}
/*class Abc
{
    public static void main(String[]args)
    {
	
    }
}*/
