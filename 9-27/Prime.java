class Prime
{
	boolean isPrime(int n)
	{
		int d=n/2;
		if(n==0 || n==1)return false;
		for(int i=2;i<=d;i++){
			if(n%i==0){
				return false;
			}			
		}
		return true;
	}
	public static void main(String[]args)
	{
		Prime obj=new Prime();
		System.out.println("The prime nos are:");
		for(int i=1;i<=100;i++){
			if(obj.isPrime(i))System.out.print(i+" ");
		}
		System.out.println();
	}
}
