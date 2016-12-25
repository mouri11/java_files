/*To use try, multiple catch and finally
*/
public class Excp4
{
	public static void main(String[]args)
	{
		int arr[]={0,1,2,3,4};
		try{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds!!");
		}
		catch(Exception e){
			System.out.println(" Main Exception thrown!!");
		}
	}
}
