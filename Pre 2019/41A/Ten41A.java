import java.util.Scanner;

public class Ten41A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.next();
		String in2 = sc.next();

		System.out.println(new StringBuilder(in1).reverse().toString().equals(in2) ? "YES" : "NO");	
		
	}
}
