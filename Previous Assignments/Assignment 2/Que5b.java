import java.util.*;
public class Que5b{
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		Set<Integer> a=new HashSet<Integer>();
        Set<Integer> b=new HashSet<Integer>();
        Set<Integer> universal=new HashSet<Integer>();
        
        universal.addAll(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of set A  ");
//size of a
		int n1=sc.nextInt();
        if(n1<=0)
          {
            while(n1<0)
            {
                System.out.println("Size of Set should be greater than or equal to 0 .Enter Again .");
                n1 = sc.nextInt();
            }

          }

		System.out.println("Enter the elements of Set A from Universe = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");

		for(int i=0;i<n1;i++)
		{
			int temp = sc.nextInt();
            while(temp < 0 || temp > 10) {
                System.out.println("Not from Universal Set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Enter a number between 0 and 10 ");
                temp = sc.nextInt();
            }
			a.add(temp);

		}

		System.out.println("Enter the size of set B  ");
//size of b
		int n2=sc.nextInt();
        if(n2<=0)
          {
            while(n2<0)
            {
                System.out.println("Size of Set should be greater than or equal to 0 .Enter Again .");
                n2 = sc.nextInt();
            }

          }
		System.out.println("Enter the elements of Set B from Universe = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}: ");

		for(int i=0;i<n2;i++)
		{
			int temp = sc.nextInt();
            while(temp < 0 || temp > 10) {
                System.out.println("Not from Universal Set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Enter a number between 0 and 10 ");
                temp = sc.nextInt();
            }
			b.add(temp);

		}
        System.out.println("");
		Set<Integer> uni_ans=new HashSet<Integer>(a);
        uni_ans.addAll(b);
        System.out.println("Union of Set A and Set B is  "+uni_ans);
         //System.out.println(" ");
        
        Set<Integer> int_ans= new HashSet<Integer>(a);
        int_ans.retainAll(b);
        System.out.println("Intersection of Set A and Set B is "+int_ans);
        //System.out.println(" ");
        
        Set<Integer> comp_a= new HashSet<Integer>(universal);
        comp_a.removeAll(a);
        System.out.println("Complement of Set A is: "+comp_a);
       // System.out.println(" ");

        Set<Integer> comp_b= new HashSet<Integer>(universal);
        comp_b.removeAll(b);
        System.out.println("Complement of Set B is "+comp_b);
        System.out.println(" ");


		 long end = System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" milliseconds");
	}
}