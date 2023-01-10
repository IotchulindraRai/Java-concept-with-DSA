package educatiio;
class file{
	int num1;
	 int num2;
	 int num3;
	 int res;
	 int sub;
	 public void internet(){
		 res= num2+num1+num3;
		 sub= num3-num2+num1;
	 }
}
public class Object {
public static void main(String[] args) {
	file obj= new file();
	obj.num1=2;
	obj.num2=3;
	obj.num3=6;
	obj.internet();
	System.out.println(obj.res);
	System.out.println(obj.sub);
	
}
}
