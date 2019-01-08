package section13;

public class WhileStringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="abcd";
		String reverse=" ";
		int i=string.length()-1;
		while(i>=0) {
			reverse=reverse+string.charAt(i);
			System.out.println(string.charAt(i));
			i--;
		}

	}

}
