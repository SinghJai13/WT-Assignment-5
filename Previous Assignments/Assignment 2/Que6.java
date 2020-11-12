import java.util.Scanner;
public class Que5{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number for which the Hailstorm Sequence  needs to printed ");
		long n=sc.nextInt();

		if(n<=0)
		{
			System.out.println("Hailstorm Sequence not Possible for 0 or Negative Intgers ");

			return;
		}
		while(n!=1&&n>0)
		{
			System.out.print(n+" ");
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=n*3+1;
			}
		}
		if(n==1)
		{
			System.out.print(1+".");
		}
		else
		{
			System.out.print("Not Possible ");
		}


	}
}