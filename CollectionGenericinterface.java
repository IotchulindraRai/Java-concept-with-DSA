package educatiio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionGenericinterface {
public static void main(String[] args) {
Collection<Integer> values= new ArrayList<Integer>();
values.add(3);
values.add(5);
values.add(7);
Iterator  it=values.iterator();
while (it.hasNext()) {
System.out.println(it.next());

}

System.out.println(values);
}
}
