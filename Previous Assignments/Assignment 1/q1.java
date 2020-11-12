import java.util.Scanner;

public class q1{
	public static boolean are_all_0(int[] arr)
	{
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
	public static int occurrence(String str,String sub)
	{
		int ans=0;

		int strLen=str.length();
		int subLen=sub.length();

		if(strLen<subLen)
		{
			
			return 0;
		}
		int[] arr=new int[256];
		
		for(int i=0;i<subLen;i++)
		{
			arr[str.charAt(i)-'a']++;
			arr[sub.charAt(i)-'a']--;
		}
		if(are_all_0(arr))
		{
			ans++;
		}
		for(int i=subLen;i<strLen;i++)
		{
			arr[str.charAt(i-subLen)-'a']--;
			arr[str.charAt(i)-'a']++;
			if(are_all_0(arr))
				ans++;
		}
		return ans;	      
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string    :- ");

		String str=sc.nextLine();

		System.out.println("enter the sub :- ");
		
		String sub=sc.nextLine();
		System.out.println("Number of occurrence of sub in the string   = ");
		System.out.println(occurrence(str, sub));
		
	}
}