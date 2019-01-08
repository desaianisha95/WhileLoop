package section12;

public class WhileHalfR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int i=a.length-1;
		while(i>=a.length/2) {
			System.out.println(a[i]);
			i--;
		}

	}

}
