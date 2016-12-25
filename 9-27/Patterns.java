class Patterns
{
	int pattern1(int n)
	{
		for(int i=1;i<=n;i++){
			int j=1;
			while(j<=i){
				System.out.print(" * ");
				j++;
			}
			System.out.println();
		}
		return 0;
	}
	int pattern2(int n)
	{
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>=0;j--)System.out.print("   ");
			for(int j=1;j<=i;j++)System.out.print(" * ");
			for(int j=i;j<i;j++)System.out.print(" * ");
			System.out.println();
		}
		return 0;
	}
	int pattern3(int n)
	{
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>=0;j--)System.out.print("   ");
			for(int j=1;j<=i;j++)System.out.print(" * ");
			for(int j=1;j<i;j++)System.out.print(" * ");
			System.out.println();
		}
		return 0;
	}
	int pattern4(int n)
	{
		for(int i=n;i>0;i--){
			for(int j=n-i;j>=0;j--)System.out.print("   ");
			for(int j=1;j<=i;j++)System.out.print(" * ");
			for(int j=1;j<i;j++)System.out.print(" * ");
			System.out.println();
		}
		return 0;
	}
	int pattern5(int n)
	{
		for(int i=n-1;i>0;i--){
			for(int j=n-i-1;j>=0;j--)System.out.print(" * ");
			for(int j=1;j<=i;j++)System.out.print("   ");
			for(int j=1;j<i;j++)System.out.print("   ");
			for(int j=n-i-1;j>=0;j--)System.out.print(" * ");
			System.out.println();
		}
		for(int j=1;j<=(2*n-1);j++)System.out.print(" * ");
		System.out.println();
		return 0;
	}
	public static void main(String[]args)
	{
		Patterns obj=new Patterns();
		obj.pattern1(5);
		obj.pattern2(5);
		obj.pattern3(5);
		obj.pattern5(5);
		obj.pattern4(5);
	}
}
