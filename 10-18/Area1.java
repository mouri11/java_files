/*To show area of circle,square,rectangle and triangle using function overloading
 */
import java.util.*;
class Area1
{
	private float area(float l,float b)
	{
		return l*b;
	}
	private double area(double p,double base)
	{
		return ((1/2.0)*base*p);
	}	
	private double area(double r)
	{
		return (Math.PI*r*r);
	}	
	private float area(float a)
	{
		return a*a;
	}
	public static void main(String[]args)
	{
		Area1 obj=new Area1();
		Scanner sc=new Scanner(System.in);
		double p,base,r;
		float l,b,a;
		System.out.println("Enter sides of rectangle:");
		l=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Area of rectangle is "+obj.area(l,b));
		System.out.println("Enter base and height of triangle:");
		p=sc.nextDouble();
		base=sc.nextDouble();
		System.out.println("Area of triangle is "+obj.area(p,base));
		System.out.println("Enter radius of circle:");
		r=sc.nextDouble();
		System.out.println("Area of circle is "+obj.area(r));
		System.out.println("Enter side of square:");
		a=sc.nextFloat();
		System.out.println("Area of square is "+obj.area(a));
	}
}
