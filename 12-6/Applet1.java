import java.io.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="Sample" width=300 height=50></applet>
 */
public class Applet1 extends Applet
{
        String msg;
	//set foreground and background colors
	public void init()
	{
	    setBackground(Color.cyan);
	    setForeground(Color.red);
	    System.out.println("Applet born...");
	    msg="Inside init() ==\n";
	    
	}

	//Initialize string to be displayed
	public void start()
	{
	   System.out.println("Applet running...");
	   msg+="Inside start() ==\n";
	    
	}
	//Display msg in applet window
	public void paint(Graphics g)
	{
	    System.out.println("Applet painting...");
	    msg+=" Inside paint().\n";
	    g.drawString(msg,10,30);
	}
	public void stop()
	{
	    System.out.println("Applet paused/stopped...");
	}
	public void destroy()
	{
	    System.out.println("Applet destroyed!!");
	}
}
/*class Abc
{
    public static void main(String[]args)
    {
	
    }
}*/
