import java.util.Scanner;

public class problem {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		
		System.out.println ( (long)((n+a-1)/a)*((m+a-1)/a));
	}
}
