package educatiio;
class t{
	
	int w;
	int count;
	public synchronized void increment() 
	{
		count++;
	}
}
public class Synchronizationthread {
public static void main(String[] args) throws Exception
 {
	t obj = new t();
	Thread th1=new Thread( new Runnable() 
		{ 
			public void run() {
				for ( int i =1;i<=5000;i++) 
				{
					obj.increment();
				}
			}}		
	);

	Thread th2=new Thread( new Runnable() 
		{ 
			public void run() {
				for ( int i =1;i<=1000;i++) 
				{
					obj.increment();
				}
			}}		
);
	th1.start();
	th2.start();
	
	th1.join();
	th2.join();
	System.out.println("Coun="+obj.count);
}
}
