import java.util.Scanner;

public class Eight451A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.min(sc.nextInt(), sc.nextInt())%2==0?"Malvika":"Akshat");
	}
}
