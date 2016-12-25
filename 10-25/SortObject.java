/* to create a student class and sort student objects according to percentage
*/
import java.util.*;
class Student
{
	int phy,chem,maths;
	String name;
	Student(int phy,int chem,int maths,String name)
	{
		this.name=name;
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
	}
	float percent()
	{
		return (phy+chem+maths)/300.0f*100;
	}
}	
class SortObject
{
	public static void main(String[]args)
	{
		Student a[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		String name;
		int phy,chem,maths;
		System.out.println("Enter marks for 5 students out of 100.");
		for(int i=0;i<a.length;i++){
			System.out.println("Enter name and marks for phy,chem and maths for student "+(i+1)+":");
			name=sc.next();
			//System.out.println(name);
			phy=sc.nextInt();
		
			maths=sc.nextInt();
			a[i]=new Student(phy,chem,maths,name);
		}
		/*int l=0;
		while(l<args.length){
			a[l]=Float.parseFloat(args[l++]);
		}*/
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j].percent()<a[j+1].percent()){
					Student temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)System.out.println(a[i].name+" ");
		System.out.println();
	}
}
