package educatiio;
class Good{
	public int add(int...n) {
		int sum =0;
		for (int k:n) {
			sum=sum+k;
		}
		System.out.print("sum");
		return sum;
	}
}
public class Varargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Good Beel=new Good();
          System.out.println(Beel.add(3,5,4,6,8,9 ,3));
	}

}
