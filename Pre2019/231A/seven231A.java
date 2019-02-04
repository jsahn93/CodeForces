import java.util.Scanner;

public class seven231A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		
		for (int i=0; i<n; i++) {
			if (sc.nextInt()+sc.nextInt()+sc.nextInt()>=2) {
				c++;
			}
		}
		System.out.println(c);
	}
}
