import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		//Codeforces 520A
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = scanner.next();

		if(n<26) {
			System.out.println("NO");
		} else {
			System.out.println(isPangram(str)?"YES":"NO");
		}

		
		

	}

	static boolean isPangram(String inp) {
			int cnt=0;
			// ascii 65-122 are alphabets, created array for each letter (ex: upperCase[0] = A, lowerCase[0] = a)
			// each index is initialized to 0
			int lowerCase[] = new int[26];
			int upperCase[] = new int[26];
			for(int i=0; i<26; i++) {
				lowerCase[i] = 0;
				upperCase[i] = 0;
			}

			// checks input string for letters. For each letter found, its respective index is set to 1
			for(int i=0; i<inp.length(); i++) {
				for(int j=0; j<26; j++) {
					if((int)inp.charAt(i) == j+65) {
						upperCase[j] = 1;
					} else if ((int)inp.charAt(i) == j+97){
						lowerCase[j] = 1;
					}

				}
			}

			//adds the values of each index.
			//note) A and a only counts as one
			for(int i=0; i<26; i++) {
				if(upperCase[i] == 1 && lowerCase[i] == 1)
					cnt += 1;
				else
					cnt += upperCase[i] + lowerCase[i];
//				System.out.print( (char)(i+65)+": " + upperCase[i] + ", ");
//				System.out.print( (char)(i+97)+": " + lowerCase[i] + ", ");
			}
//			System.out.print("\n"+cnt+"\n");
			

			if(cnt>=26) {
				return true;
			} else {
				return false;
		}
	}

}

