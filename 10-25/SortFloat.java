/*to take command line float numbers and sort them
 */
class SortFloat
{
	public static void main(String[]args)
	{
		float a[]=new float[args.length];
		int l=0;
		while(l<args.length){
			a[l]=Float.parseFloat(args[l++]);
		}
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					float temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)System.out.println(a[i]+" ");
		System.out.println();
	}
}
