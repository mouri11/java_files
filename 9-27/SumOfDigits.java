class SumOfDigits
{
	int sum(int n)
	{
		int sum=0;
		while(n!=0){
			int r=n%10;
			sum+=r;
			n/=10;
		}
		return sum;

	}
	public static void main(String[]args)
	{
		SumOfDigits obj=new SumOfDigits();
		System.out.println("The sum of digits for 1234567 is::");
		System.out.println(obj.sum(1234567));
	}
}
