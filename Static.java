package educatiio;
class Saa{
	int eid;
	int salary;
  static String ceo;
	public void show() {
		System.out.println(eid+" :"+salary+": "+ ceo);
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Saa chulin =new Saa();
chulin.eid=3;
chulin.salary=222322;
Saa.ceo="Ram";

Saa salman= new Saa();
salman.eid=4;
salman.salary=233233;
Saa.ceo="Akash";
Saa.ceo="Elpa";
chulin.show();
salman.show();

	}

}
