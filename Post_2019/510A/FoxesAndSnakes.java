import java.util.Scanner;

public class FoxesAndSnakes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		for(int i=1; i<=n; i++) {
			for (int j = 1; j <= m; j++) {
					System.out.print( (i%2 != 0) || (i%4==2 && j==m) || (i%4==0 && j==1)? "#" : "." );
				}
				System.out.println();
		}
/*
		for(int j=1; j<=n; j++) {
			// if line "j" is an odd number, print # n times
			if(j%2 != 0) {
				for(int i=0; i<m; i++ ){
					if(i==(m-1)) {
						System.out.println("#");
					} else {
						System.out.print("#");
					}
				}

			} else {
			// if line "j" is an even number and j%4 != 0, print . n-1 times and # as the final character
				if(j%4 != 0) {
					for(int i=0; i<m; i++) {
						if(i==(m-1)) {
							System.out.println("#"); 
						} else {
							System.out.print(".");
						}
					}

				} else {
				// if line "j" is an even number and j%4 == 0, print # n-1 times and . as the final character
					for(int i=0; i<m; i++) {
						if(i==0) {
							System.out.print("#");

						} else if (i==(m-1)){
							System.out.println(".");
						} else {
							System.out.print(".");
						}
					}
					
				}

			}

		}
*/
	}
}