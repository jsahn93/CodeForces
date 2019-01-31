import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		//Codeforces 520A
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = scanner.next();

		System.out.println(isPangram(str)?"YES":"NO");

		
		

	}

	static boolean isPangram(String inp) {
			int cnt=0;
			int alph[] = new int[58];
			for(int i=0; i<58; i++) {
				alph[i] = 0;
			}

			for(int i=0; i<inp.length(); i++) {
				for(int j=0; j<58; j++) {
					if((int)inp.charAt(i) == j+65) {
						alph[j] = 1;
					}
				}
			}

			for(int i=0; i<58; i++) {
				cnt += alph[i];
//				System.out.print( (char)(i+65)+": " + alph[i] + ", ");
			}
//			System.out.print("\n"+cnt+"\n");
			

			if(cnt>=26) {
				return true;
			} else {
				return false;
		}
	}

}

