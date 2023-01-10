package educatiio;
class Abc{
	public void show(){
		System.out.println("Chulin");
			
		}
	

public class Anomous {
public static void mainn(String[] args) {
	Abc obj= new Abc() {
		public void show()
		{
		System.out.println("I am chulibndrarai");
		}
	};
	obj.show();
	
}
}}