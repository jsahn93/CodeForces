import java.util.Scanner;

public class BearBigBro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt=0;
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		while(true) {
			a = a*3;
			b = b*2;
			cnt++;
			if(a>b) {
				System.out.println(cnt);
				break;
			}
		}
		
	}
}
