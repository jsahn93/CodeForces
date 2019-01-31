import java.util.Scanner;

public class GravityFlip {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int tmp;
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}

		// sort in order
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
