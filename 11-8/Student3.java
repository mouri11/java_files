public class Student3
{
	String name;
	int roll;
	int marks1,marks2,marks3;
	float perc;
	void input(String name,int roll,int marks1,int marks2,int marks3)
	{
		this.name=name;
		this.roll=roll;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	void percent()
	{
		perc=(marks1+marks2+marks3)/3.0f;
	}
	void display()
	{
		System.out.println(name+" ("+roll+"): Marks1="+marks1+", Marks2="+marks2+", Marks3="+marks3+".");
	}
}
