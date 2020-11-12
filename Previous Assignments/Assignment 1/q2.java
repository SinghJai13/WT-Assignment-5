import java.util.*;
public class q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  paragraph :- ");
		
		String par=sc.nextLine();
		
		System.out.println("Enter size of vect: ");
		
		int vect_Size=sc.nextInt();
		
		HashSet<String> vect=new HashSet<String>();
		
		System.out.println("Enter "+vect_Size+" Strings:");
		
		for(int i=0;i<vect_Size;i++)
		{
			String str=sc.next();
			vect.add(str);
		}
		
		sc.close();
		
		int n=par.length();
		
		int current=0;
		
		System.out.println("paragraph after formatting:");
		
		String new_para="";
		
		while(current<n)
		{
			String s="";
			while(current<n && par.charAt(current)!=' ')
			{
				s+=par.charAt(current);
				current++;
			}
			if(vect.contains(s))
			{
				new_para+=s.charAt(0);
				for(int i=1;i<s.length();i++)
				{
					new_para+='*';
				}
			}
			else
			{
				new_para+=s;
			}
			if(current<n && par.charAt(current)==' ')
			{
				new_para+=" ";
			}
			current++;
		}
		
		System.out.println(new_para);
	}

}
