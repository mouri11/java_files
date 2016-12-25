/*To show multiple inheritance from parent interfaces
 */
interface I1
{
	int a=10;
	void show();
}
interface I2
{
	int b=20;
	void print();
}
class Inherit implements I1,I2
{
	public void show()
	{
		System.out.println("From I1:"+a);
	}
	public void print()
	{
		System.out.println("From I2:"+b);
	}
	public static void main(String[]args)
	{
		Inherit obj=new Inherit();
		obj.show();
		obj.print();
	}
}
