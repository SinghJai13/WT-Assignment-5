import java.util.Scanner;

public class Que2{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int size_of_arr;

		 System.out.println("Enter the size of Array: ");
		  size_of_arr = sc.nextInt();
		  if(size_of_arr<=0)
		  {
		  	while(size_of_arr<0)
		  	{
			  	System.out.println("Size of array should be greater than or equal to 0 .Enter Again .");
			  	size_of_arr = sc.nextInt();
		  	}

		  }

		  int arr[];
		  arr= new int[size_of_arr];

		  int count[]=new int[21];

		  for(int it=0;it<21;it++)
		  {
		  	count[it]=0;
		  }

		  int temp=0;
		  System.out.println("Enter the elements of the array between 0 and 20 : ");

		  for(int i=0;i<size_of_arr;i++)
		  {
		  	temp=sc.nextInt();
		  	while(temp<0||temp>20)
		  	{
		  		System.out.println("Entered value is out of range.Please enter a value between 0 and 20 ");
		  		temp=sc.nextInt();
		  	}
		  	arr[i]=temp;

		  	count[arr[i]]++;
		  }

		  int cur_size=0;
		  for(int i=0;i<21;i++)
		  {
		  	if(count[i]==0)
		  	{
		  		continue;
		  	}
		  	else
		  	{
		  		for(int j=cur_size;j<cur_size+count[i];j++ )
		  		{
		  			arr[j]=i;
		  		}
		  		cur_size+=count[i];

		  	}
		  }


		  for(int i=0;i<size_of_arr;i++)
		  {
		  	System.out.print(arr[i]+" ");
		  }
	}
}