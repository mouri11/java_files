/* take command line strings and sort them
 */
class SortString
{
	public static void main(String[]args)
	{
		/*String a[]=new String[args.length];
		int l=0;
		while(l<args.length){
			a[l]=args[l];
		}
		//System.out.println(a.length());*/
		for(int i=args.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(args[j].compareTo(args[j+1])>0){
					String temp=args[j];
					args[j]=args[j+1];
					args[j+1]=temp;
				}
			}
		}
		for(int i=0;i<args.length;i++)System.out.println(args[i]+" ");
		System.out.println();
	}
}
