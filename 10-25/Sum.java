/* to take 2 integers from command line and find sum, largest and smallest among them.
 */
class Sum
{
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is "+sum+".");
		if(a>b)System.out.println(a+" is larger than "+b+".");
		else System.out.println(b+" is larger than "+a+".");
}
}
