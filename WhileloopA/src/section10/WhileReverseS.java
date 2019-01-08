package section10;

public class WhileReverseS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abcd";
		String reverse= "";
		int i=string.length()-1;
		while(i>=0) {
			reverse=reverse+string.charAt(i);
			
			i--;
			
			
			
		}
		System.out.println(reverse);
		
		
		

	}

}
