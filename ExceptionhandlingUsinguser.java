package educatiio;

public class ExceptionhandlingUsinguser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a1=0;
int b1=1;

try {
	int r=a1/b1;
	if(r==0) 
		
	throw new ChulinException("i am Sorry");
	System.out.println(r);
	
}
catch(ChulinException e) {
	

System.out.println("Bye " + e.getMessage());
	}

}
}
