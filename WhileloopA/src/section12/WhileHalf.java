package section12;

public class WhileHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int i=arr.length/2-1+1;
		while(i<=arr.length-1) {
			System.out.println(arr[i]);
			i++;
		}

	}

}
