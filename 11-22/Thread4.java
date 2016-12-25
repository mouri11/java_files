/*Take some integers as input using command line arguments. Now create two threads in your
 * program. The first willsort the integers in ascending order, and the second one will sort in
 * descending order and show them.
 */
class SortA extends Thread
{
    int n;
    int a[];
    SortA(int arr[])
    {
	n=arr.length;
	a=new int[n];
	for(int i=0;i<n;i++)a[i]=arr[i];
    }
    void sorta()
    {
	for(int i=a.length-1;i>=0;i--){
	    for(int j=0;j<i;j++){
		if(a[j]>a[j+1]){
		    int temp=a[j];
		    a[j]=a[j+1];
		    a[j+1]=temp;
		}
	    }
	}
    }
    void show()
    {
	System.out.println("Sorting in ascending order:");
	for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");
	System.out.println();
    }
    public void run()
    {
	sorta();
	show();
    }
}
class SortD extends Thread
{
    int n;
    int a[];
    SortD(int arr[])
    {
	n=arr.length;
	a=new int[n];
	for(int i=0;i<arr.length;i++)a[i]=arr[i];
    }
    void sortd()
    {
	for(int i=a.length-1;i>=0;i--){
	    for(int j=0;j<i;j++){
		if(a[j]<a[j+1]){
		    int temp=a[j];
		    a[j]=a[j+1];
		    a[j+1]=temp;
		}
	    }
	}
    }
    void show()
    {
    	System.out.println("Sorting in descending order:");
	for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");
	System.out.println();
 
    }
    public void run()
    {
	sortd();
	show();
    }
}
class Test3
{
    public static void main(String[]args)
    {
	int arr[]=new int[args.length];
	for(int i=0;i<arr.length;i++){
	    arr[i]=Integer.parseInt(args[i]);
	}
	SortA a=new SortA(arr);
	a.start();
	SortD b=new SortD(arr);
	b.start();
    }
}
