package educatiio;
class File{
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void add(double num1,double num2) {
		System.out.println(num1+num2);
	}
}
public class Methodoverkoading {
public static void main(String[] args) {
	File obj=new File();
	obj.add(4,6 );
	obj.add(2.4,4.2);
}
}
