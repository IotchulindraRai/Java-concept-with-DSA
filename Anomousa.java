package educatiio;


	 class W
	  {
	 public void show() {
			System.out.println("hi i am chulindra");
		}
	 
	  }

	  class E  extends W{
			public   void show() {
				  System.out.println("I love haruka");
			  }
		  }
	  
	public class Anomousa {
	public static void mainn(String[] args) {
	W obj=new E();
		obj.show();
	}
	}
