import java.util.Scanner;

public class AntonLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().replaceAll("[{}, ]","");
		int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0};
		int count=0;

		for(int i=0; i<text.length(); i++) {
			if( ((int)text.charAt(i)>=97 || (int)text.charAt(i)<=123) && arr[(int)text.charAt(i)-97] != 1) {
				arr[(int)text.charAt(i)-97] = 1;
			}
		}
		
		for(int i=0; i<26; i++) {
			count += arr[i];
		}
		System.out.println(count);
	}
}
