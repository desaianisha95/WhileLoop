package section10;

public class WhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int sum=0;
		int i=0;
		while(i<a.length) {
			sum=sum +a[i];
			
			i++;
		}
		System.out.println(sum);

	}

}
