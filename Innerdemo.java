package educatiio;

class Outter{
	static int wed;
	public static void show () {
		System.out.println("Chulindra ❤️ Soniya Yonzan");
		
	 }
	static class Inner{
		public void display() {
			System.out.println(" Yoiu shoudl remember it ok");
		}
	}
}

public class Innerdemo {
public static void main(String[] args) {
	Outter obj=new Outter();
	Outter.show();
Outter.Inner obj1=  new Outter.Inner();
obj1.display();
	
}
}