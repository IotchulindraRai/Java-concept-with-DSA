package educatiio;
@functionalInterface

interface Chulin{
	 void cin(); 
	 
		default void show() {
			System.out.println("in interface");
		}
	}

  class Ram implements Chulin{
	 public void ceb(){
		System.out.println("In ceb");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In method overridding");
	}

	
}
public class DefaultMethodinterface {
public static void main(String[] args) {
	Chulin obj =new Ram();
	obj.show();
}
}
