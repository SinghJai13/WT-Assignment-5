import java.util.Scanner;


public class Que4{
	public static void main(String[] args) {
		long  n=Integer.MAX_VALUE;

		while(n>=0)
		{
			double sum_till_n=(n*(n+1))/2;

			if(sum_till_n==n*n)
			{
				System.out.println("The Number is "+n );
				break;
			}
			n--;
		}


	}
}