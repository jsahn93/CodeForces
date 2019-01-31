import java.util.Scanner;

public class VanyaFence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fen = scan.nextInt();

		int[] hei = new int[num];
		int len = 0;

		for(int i=0; i<num; i++) {
			hei[i] = scan.nextInt();
			if(hei[i]>fen) {
				len += 2;
			} else {
				len++;
			}
		}
		System.out.println(len);

	}
}
