import java.util.Scanner;

public class AmusingJoke{
	public static void main(String[] args) {
		//Codeforces 228A
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String c = scanner.nextLine();

		String d = sort(a+b);
		String prod = sort(c);

		System.out.println(d.equals(prod)?"YES":"NO");
	}

	static String sort(String str) {

		char[] arr = str.toCharArray();
		char tmp;

		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				if((j+1)==str.length())
					break;
				if(arr[j]>arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		return new String(arr);
	}
}