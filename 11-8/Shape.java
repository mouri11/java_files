interface I1
{
	void area();
}
class Square implements I1
{
	public void area()
	{
		System.out.println("The area of the square(10x10) is "+(10*10));
	}
}
class Circle implements I1
{
	public void area()
	{
		System.out.println("The area of the circle(r=20) is "+(Math.PI*20*20));
	}
}
class Triangle implements I1
{
	public void area()
	{
		System.out.println("The area of the triangle(5x10) is "+(0.5f*5*10));
	}
}
class Rectangle implements I1
{
	public void area()
	{
		System.out.println("The area of the rectanlge(10x20) is "+(10*20));
	}
}
public class Shape
{
	public static void main(String[]args)
	{
		Square s1=new Square();
		Rectangle r1=new Rectangle();
		Circle c1=new Circle();
		Triangle t1=new Triangle();
		s1.area();
		r1.area();
		c1.area();
		t1.area();
	}
}
