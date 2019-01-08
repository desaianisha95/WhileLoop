package section15;

public class WhileMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {1,2,3};
		int a2[] = {4,5,6};
		int a3[] = new int[a1.length+a2.length];
		int index =0;
		int i=0;
		while(i<a1.length) {
			a3[index]=a1[i];			
			i++;
			index++;
			
		}
		int j=0;
		while(j<a2.length) {
			a3[index]=a2[j];			
			j++;
			index++;
			

	}
		int k=0;
		while(k<a3.length) {
			System.out.println(a3[k]);
			k++;
		}
			
		}

}
