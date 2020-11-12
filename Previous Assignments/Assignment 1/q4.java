import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class q4{
	public static boolean ana(String str1,String str2)
	{
		if(str1.length()!=str2.length())return false;
		 
		 int a[];
		 a=new int[256];

		for(int i=0;i<str1.length();i++)
		{
			a[str1.charAt(i)]++;
		}
		for(int i=0;i<str2.length();i++)
		{
			if(a[str2.charAt(i)]<=0)
			{
				return false;
			}
			a[str2.charAt(i)]--;
		}

		return true;

		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter  string  1  :- ");

		String str1=sc.nextLine();

		System.out.println("enter  string  2  :- ");
		
		String str2=sc.nextLine();
		
		System.out.print("The strings are   ");
		boolean k=ana(str1,str2);

		if(k==true)
		{
			System.out.print("Anagrams ");
		}
		else
		{
			System.out.print(" not Anagrams ");
		}
		
	}
}