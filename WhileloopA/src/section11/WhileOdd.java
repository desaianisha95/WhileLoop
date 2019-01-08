package section11;

public class WhileOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,4,5,7,8,9};
		int i=0;
		while(i<array.length) {
			if(array[i]%2!=0)
				System.out.println(array[i]);
				i++;
		}

	}

}
