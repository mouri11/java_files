/* To add two complex numbers. Print the result in x+iy form. Use objects as arguments to a method which will perform the addition and use function overloading
 */
class Complex
{
    double x;
    int y;
    Complex(double a,int b)
    {
    	x=a;
    	y=b;
    }
    void print()
    {
    	System.out.println(x+"+ i"+y);
    }	
}
class Test
{
    double real;
    int imag;
    private double sum(double a,double b)
    {
        real=a+b;	
        return real;
    }
    private int sum(int a,int b)
    {
    	imag=a+b;
	return imag;
    }
    public static void main(String[]args)
    {
    	Complex obj=new Complex(4,6);
    	obj.print();
    	Complex obj1=new Complex(1,9);
    	obj1.print();
    	Test t1=new Test();
	System.out.println("The sum is: "+t1.sum(obj.x,obj1.x)+"+ i"+t1.sum(obj.y,obj1.y));
    }
}
