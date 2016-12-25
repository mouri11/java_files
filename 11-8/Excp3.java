/*To use try,catch and finally
*/
public class Excp3
{
	public static void main(String[]args)
	{
		int arr[]={0,1,2,3,4};
		try{
			System.out.println(arr[5]);
		}
		catch(Exception e){
			System.out.println("Exception thrown!!");
		}
		finally{
			System.out.println("Finally executed!!");
		}
	}
}
