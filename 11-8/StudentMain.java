/* Not complete
 */
import java.util.*;
public class StudentMain
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Student3 arr[]=new Student3[3];
		for(int i=0;i<3;i++){
			arr[i]=new Student3();
			System.out.println("Enter name and roll:");
			String name=sc.next();
			int roll=sc.nextInt();
			System.out.println("Enter marks in sub1,sub2 and sub3:");
			int marks1=sc.nextInt();
			int marks2=sc.nextInt();
			int marks3=sc.nextInt();
			arr[i].input(name,roll,marks1,marks2,marks3);
		}
		for(int i=0;i<arr.length;i++)arr[i].display();
		String choice=args[0];
		if(choice.equals("Sub1")){
			for(int i=arr.length-1;i>0;i--){
				for(int j=0;j<i;j++){
					if(arr[j].marks1>arr[j+1].marks1){
					Student3 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)arr[i].display();
		}
		else if(choice.equals("Sub2")){
			for(int i=arr.length-1;i>0;i--){
				for(int j=0;j<i;j++){
					if(arr[j].marks2>arr[j+1].marks2){
					Student3 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)arr[i].display();
		}
		else if(choice.equals("Sub3")){
			for(int i=arr.length-1;i>0;i--){
				for(int j=0;j<i;j++){
					if(arr[j].marks3>arr[j+1].marks3){
					Student3 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)arr[i].display();
		}
		else if(choice.equals("Percent")){
			for(int i=arr.length-1;i>0;i--){
				for(int j=0;j<i;j++){
					if(arr[j].perc>arr[j+1].perc){
					Student3 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)arr[i].display();
		}
		else System.out.println("Thank you!!");
	}
}
