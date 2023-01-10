package educatiio;

public class MultithreadusingjoinandisAlive  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Thread th1=new Thread(  () ->
      {
		
		for (int i=0;i<=5;i++) {
			try {Thread.sleep(1000);
			}
			catch(Exception e) {}
			
				System.out.println("Chandra and Subash is Gay form Jain University");
			}
			
		
      });


Thread th2=new Thread(() ->
		{
			for (int i=0;i<=5;i++) {
			try {Thread.sleep(1000);
			}
			catch(Exception e) {}
		
		
			System.err.println("Chandra ❤️ Subash Gay");
			
		}
		});


   th1.start();
   /*System.out.println(th1.isAlive());
    * 
    */
   try {Thread.sleep(10);
	}
	catch(Exception e) {}
th2.start();
/*System.out.println(th1.isAlive());
 * 
 */
th1.join();
th2.join();

System.out.println(th1.isAlive());
System.out.println("Chulindra rai is hero");

	}
	

}
