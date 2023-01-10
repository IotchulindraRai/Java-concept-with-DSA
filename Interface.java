package educatiio;
interface Abc{
	void show();
}
class  Gift implements Abc{
	public  void show(){
		
		System.out.println("Hi iam Chulindra  Rai");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc obj= new Gift();
obj.show();
	}

}
