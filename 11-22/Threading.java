import java.util.*;
import java.lang.String;
class Student{
	static int count=0;
	int roll;
	//String name;
	/*Student(String str,int x)
	{
		count++;
		roll=count;
		marks=x;
		name=str;
	}*/
	String sub;
	Student(String strn)
	{
		sub=strn;
		count++;
		roll=count;
	}
}
class ArtsStudent extends Student{
	String name;
	int marks;
	ArtsStudent( String st,int x)
	{
		super("arts");
		name=st;
		marks=x;
		//sub="Arts";
	}
	void show()
	{
		System.out.println("Name : "+name+"\nRoll : "+roll+"\nDepartment : "+sub+"\nMarks Obtained : "+marks);
	}
}
class ScienceStudent extends Student{
	String name;
	int marks;
	ScienceStudent(String st,int x)
	{
		super("science");
		//sub="Science";
		name=st;
		marks=x;
	}
	void show()
	{
		System.out.println("Name : "+name+"\nRoll : "+roll+"\nDepartment : "+sub+"\nMarks Obtained : "+marks);
	}
}
class ArtsSort implements Runnable{
	ArtsStudent tempA;
	int size,i,j;
	ArtsStudent[] array;
	ArtsSort(ArtsStudent arts[],int n)
	{
		size=n;
		array=new ArtsStudent[size];
		for(i=0;i<arts.length;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(arts[j].marks>arts[j+1].marks)
				{
					tempA=arts[j];
					arts[j]=arts[j+1];
					arts[j+1]=tempA;
				}
			}
		}
		for(i=0;i<size;i++)
		{
			array[i]=arts[i];
		}
	}
	public void run(){
		for(i=0;i<size;i++)
		{
			array[i].show();
		}
	}		
}
class ScienceSort implements Runnable{
	ScienceStudent tempS;
	int size,i,j;
	ScienceStudent[] array;
	ScienceSort(ScienceStudent science[],int n)
	{
		size=n;
		array=new ScienceStudent[size];
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(science[j].marks>science[j+1].marks)
				{
					tempS=science[j];
					science[j]=science[j+1];
					science[j+1]=tempS;
				}
			}
		}
		for(i=0;i<size;i++)
		{
			array[i]=science[i];
		}
	}
	public void run(){
		for(i=0;i<size;i++)
		{
			array[i].show();
		}
	}	
}
class ThreadTest2{
	public static void main(String args[])
	{
		ArtsStudent s1=new ArtsStudent("A",90);
		ScienceStudent s2=new ScienceStudent("B",89);
		ScienceStudent s3=new ScienceStudent("C",88);
		ArtsStudent s4=new ArtsStudent("D",97);
		ScienceStudent s5=new ScienceStudent("E",91);
		ArtsStudent s6=new ArtsStudent("F",94);
		
		Vector v=new Vector();
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		v.addElement(s4);
		v.addElement(s5);
		v.addElement(s6);
		
		ArtsStudent A[]=new ArtsStudent[10];
		ScienceStudent S[]=new ScienceStudent[10];
		Student stud;
		int i,j,k,l;
		j=0;k=0;l=0;
		//Student St=v.elementAt(i);
		for(i=0;i<v.size();i++)
		{
			stud=(Student)v.elementAt(i);
			if(stud.sub.equals("arts"))
			{
				A[l]=(ArtsStudent)stud;
				l++;
			}	
			else if(stud.sub.equals("science"))
			{
				S[k]=(ScienceStudent)stud;
				k++;
			}
		}
		//ArtsStudent tempA;
		//ScienceStudent tempS;
		ArtsSort Ar=new ArtsSort(A,l); 
		ScienceSort Sc=new ScienceSort(S,k);
		Thread threadA=new Thread(Ar);
		threadA.start();
		Thread threadS=new Thread(Sc);
		threadS.start();	
	}
}
	
