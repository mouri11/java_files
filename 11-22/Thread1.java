/* Create 3 threads in your program by extending Thread class. 
   The first thread prints "From thread A" 10 times, the second one prints "From Thread B" 10
   times, the third one prints "From Thread C" 10 times.

 */
import java.util.*;
class A extends Thread
{
    void show()
    {
	for(int i=0;i<10;i++)System.out.println("From Thread A.");
    }
    public void run()
    {
	show();
    }
}
class B extends Thread
{
    void show()
    {
	for(int i=0;i<10;i++)System.out.println("From Thread B.");
    }
    public void run()
    {
	show();
    }
}
class C extends Thread
{
    void show()
    {
	for(int i=0;i<10;i++)System.out.println("From Thread C.");
    }
    public void run()
    {
	show();
    }
}
class Test
{
    public static void main(String[]args)
    {
	A a=new A();
	B b=new B();
	C c=new C();
	/*a.setPriority(1);
	b.setPriority(5);
	c.setPriority(10);*/
	a.start();
	b.start();
	c.start();
	
    }
}
