import java.util.Scanner;

public class four158A {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		int b=0;
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if(a[i]>=a[k-1]&&a[i]!=0) {
				b++;
			}
		}
		System.out.println(b);
		
	}
}
