import java.util.Scanner;

public class Dragons {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int n = scan.nextInt();
		int tmp = 0;
		int drag[][] = new int[n][2];

		for(int i=0; i<n; i++) {
			drag[i][0] = scan.nextInt();
			drag[i][1] = scan.nextInt();
			}

			if(s > drag[i][0])
				s += drag[i][1];
			else {
				tmp = drag[i][1];
				break;
			}
		}

		System.out.println(s>tmp?"YES":"NO");
	}
}