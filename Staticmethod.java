package educatiio;
@functionalInterface
interface Foor{
	
	void sho();
	static void show(){
		System.out.println("I am Shownform interface class");
		
	}
}
  abstract class Fet implements Foor{
	
	public void show() {
	
	}

	
}
public class Staticmethod {
public static void main(String[] args) {
	Foor.show();
}
}
