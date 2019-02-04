import java.util.Scanner;

public class Hulk {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if(n==1) {
				System.out.println("I hate it");
		} else {
			StringBuffer sbuffer = new StringBuffer("hate ");
			for(int i=2; i<=n; i++) {
				

				sbuffer.append("that I ");
				if(i%2 == 0 ) {
					sbuffer.append("love ");
				} else {
					sbuffer.append("hate ");
				}
			}
			System.out.println("I " +sbuffer + "it");
		}

	}
}