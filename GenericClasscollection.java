package educatiio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericClasscollection {
	public static void main(String[] args) {
List<Integer>  values=new ArrayList<Integer>();
values.add(224);
values.add(322);
values.add(643);
values.add(657);
Collections.sort(values);
Collections.reverse(values);
Collections.shuffle(values);
for(int i=0;i<=values.size();i++)
{
	System.out.println(values.get(i));
}
}
}