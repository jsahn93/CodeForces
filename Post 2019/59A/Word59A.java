import java.util.Scanner;

public class Word59A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int up=0;
		int un=0;

		for(int i=0; i<s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) up++;
			else un++; 
		}

		if(up>un)
			System.out.println(s.toUpperCase());
		else if(un>=up)
			System.out.println(s.toLowerCase());
		
		


	}
}
