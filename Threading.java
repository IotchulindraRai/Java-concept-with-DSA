package com.chulin;
class A extends Thread{
	public void run(){
		for(int i = 0;i<5;i++) {
			System.out.println(" Chulindra Rai ❤️");
			try{Thread.sleep(1000);
			} catch(Exception e) {
				
		}
			
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(" Soniya Yonzan");
		try {	Thread.sleep(1000);
		}
		
		catch(Exception e){
	}
}
	}
}
public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
	


		obj1.start();
		
		try {Thread.sleep(103);}
		catch(Exception e) {}
		
		obj2.start();

	}
	}



