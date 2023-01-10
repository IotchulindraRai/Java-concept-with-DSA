package educatiio;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@SuppressWarnings("unused")
public class userinputbuffer 
 {
public static void main(String[] args)  

{
	int n=0;
	System.out.println("Enter a anumber");
	
	BufferedReader br= null;
	
	try {
		br=	new BufferedReader(new InputStreamReader(System.in));
	 n = Integer.parseInt(br.readLine());
	
	 
	}
	catch(Exception e) {
	System.out.println(e);
}
	finally {
		try {
			br.close();
			System.out.println("closed");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			System.out.println("heh "+n);
		
		
	}
}
 }
 
