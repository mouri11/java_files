import java.io.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
/*
   <applet code="Triangle" width=230 height=210></applet>
 */
public class Triangle extends Applet
{
    public void init()
    {
	setBackground(Color.blue);
	setForeground(Color.red);
    }
    public void start()
    {
	//drawTriangle(Graphics g);
    }
    /*public void drawTriangle(Graphics g)
    {
	paint(g);
    }*/
    public void paint(Graphics g)
    {
	int x[]={30,200,30};
	int y[]={30,30,200};
	g.drawPolygon(x,y,num);
	/*g.drawString("	    /\\",0,0);
	g.drawString("     /  \\",0,0);
   	g.drawString("    /    \\",0,0);
	g.drawString("   /      \\",0,0);
	g.drawString("  /        \\",0,0);
	g.drawString(" /          \\",0,0);
	g.drawString("/____________\\",0,0);
	g.drawString("/ \\"0,0);
	g.drawString("/ \\"0,0);
	g.drawString("/ \\"0,0);
	g.drawString("/ \\"0,0);
	g.drawString("/ \\"0,0);
   */
    }
}
/*class Abc
{
    public static void main(String[]args)
    {
	
    }
}*/
