package educatiio;

public class ThreadParity {

	public static void main(String[] args) throws Exception{
		
		
		
		
		// TODO Auto-generated method stub
Thread th1=new Thread( () ->
{
	for(int i=0;i<=5;i++) {
		System.out.println("Chulindra");
		try {Thread.sleep(1000);}
		catch(Exception e) {}
		
	}
	
}
		);
Thread th2=new Thread( () ->
		{
		
		for(int i=0;i<=5;i++) {
			System.err.println("Haruka");
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
		}
		
		);
th1.setPriority(Thread.MAX_PRIORITY);
th2.setPriority(Thread.MIN_PRIORITY);
System.out.println(th1.getPriority());
System.out.println(th2.getPriority());
/*
th1.setName("Hi thread");
th2.setName("Hlow thread");
System.out.println(th1.getName());
System.out.println(th2.getName());
*/
th1.start();

System.out.println(th1.isAlive());
{
	try {Thread.sleep(10);}
	catch(Exception e) {}
}
th2.start();
th1.join();
th2.join();

	System.out.println("good");
	
	}

}
