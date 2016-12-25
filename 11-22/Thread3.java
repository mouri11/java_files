/* Implement thread program by implementing Runnable interface*/
class A implements Runnable
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
class B implements Runnable
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
class C implements Runnable
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
class Test2
{
    public static void main(String[]args)
    {
	A a=new A();
	B b=new B();
	C c=new C();
	Thread threadA=new Thread(a);
	Thread threadB=new Thread(b);
	Thread threadC=new Thread(c);
	/*threadA.setPriority(1);
	threadB.setPriority(5);
	threadC.setPriority(10);*/
	threadA.start();
	threadB.start();
	threadC.start();
	
    }
}
