import java.util.Scanner;

public class XeniaRingroad {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] tsk = new int[m];
		int a = 1;
		int time = 0;

		for(int i=1; i<=m; i++) {
			if(m[i]>=a) {
				time += m[i]-a;
			} else {
				time += a+m[i]-n;
			}
			a = m[i];
		}

		System.out.println(a);

	}
}