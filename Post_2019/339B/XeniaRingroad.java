import java.util.Scanner;

public class XeniaRingroad {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long tsk[] = new long[(int)m];
		long a = 1;
		long time = 0;

		int tmp;

		for(int i=0; i<m; i++) {
			tsk[i] = scan.nextInt();
		}

		for(int i=0; i<m; i++) {
			if(tsk[i] >= a) {
				time += tsk[i] - a;
			}
			else {
				time += n - a + tsk[i];
			}
			a = tsk[i];
		}

		System.out.println(time);

	}
}