import java.util.Scanner;

public class Eight282A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		
		for(int i=0; i<n; i++) {
			if(sc.next().charAt(1)=='+')
				x++;
			else
				x--;

		}
		System.out.println(x);
	}
}