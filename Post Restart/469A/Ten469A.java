import java.util.*;

public class Ten469A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			set.add(sc.nextInt());
		}
		
		int b = sc.nextInt();
		for(int i=0; i<b; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set.size()==n? "I become the guy." : "Oh, my keyboard!");

	}
}
