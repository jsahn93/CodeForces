import java.util.Scanner;

public class Magnets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int set=0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}

		for(int i=0; i<n; i++) {

			if( (i-1)>=0 && arr[i] == arr[i-1]) {
				continue;
			} else {
				set++;
			}
		}

		System.out.println(set);

	}
}
