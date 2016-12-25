/*To use try and catch block
*/
public class Excp1
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
	}
}
