import java.util.*;
class Reverse
{
	int rev(int n)
	{
		int s=0;
		while(n!=0){
			int r=n%10;
			s=s*10+r;
			n/=10;
		}
		return s;

	}
	public static void main(String[]args)
	{
		Reverse obj=new Reverse();
		System.out.println("The reverse of 1234567 is:");
		System.out.println(obj.rev(1234567));
	}
}
