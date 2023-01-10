package educatiio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Stud implements Comparable<Stud>{
  
 int roll, marks;
 String name;
    public Stud(int roll,String name, int marks) {
        super();
        
        this.roll=roll;
        this.name=name;
        this.marks=marks;
        // TODO Auto-generated constructor stub
    }

    @Override
    public int compareTo(Stud s) {
        return marks>s.marks?1:-1;
    }

    @Override
    public String toString() {
        return "Stud [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
    }
}

public class ComparableInterface  {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    List<Stud> studs=new ArrayList<>();
    studs.add(new Stud(23,"Chulindra",88));
    studs.add(new Stud(21,"Soniya",95));
    studs.add(new Stud(22,"Elpa",85));
    studs.add(new Stud(24,"Haruka",92));
    Collections.sort( studs);
    for (Stud s: studs) {
        System.out.println(s);
    }
    }

}
