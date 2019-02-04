import java.util.Scanner;

public class IQTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int dif[] = new int[n];
		int even = 0;

		for(int i=0; i<n; i++) {
			dif[i] = scan.nextInt();
			if(dif[i]%2 == 0) {
				even++;
			} else {
				even--;
			}
		}

		if(even>0) {
			for(int i=0; i<n; i++) {
				if(dif[i]%2==1) {
					System.out.println(i+1);
					break;
				}
			}
		} else {
			for(int i=0; i<n; i++) {
				if(dif[i]%2==0) {
					System.out.println(i+1);
					break;
				}
			}
		}
		

	}
}
