import java.util.Scanner;

public class Games {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][2];
		int count = 0;

		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}


		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==i)
					continue;
				if(arr[i][0]==arr[j][1])
					count++;
			}
		}
		System.out.println(count);
		
	}
}
