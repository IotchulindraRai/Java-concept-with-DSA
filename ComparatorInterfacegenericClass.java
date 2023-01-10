package educatiio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacegenericClass {
public static void main(String[] args) {


	
List<Integer>  values=new ArrayList<Integer>();
values.add(224);
values.add(322);
values.add(643);
values.add(657);
Comparator<Integer> c= new Comparator<Integer>() {
	public int compare(Integer i,Integer j) {
		if(i%10>j%10)
			return 1;          /* return i%10>j%10?1:-1*/
			
		else
			return -1;
	}
};
Collections.sort(values,c);

for(Integer n : values)
{
	System.out.println(n);
}
}
}

