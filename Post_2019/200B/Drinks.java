import java.util.Scanner;

public class Drinks {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();
		double p = 0;

		for(int i=0; i<n; i++) {
			p += scan.nextInt();
		}
		System.out.println(p/n);
	}
}