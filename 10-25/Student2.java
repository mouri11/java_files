/* to create a Student class and 2 subclasses Arts and Science and create objects such that each student has unique roll no.
 */
import java.util.*;
class Student
{
	static long roll=1000;
	Student()
	{
		roll++;
	}
}
class Science extends Student
{
	int phy,chem,maths;
	Science(int phy,int chem,int maths)
	{
		super();
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
	}
}
class Arts extends Student
{
	int eng,hist,geo;
	Arts(int eng,int hist,int geo)
	{
		super();
		this.eng=eng;
		this.hist=hist;
		this.geo=geo;
	}
}
class Student2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int phy,chem,maths,eng,hist,geo;
		System.out.println("Enter marks for phy, chem and maths:");
		phy=sc.nextInt();
		chem=sc.nextInt();
		maths=sc.nextInt();
		Science s=new Science(phy,chem,maths);
		System.out.println("The marks for "+s.roll+" are "+s.phy+", "+s.chem+" and "+s.maths+".");
		System.out.println("Enter marks for eng, hist and geo:");
		eng=sc.nextInt();
		hist=sc.nextInt();
		geo=sc.nextInt();
		Arts a=new Arts(eng,hist,geo);
		System.out.println("The marks for "+a.roll+" are "+a.eng+", "+a.hist+" and "+a.geo+".");
	}
}
