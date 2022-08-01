import java.util.HashSet;
import java.util.Set;

public class teli {
	public static void main(String[] args) {
		int []a= {20,45,14,20,45,1,3,5,55,3};
		Set<Integer>s=new HashSet<Integer>();
		for(int num:a) {
			if(s.add(num)==false) {
				System.out.println(num);
			}
		}
		
	}
}
