import java.util.Scanner;

class Q1 extends Thread{

	public void run(){
		long start = System.currentTimeMillis();
		

		for(int count=1;count<=100;count++){
			if(count%10==0&&count>=10)
			{
				System.out.println(" value of count: "+count);
			}

			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{

			}
		}
		System.out.println("Time elapsed in seconds:");
		System.out.println((System.currentTimeMillis()-start)/1000);



	}
	public static void main(String[] args) {
		Q1 th= new Q1();

		th.start();
	}
}