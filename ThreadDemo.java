

class Sample extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		String s = t.getName();
		System.out.println(s);
		for(int i=0; i<10; i++)
		{
			System.out.println(""+s+"is saying"+"Cyber Success");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample t1 = new Sample();
		t1.start();
		t1.setName("First");
				
		Sample t2 = new Sample ();
		t2.setName("second");
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("This statement Error");
		}
			System.out.println("Good night");
		
}
}