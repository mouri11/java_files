/* to take command line integers and sort them 
*/
class Sort
{
	public static void main(String[]args)
	{
		int a[]=new int[args.length];
		int l=0;
		while(l<args.length){
			a[l]=Integer.parseInt(args[l++]);
		}
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)System.out.println(a[i]+" ");
		System.out.println();
	}
}
