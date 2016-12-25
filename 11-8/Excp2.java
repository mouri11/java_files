/*To use try and finally
*/
public class Excp2
{
	public static void main(String[]args)
	{
		int arr[]={0,1,2,3,4};
		try{
			System.out.println(arr[5]);
		}
		finally{
			System.out.println("Finally executed!!");
		}
	}
}
