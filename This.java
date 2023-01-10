package educatiio;
class cv{
	int num1;
	int num2;
	int res;
	public cv( int num1,int num2) {
		this.num1= num1; //current object / current instance
		this.num2=num2;
		res=num1+num2;
	}
}
public class This {
public static void main (String[] args) {
	cv obj=new cv(4,3);
	System.out.println(obj.res);
}
}
