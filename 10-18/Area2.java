/*To show area of circle, square, rectangle and triangle using constructor overloading.
 */
import java.util.*;
class Area2
{
	static Scanner sc=new Scanner(System.in);
	static double p,base,r;
	static float l,b,a;
	Area2(float l,float b){	this.l=l;	this.b=b;
	}
	Area2(float a)
	{
		this.a=a;
	}
	Area2(double p,double base)
	{
		this.p=p;
		this.base=base;
	}
	Area2(double r)
	{
		this.r=r;
	}
	private double area1()
	{
		return l*b;
	}
	private double area2()
	{
		return a*a;
	}
	private double area3()
	{
		return (1/2.0)*base*p;
	}
	private double area4()
	{
		return Math.PI*r*r;
	}
	public static void main(String[]args)
	{
		System.out.println("Enter sides of rectangle:");
		l=sc.nextFloat();
		b=sc.nextFloat();
		Area2 obj1=new Area2(l,b);
		System.out.println("Area of rectangle is "+obj1.area1());
		System.out.println("Enter sides of square:");
		a=sc.nextFloat();
		Area2 obj2=new Area2(a);
		System.out.println("Area of square is "+obj2.area2());
		System.out.println("Enter sides of triangle:");
		p=sc.nextDouble();
		base=sc.nextDouble();
		Area2 obj3=new Area2(p,base);
		System.out.println("Area of triangle is "+obj3.area3());
		System.out.println("Enter radius of circle:");
		r=sc.nextDouble();
		Area2 obj4=new Area2(r);
		System.out.println("Area of circle is "+obj4.area4());
	}
}
