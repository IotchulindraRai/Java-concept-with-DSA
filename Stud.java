package educatiio;

public class Stud implements Comparable<Stud>{
 int roll, marks;
 String name;
	public Stud(int roll,String name, int marks) {
		super();
		
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		// TODO Auto-generated constructor stub
		
		
	@Override
	public String toString() {
		return "Stud [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}

}
public int comapareTo(Stud s)
{
	return name.length()<s.name.length()?1:-1;
}}