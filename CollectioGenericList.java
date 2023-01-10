package educatiio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectioGenericList {

public static void main(String[] args) {
	List<Integer>  values=new ArrayList<Integer>();
	
	values.add(3);
	
	
	values.add(2);
	
	values.add(5);
	
	values.add(2,2);
	
	Collections.sort(values);
	 for(int i=0;i<values.size();i++) 
	
	{
		System.out.println(values.get(i));
	}
	
	}
}

