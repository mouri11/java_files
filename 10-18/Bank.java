/*To design a class representing a bank account. The class should have the following data members:
->a/c no. ->customer id ->balance amt
The class should have the following data members
->to initialize initial value ->to deposit amt ->to withdraw amt ->to display customer id, a/c no. and current balance 
 */
import java.util.*;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	static long acno;
	static double amt;
	static String id;
	private void init()
	{
		acno=0;
		amt=0.0;
		id="";
	}
	private double deposit(double d)
	{
		return amt+=d;
	}
	private double withdraw(double d)
	{
		if(d<amt&&amt!=0)return amt-=d;
		else {
		    System.out.println("Not Enough Balance!!");
		    return amt;
		}
	}
	private void print()
	{
		System.out.println("Customer ID \t A/c No. \t Current Balance");
		System.out.println(id+"\t \t "+acno+"\t \t "+amt);
	}
	public static void main(String[]args)
	{
		Bank obj=new Bank();
		obj.init();
		System.out.println("Enter account no and current balance:");
		id="3000114022";
		acno=sc.nextLong();
		amt=sc.nextDouble();
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
