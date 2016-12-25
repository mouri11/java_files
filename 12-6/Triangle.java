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
	//setForeground(Color.red);
    }
    /*
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
	setForeground(Color.red);
	int x[]={30,200,30};
	int y[]={30,30,200};
	int num=3;
	g.drawPolygon(x,y,num);
	g.fillOval(100,100,50,50);
	g.drawOval(190,150,90,30);
	//g.fillOval(70,90,140,100);
	g.drawRect(120,130,60,50);
	g.fillRect(50,50,20,20);
	int x1[]={100,100};
	int y1[]={100,200};
	g.drawPolygon(x1,y1,2);
	//int x2[]={30,200,30,200,30}
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
