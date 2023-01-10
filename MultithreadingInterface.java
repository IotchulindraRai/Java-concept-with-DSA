package educatiio;
@functionalInterface
class Aat implements  Runnable{
	public void Run() {
		for(int i =1;i<=5;i++)
		{
			System.out.println("1");
	try {Thread.sleep(1000);}catch(Exception e) {}
		
		}
		}

	

	}

 class Bat implements Runnable{
	public void Run() {
		for(int i =1;i<=5;i++)
		{
			System.out.println("2");
	try {	Thread.sleep(1000);}
	catch(Exception e) {}
		}
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

	}
	

public class MultithreadingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Runnable obj1 =new Aat();
		Runnable obj2=new Bat();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try {Thread.sleep(1000);
		}catch(Exception e) {}
	t2.start();
		
	}

}
