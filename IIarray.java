package educatiio;

public class IIarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,2,3,4};
  int b[]= {9,8,7,5};
   int c[]= {3,4,5,6};
   
  int d[][]= {{1,2,3,4},
             {9,8,7},
             {3,4,5,6}
           };
 for(int i=0;i<d.length;i++) {
	 for(int j=0;j<d[i].length;j++) {
	System.out.print(d[i][j]);
	 }
	 System.out.println();
 }
	}}
