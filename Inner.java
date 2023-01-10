package educatiio;
class Outer{
	int a;
	public  static void show() {
		
	}
	static class Inner{

		public void display() {
			System.out.println("in static by chulindra rai");
		}
	}
}
public class Inner {

	public static void main(String[] args) {
		Outer obj =new Outer();
		Outer.show();
Outer.Inner obj1= new Outer.Inner();
obj1.display();

	}
	}


