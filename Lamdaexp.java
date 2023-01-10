package educatiio;

public class Lamdaexp {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

Thread t1=new Thread(()->
{
		for(int i=1;i<=5;i++)
		{
	System.err.println("Chulindra love Haruka");
	try {Thread.sleep(1000);
	}
	catch(Exception e) {}
		}
		});
Thread t2=new Thread(() ->
{
		for(int i=1;i<=5;i++) {
			System.out.println("❤️ between them is like a Romieo and juiet love ");
			try {Thread.sleep(1000);
			
			}
			catch(Exception e) {}}
});
t1.start();
try {Thread.sleep(10);}
catch(Exception e) {}
t2.start();
	}

}


