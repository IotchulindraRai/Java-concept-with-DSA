package educatiio;
class Student{
	private int rollno;
	private String name;
	
	public void setRoll(int r) {
		this.rollno=r;
		
	}
	public int getRollno() {
		return rollno;
		}


	public String getName() {
		return name;
	}
	public void setName(String s) {
		this.name=s;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Student obj =new Student();
		obj.setRoll(37);
		obj.setName("Chulin ❤️ someOne");
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
		
	}
	}