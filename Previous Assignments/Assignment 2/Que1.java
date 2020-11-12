import java.util.Scanner;

public class Que1{

	public static  void longer(String str1,String str2){
		int sum_of_str1=0;
		int sum_of_str2=0;

		for(int i=0;i<str1.length();i++)
		{
			sum_of_str1+=(int)(str1.charAt(i));


		}
		for(int i=0;i<str2.length();i++)
		{
			sum_of_str2+=(int)(str2.charAt(i));


		}

		if(sum_of_str1==sum_of_str2)
		{
			System.out.println("Strings are lexicographically equal .");
			return;
		}

		if(sum_of_str1>sum_of_str2)
		{
			System.out.println("String 1 is lexicographically greater than String 2.");
			return;
		}
		System.out.println("String 2 is lexicographically greater than String 1 .");
		return ;

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string 1   :- ");

		String str1=sc.nextLine();

		System.out.println("enter the string 2 :- ");
		
		String str2=sc.nextLine();
		longer(str1,str2);

}
}