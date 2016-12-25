import java.util.*;
class Bank2
{
	static Scanner sc=new Scanner(System.in);
	static String name,bank,branch,acctype;
	static long balnc;
	private void init()
	{
		name=bank=branch=acctype="";
		balnc=0;
	}
	private double deposit(double d)
	{
		return balnc+=d;
	}
	private double withdraw(double d)
	{
		if(d>balnc){
			try{
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("Balance Insufficient!!");
			}
			return balnc;
		}
		else return balnc-=d;
	}
	private void print()
	{
		System.out.println("Customer Name: "+name+"\t Bank Name:"+bank+" \t Bank Branch:"+branch+" \t Account Type:"+acctype+" \t Current Balance:"+balnc);
	}
	public static void main(String[]args)
	{
		Bank2 obj=new Bank2();
		obj.init();
		System.out.println("Enter name,bank name, bank branch, account type and current balance:");
		name=sc.next();
		bank=sc.next();
		branch=sc.next();
		acctype=sc.next();
		balnc=sc.nextLong();
		double d=0.0;
		int choice=0;
		do{
			System.out.println("Main Menu");
			System.out.println("0. Deposit");
			System.out.println("1. Withdrawal");
			System.out.println("2. Print Statement");
			System.out.println("3. Exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice){
				case 0:d=0.0;
				       System.out.println("Enter amount to deposit:");
				       d=sc.nextDouble();
				       System.out.println("The deposit is "+d+". The current balance is "+(double)obj.deposit(d));
					break;
				case 1:d=0.0;
					System.out.println("Enter amount to withdraw:");
					d=sc.nextDouble();
					System.out.println("The withdrawal is "+d+". The current balance is "+(double)obj.withdraw(d));
				       break;
				case 2:obj.print();
					break;
				default:System.out.println("Thank you");
					break;		
			}
		}while(choice<3);
	}
}
