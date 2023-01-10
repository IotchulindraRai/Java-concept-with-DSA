package educatiio;
class Calc{
	public int add(int a,int b) {
		return a+b;
	}
}
	class Firstcal extends Calc{
		public int sub(int a, int b) {
			return a-b;
		}
	}
		class Calcvy extends Firstcal{
			
			public int mult(int a,int b) {
				return a*b;
			}
		
	}

public class Inheratance {
public static void main (String[] args) {
	Calcvy obj= new Calcvy();
	int result1=obj.add(7, 4);
	int result2=obj.sub(7,3);
	int result3=obj.mult(9,5);
	System.out.println (result1);
	System.out.println(result2);
	System.out.println(result3);
}
}
