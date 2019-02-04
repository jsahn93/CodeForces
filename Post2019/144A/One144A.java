import java.util.*;

public class One144A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 1, min = 100, p = 0, q = 0;
		int list[] = new int[n];
		
		for(int i=0; i<n; i++) {
			list[i] = sc.nextInt();
			
			if(list[i]>max) {
				max = list[i];
				p = i;
				
			}
			
			if(list[i]<=min) {
				min = list[i];
				q = i;
			}
		}
		
		System.out.println(p<q?p+n-q-1:p+n-q-2);
		
	}
}
